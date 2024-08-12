package prequisites

import (
	"bytes"
	"fmt"
	"os"
	"strconv"
	"strings"
	"text/template"

	"github.com/Masterminds/sprig/v3"
	"github.com/hyperledger/cacti/examples/bevel/tpls"
	"github.com/hyperledger/cacti/examples/bevel/utils"
	"go.uber.org/zap"
)

const (
	OLD_VAULT_FULL_LABEL = "app.kubernetes.io/name=vault"
	NEW_VAULT_LABEL_KEY = "bevelabel"
	NEW_VAULT_LABEL_VALUE = "bevelvault"
	CLUSTER_CONTEXT = "microk8s"
)

type VaultConfig struct {
	VaultUrl string
	VaultToken string
}

func CreateVaultConfig(logger *zap.Logger) {
	var VaultConfigFile bytes.Buffer
	vaultTemplate := template.New("Vault Config File").Funcs(template.FuncMap(sprig.FuncMap()))
	vaultTemplate, err := vaultTemplate.Parse(tpls.Vault)
	if err != nil {
		logger.Fatal("Error during parsing the vault config file", zap.Any("ERROR", err))
	}
	err = vaultTemplate.Execute(&VaultConfigFile, "")
	if err != nil {
		logger.Fatal("Error during executing the tpl file with vars", zap.Any("ERROR", err))
	}

	os.Mkdir("build", os.ModePerm)
	file, err := os.Create("build/vaultconfig.yaml")
	if err != nil {
		logger.Fatal("Failed while creating the build/vaultconfig.yaml file", zap.Any("ERROR", err))
	}
	defer file.Close()
	file.WriteString(VaultConfigFile.String())

}

// Function to setup helm binary on the machine
func setupHelm(logger *zap.Logger) {
	logger.Info("Setting up Helm")
	if !utils.CheckIfBinaryExists("helm", logger) {
		logger.Info("Installing helm using snap")
		utils.ExecuteCmd([]string{"bash", "-c", "sudo snap install helm --classic"}, false, logger)
		logger.Info("Helm installed")
	} else {
		logger.Info("Installation of helm skipped")
	}
}

// Function to get the formatted vault unseal key string
func getUnsealKey(vaultConfig string) string {
	unsealkeyString := strings.Split(vaultConfig, "\n")[0]
	unsealKeyValue := strings.Split(unsealkeyString, ": ")[1]
	unsealKeyValue = strings.ReplaceAll(unsealKeyValue, " ", "")
	return unsealKeyValue
}

// Function to get the formatted vault inital root token string
func getInitalRootToken(vaultConfig string) string {
	initialRootTokenString := strings.Split(vaultConfig, "\n")[2]
	initialRootTokenValue := strings.Split(initialRootTokenString, ":")[1]
	initialRootTokenValue = strings.ReplaceAll(initialRootTokenValue, " ", "")
	return initialRootTokenValue
}

// Function to store the vault initial root token and unseal key in a json file
// for user reference
func storeVaultCredsInFile(vaultConfig string, logger *zap.Logger) string{
	rootToken := getInitalRootToken(vaultConfig)
	unsealKey := getUnsealKey(vaultConfig)

	os.Mkdir("build", os.ModePerm)
	file, err := os.Create("build/vaultconfig.json")
	if err != nil {
		logger.Fatal("Failed while creating the build/vaultconfig.json file", zap.Any("ERROR", err))
	}
	defer file.Close()
	fileData := fmt.Sprintf("{\n  \"unseal_key\" : \"%s\",\n  \"root_token\" : \"%s\"\n}", unsealKey, rootToken)
	file.WriteString(fileData)

	return rootToken
}

// Function to setup vault, initialize and unseal it
func SetupVault(logger *zap.Logger) VaultConfig {
	setupHelm(logger)
	CreateVaultConfig(logger)
	utils.ExecuteCmd([]string{"bash", "-c", "helm repo add hashicorp https://helm.releases.hashicorp.com"}, false, logger)
	utils.ExecuteCmd([]string{"bash", "-c", "helm install vault hashicorp/vault --version 0.25.0 -f build/vaultconfig.yaml"}, false, logger)
	kubeClient := utils.GetKubeClient("repo/build/config", CLUSTER_CONTEXT, logger)
	utils.WaitForPodToRun(kubeClient, "default", OLD_VAULT_FULL_LABEL, logger)
	utils.AddLabelToARunningPod(kubeClient, "default", "app.kubernetes.io/name=vault", NEW_VAULT_LABEL_KEY, NEW_VAULT_LABEL_VALUE, logger)
	restConfig := utils.GetK8sRestConfig("repo/build/config", "microk8s", logger)
	vaultConfigString := utils.KubectlExecCmd(restConfig, "vault-0", "vault", "default", "vault operator init -key-shares=1 -key-threshold=1 -format=table", logger)
	rootToken := storeVaultCredsInFile(vaultConfigString, logger)
	vaultEnvVarsString := `export VAULT_ADDR=http://` + utils.GetK8sNodeIP(kubeClient, logger)[0] + `:` + strconv.FormatInt(int64(utils.GetK8sServicePort(kubeClient, "default", "vault-ui", logger)[0].NodePort), 10) + `; export VAULT_TOKEN=` + getInitalRootToken(vaultConfigString) + `; `
	unsealVaultCmdString := vaultEnvVarsString + `vault operator unseal ` + getUnsealKey(vaultConfigString)
	utils.ExecuteCmd([]string{"bash", "-c", unsealVaultCmdString}, false, logger)
	enableSecretsEngineCmdString := vaultEnvVarsString + `vault secrets enable -version=2 -path=secret kv`
	utils.ExecuteCmd([]string{"bash", "-c", enableSecretsEngineCmdString}, false, logger)
	
	var vaultConfig VaultConfig
	vaultConfig.VaultUrl = `http://` + utils.GetK8sNodeIP(kubeClient, logger)[0] + `:` + strconv.FormatInt(int64(utils.GetK8sServicePort(kubeClient, "default", "vault-ui", logger)[0].NodePort), 10)
	vaultConfig.VaultToken = rootToken

	return vaultConfig
}