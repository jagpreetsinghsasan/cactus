package main

import (
	"fmt"
	"os"
	"time"

	"github.com/hyperledger/cacti/examples/bevel/configure"
	"github.com/hyperledger/cacti/examples/bevel/prequisites"
	"github.com/hyperledger/cacti/examples/bevel/utils"
	"go.uber.org/zap"
	"go.uber.org/zap/zapcore"
)

func main(){

	config := zap.NewProductionEncoderConfig()
	config.EncodeTime = zapcore.ISO8601TimeEncoder
	fileEncoder := zapcore.NewConsoleEncoder(config)

	os.Mkdir("log", os.ModePerm)
	fileName := "log/" + time.Now().Format(time.RFC850) + ".log"
	fmt.Println("Log file created at: ",fileName)

	logFile, _ := os.OpenFile(fileName,os.O_APPEND|os.O_CREATE|os.O_WRONLY, 0666)
	writer := zapcore.AddSync(logFile)
	defaultLogLevel := zapcore.DebugLevel
	core := zapcore.NewTee(
		zapcore.NewCore(fileEncoder, writer, defaultLogLevel),
	)
	logger := zap.New(core, zap.AddCaller(), zap.AddStacktrace(zapcore.ErrorLevel))
	defer logger.Sync()

	fmt.Println("Absolute file path for bevel config is set as " + os.Getenv("BEVELCONFIG"))

	utils.CheckPrerequisitesForBevelExample(logger)

	bevelConfig := configure.ReadBevelConfig(os.Getenv(("BEVELCONFIG")),logger)
	
	var fabricNetworkYamlReq prequisites.FabricNetworkYamlReq
	fabricNetworkYamlReq.ClusterContext = prequisites.CLUSTER_CONTEXT
	fabricNetworkYamlReq.GitUsername = bevelConfig.GitUserName
	fabricNetworkYamlReq.GitUsertoken = bevelConfig.GitToken
	fabricNetworkYamlReq.GitUseremail = bevelConfig.GitUserEmail
	
	configure.DownloadBevelRepo(bevelConfig.GitUrl, bevelConfig.GitUserName, bevelConfig.GitToken, logger)
	configure.CreateBranchFromBevelRemote(logger)
	prequisites.InstallDocker(logger)
	// prequisites.SetupKind(logger)
	// prequisites.KindConfig(logger)
	prequisites.SetupMicrok8s(logger)
	vaultConfig := prequisites.SetupVault(logger)

	fabricNetworkYamlReq.VaultUrl = vaultConfig.VaultUrl
	fabricNetworkYamlReq.VaultRoottoken = vaultConfig.VaultToken

	prequisites.CreateFabricNetworkYaml(fabricNetworkYamlReq, logger)
	prequisites.PatchBevelCode(logger)

}