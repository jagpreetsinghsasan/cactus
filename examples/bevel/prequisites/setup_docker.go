package prequisites

import (
	"github.com/hyperledger/cacti/examples/bevel/utils"
	"go.uber.org/zap"
)

func InstallDocker(logger *zap.Logger){
	logger.Info("Setting up docker")
	if !utils.CheckIfBinaryExists("docker",logger) {
		logger.Info("Setting up docker using snap")
		utils.ExecuteCmd([]string{"bash", "-c", "sudo snap install docker"}, false, logger)
		logger.Info("Docker installed")
	} else {
		logger.Info("Docker already present. Installation of docker skipped")
	}
}