package prequisites

import (
	"os"

	"github.com/hyperledger/cacti/examples/bevel/utils"
	"go.uber.org/zap"
)

func SetupMicrok8s(logger *zap.Logger) {
	setupKubectl(logger)
	logger.Info("Setting MicroK8s v1.27")
	if !utils.CheckIfBinaryExists("microk8s", logger) {
		utils.ExecuteCmd([]string{"bash", "-c", "sudo snap install microk8s --classic --channel=1.26"}, false, logger)
		utils.ExecuteCmd([]string{"bash", "-c", "sudo usermod -a -G microk8s $USER"}, false, logger)
		utils.ExecuteCmd([]string{"bash", "-c", "sudo su - $USER"}, false, logger)
		utils.ExecuteCmd([]string{"bash", "-c", "mkdir -p repo/build"},false, logger)
		utils.ExecuteCmd([]string{"bash", "-c", "microk8s config > repo/build/config"}, false, logger)
		currentWorkingDir,_ := os.Getwd()
		os.Setenv("KUBECONFIG", currentWorkingDir + "/repo/build/config")
		utils.ExecuteCmd([]string{"bash", "-c", "microk8s enable dns"}, false, logger)
		utils.ExecuteCmd([]string{"bash", "-c", "microk8s enable storage"}, false, logger)
		utils.ExecuteCmd([]string{"bash", "-c", "microk8s enable helm3"}, false, logger)
		utils.ExecuteCmd([]string{"bash", "-c", "microk8s enable ingress"}, false, logger)
		utils.ExecuteCmd([]string{"bash", "-c", "microk8s enable rbac"}, false, logger)
	} else {
		logger.Fatal("Please remove microk8s prior running this. If uninstalled via snap, you can remove it using: sudo snap remove --purge microk8s")
	}
}
