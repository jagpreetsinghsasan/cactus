package utils

import (
	"fmt"
	"os/exec"

	"go.uber.org/zap"
)

func CheckIfBinaryExists(binaryName string, logger *zap.Logger) bool{
	logger.Info("Checking if the following binary exists or not: " + binaryName)
	_, err := exec.LookPath(binaryName)
	if err != nil {
		logger.Info(binaryName + " binary does not exist")
		fmt.Println(err)
		return false
	} else {
		logger.Info(binaryName + " binary found. Skipping its installation.")
		return true
	}
}