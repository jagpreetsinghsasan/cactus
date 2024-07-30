package prequisites

import (
	"bytes"
	"os"

	"github.com/hyperledger/cacti/examples/bevel/configure"
	"go.uber.org/zap"
)

const (
	FABRIC_NETWORKYAML_FILEPATH = "networkyamls/fabric.yaml"
)


type FabricNetworkYamlReq struct {
	ClusterContext string
	VaultUrl string
	VaultRoottoken string
  GitUsername string
	GitUsertoken string
	GitUseremail string
}

func CreateFabricNetworkYaml(fabricNetworkYamlReq FabricNetworkYamlReq, logger *zap.Logger) {
	inputFabricNetworkYamlByte, inputFabricNetworkYamlErr := os.ReadFile(FABRIC_NETWORKYAML_FILEPATH)
	if inputFabricNetworkYamlErr != nil {
		logger.Fatal(inputFabricNetworkYamlErr.Error())
	}

	outputFabricNetworkYamlByte := bytes.Replace(inputFabricNetworkYamlByte, []byte("cluster_context"), []byte(fabricNetworkYamlReq.ClusterContext),-1)
	outputFabricNetworkYamlByte = bytes.Replace(outputFabricNetworkYamlByte, []byte("vault_url"), []byte(fabricNetworkYamlReq.VaultUrl),-1)
	outputFabricNetworkYamlByte = bytes.Replace(outputFabricNetworkYamlByte, []byte("vault_root_token"), []byte(fabricNetworkYamlReq.VaultRoottoken),-1)
	outputFabricNetworkYamlByte = bytes.Replace(outputFabricNetworkYamlByte, []byte("github_username"), []byte(fabricNetworkYamlReq.GitUsername),-1)
	outputFabricNetworkYamlByte = bytes.Replace(outputFabricNetworkYamlByte, []byte("github_branchname"), []byte(configure.BevelBranchName),-1)
	outputFabricNetworkYamlByte = bytes.Replace(outputFabricNetworkYamlByte, []byte("github_token"), []byte(fabricNetworkYamlReq.GitUsertoken),-1)
	outputFabricNetworkYamlByte = bytes.Replace(outputFabricNetworkYamlByte, []byte("github_useremail"), []byte(fabricNetworkYamlReq.GitUseremail),-1)

	outputFabricNetworkYamlErr := os.WriteFile("repo/build/network.yaml",outputFabricNetworkYamlByte, 0666)
	if outputFabricNetworkYamlErr != nil {
		logger.Fatal(outputFabricNetworkYamlErr.Error())
	}
}
