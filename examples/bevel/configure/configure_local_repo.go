package configure

import (
	"fmt"
	"os"

	"github.com/go-git/go-git/v5"
	"github.com/go-git/go-git/v5/plumbing/transport/http"
	"github.com/hyperledger/cacti/examples/bevel/utils"
	"go.uber.org/zap"
)

const (
	BevelRemoteUrl  = "https://github.com/hyperledger/bevel.git"
	BevelRemoteName = "BevelRemoteForCacti"
	BevelBranchName = "cactibevelexample"
)

func DownloadBevelRepo(gitUrl string, gitUsername string, gitToken string, logger *zap.Logger) {
	logger.Info("Deleting any previous instances of repository present on the ./repo path")
	errRemoveRepo := os.RemoveAll("./repo")
	if errRemoveRepo != nil {
		logger.Error(fmt.Sprint(errRemoveRepo))
	}

	logger.Info("Cloning the bevel repository")
	_, err := git.PlainClone("repo", false, &git.CloneOptions{
		URL: gitUrl,
		Auth: &http.BasicAuth{
			Username: gitUsername,
			Password: gitToken,
		},
		Progress: os.Stdout,
	})

	if err != nil {
		logger.Error(fmt.Sprint(err))
	}
}

func CreateBranchFromBevelRemote(logger *zap.Logger) {
	utils.ExecuteCmd([]string{"git", "-C", "./repo/", "remote", "add", "bevel", BevelRemoteUrl}, false, logger)
	// utils.ExecuteCmd([]string{"git", "-C", "./repo/", "fetch", "bevel", "tag", "v1.0.0.0", "--no-tags"}, false, logger)
	// utils.ExecuteCmd([]string{"git", "-C", "./repo/", "checkout", "-b", BevelBranchName, "v1.0.0.0"}, false, logger)
	// utils.ExecuteCmd([]string{"git", "-C", "./repo/", "push", "--set-upstream", "origin", "cactibevelexample", "--force"}, true, logger)
	utils.ExecuteCmd([]string{"git", "-C", "./repo/", "fetch", "bevel", "main"}, false, logger)
	utils.ExecuteCmd([]string{"git", "-C", "./repo/", "checkout", "-b", BevelBranchName}, false, logger)
	utils.ExecuteCmd([]string{"git", "-C", "./repo/", "reset", "--hard", "bevel/main"}, false, logger)
	utils.ExecuteCmd([]string{"git", "-C", "./repo/", "push", "--set-upstream", "origin", "cactibevelexample", "--force"}, true, logger)
}
