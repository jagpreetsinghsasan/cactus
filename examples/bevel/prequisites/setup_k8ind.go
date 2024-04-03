package prequisites

import (
	"bytes"
	"html/template"
	"os"

	"github.com/Masterminds/sprig/v3"
	"github.com/hyperledger/cacti/examples/bevel/tpls"
	"github.com/hyperledger/cacti/examples/bevel/utils"
	"go.uber.org/zap"
)

type KindClusterConfig struct {
	ControlPlaneCount int
	WorkerNodeCount   int
}

func KindConfig(logger *zap.Logger) {
	logger.Info("Setting up the kind cluster")
	var KindConfigFile bytes.Buffer
	kindTemplate := template.New("Kind Config File").Funcs(sprig.FuncMap())
	kindTemplate, err := kindTemplate.Parse(tpls.Kind)
	if err != nil {
		logger.Fatal("Error during parsing the kind config file", zap.Any("ERROR", err))
	}
	err = kindTemplate.Execute(&KindConfigFile, KindClusterConfig{ControlPlaneCount: 1, WorkerNodeCount: 3})
	if err != nil {
		logger.Fatal("Error during executing the tpl file with vars", zap.Any("ERROR", err))
	}

	os.Mkdir("build", os.ModePerm)
	err = os.MkdirAll("repo/build/",os.ModePerm)
	if err != nil {
		logger.Fatal("Failed while creating the repo/build/ folder", zap.Any("ERROR", err))
	}
	file, err := os.Create("repo/build/kindconfig.yaml")
	if err != nil {
		logger.Fatal("Failed while creating the repo/build/kindconfig.yaml file", zap.Any("ERROR", err))
	}
	defer file.Close()
	file.WriteString(KindConfigFile.String())
	if utils.CheckCluster(logger) {
		logger.Fatal("Exiting...")
	} else {
		utils.ExecuteCmd([]string{"bash", "-c", "kind create cluster --config repo/build/kindconfig.yaml --name bevelcluster"}, false, logger)
		utils.ExecuteCmd([]string{"bash", "-c", "kind export kubeconfig --name bevelcluster"},false,logger)
		utils.ExecuteCmd([]string{"bash", "-c", "kubectl config view --raw > repo/build/config"},false,logger)
	}
}


func setupKubectl(logger *zap.Logger) {
	logger.Info("Setting up kubectl")
	if ! utils.CheckIfBinaryExists("kubectl", logger) {
		utils.ExecuteCmd([]string{"bash", "-c", "sudo snap install kubectl --channel=1.27/stable --classic"}, false, logger)
		logger.Info("kubectl installed")
	} else {
		logger.Info("Installation of kubectl skipped")
	}
}

func SetupKind(logger *zap.Logger) {
	setupKubectl(logger)
	logger.Info("Setting up kind")
	if ! utils.CheckIfBinaryExists("kind", logger) {
		utils.ExecuteCmd([]string{"bash", "-c", "curl -Lo ./kind https://kind.sigs.k8s.io/dl/v0.22.0/kind-linux-amd64"}, false, logger)
		utils.ExecuteCmd([]string{"bash", "-c", "chmod +x ./kind"}, false, logger)
		utils.ExecuteCmd([]string{"bash", "-c", "sudo mv ./kind /usr/local/bin/kind"}, false, logger)
		logger.Info("Kind installed")
	} else {
		logger.Info("Installation of kind skipped")
	}
}