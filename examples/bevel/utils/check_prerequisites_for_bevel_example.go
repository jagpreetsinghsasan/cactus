package utils

import (
	"fmt"
	"os/exec"
	"strings"
	"go.uber.org/zap"
)


func CheckPrerequisitesForBevelExample(logger *zap.Logger){
	cmd := exec.Command("lsb_release", "-a")
	stdout, err := cmd.Output()

	if err != nil {
		logger.Error(fmt.Sprint(err))
	}
	if ! strings.Contains(string(stdout),"Ubuntu") {
		logger.Error("Invalid OS. Only Ubuntu supported at the moment.")
	}
	if ! strings.Contains(string(stdout),"20.04") {
		logger.Error("Unsupported Ubuntu version")
	}

	if !CheckIfBinaryExists("snap",logger) {
		logger.Error("Snap not present on path. Please install snap to continue setup.")
	}

	if !CheckIfBinaryExists("git",logger) {
		logger.Error("Git not present on path. Please install git to continue setup.")
	}
}