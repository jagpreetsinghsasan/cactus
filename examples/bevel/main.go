package main

import (
	"fmt"
	"os"
	"time"

	"github.com/hyperledger/cacti/examples/bevel/setup"
	"go.uber.org/zap"
	"go.uber.org/zap/zapcore"
)

func main(){

	config := zap.NewProductionEncoderConfig()
	config.EncodeTime = zapcore.ISO8601TimeEncoder
	fileEncoder := zapcore.NewConsoleEncoder(config)

	os.Mkdir("log", os.ModePerm)
	fileName := "log/" + time.Now().Format(time.RFC850)
	fmt.Println("Log file created at: ",fileName)

	logFile, _ := os.OpenFile(fileName,os.O_APPEND|os.O_CREATE|os.O_WRONLY, 0644)
	writer := zapcore.AddSync(logFile)
	defaultLogLevel := zapcore.DebugLevel
	core := zapcore.NewTee(
		zapcore.NewCore(fileEncoder, writer, defaultLogLevel),
	)
	logger := zap.New(core, zap.AddCaller(), zap.AddStacktrace(zapcore.ErrorLevel))
	defer logger.Sync()

	fmt.Println("Absolute file path for bevel config is set as " + os.Getenv("BEVELCONFIG"))

	setup.ReadBevelConfig(os.Getenv(("BEVELCONFIG")),logger)
}