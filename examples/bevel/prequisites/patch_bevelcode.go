package prequisites

import (
	"bytes"
	"os"

	"github.com/hyperledger/cacti/examples/bevel/utils"
	"go.uber.org/zap"
)

const (
	SC_FILE_PATH = "repo/platforms/shared/configuration/roles/create/shared_helm_component/templates/storage_class.tpl"
	NETWORK_SCHEMA_FILE_PATH = "repo/platforms/network-schema.json"
)


func patchStorageClass(logger *zap.Logger){
	inputScFileBytes, inputScFileErr := os.ReadFile(SC_FILE_PATH)
	if inputScFileErr != nil {
		logger.Fatal(inputScFileErr.Error())
	}

	outputScFileBytes := bytes.Replace(inputScFileBytes, []byte("minikube"), []byte("kind"),-1)
	outputScFileBytes = bytes.Replace(outputScFileBytes, []byte("k8s.io/kind-hostpath"), []byte("rancher.io/local-path"),-1)

	outputScFileErr := os.WriteFile(SC_FILE_PATH, outputScFileBytes, 0666)
	if outputScFileErr != nil {
		logger.Fatal(outputScFileErr.Error())
	}
}

func patchNetworkSchema(logger *zap.Logger){
	inputNsFileBytes, inputNsFileErr := os.ReadFile(NETWORK_SCHEMA_FILE_PATH)
	if inputNsFileErr != nil {
		logger.Fatal(inputNsFileErr.Error())
	}

	outputNsFileBytes := bytes.Replace(inputNsFileBytes, []byte("minikube"), []byte("kind"),-1)

	outputNsFileErr := os.WriteFile(NETWORK_SCHEMA_FILE_PATH, outputNsFileBytes, 0666)
	if outputNsFileErr != nil {
		logger.Fatal(outputNsFileErr.Error())
	}
}

func PatchBevelCode(logger *zap.Logger) {
	patchStorageClass(logger)
	patchNetworkSchema(logger)

	utils.ExecuteCmd([]string{"git", "-C", "./repo/", "add", "."}, true, logger)
	utils.ExecuteCmd([]string{"git", "-C", "./repo/", "commit", "-s", "-m", "Patching bevel code"}, true, logger)
	utils.ExecuteCmd([]string{"git", "-C", "./repo/", "push"}, true, logger)
}