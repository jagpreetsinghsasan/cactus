package utils

import (
	"fmt"
	"os/exec"
	"strings"

	"go.uber.org/zap"
)

func CheckPrerequisitesForBevelExample(logger *zap.Logger) {
	cmd := exec.Command("lsb_release", "-a")
	stdout, err := cmd.Output()

	if err != nil {
		logger.Error(fmt.Sprint(err))
	}
	if !strings.Contains(string(stdout), "Ubuntu") {
		logger.Fatal("Invalid OS. Only Ubuntu supported at the moment.")
	}
	if !strings.Contains(string(stdout), "22.04") {
		logger.Fatal("Unsupported Ubuntu version")
	}

	if !CheckIfBinaryExists("snap", logger) {
		logger.Fatal("Snap not present on path. Please install snap to continue setup.")
	}

	if !CheckIfBinaryExists("git", logger) {
		logger.Fatal("Git not present on path. Please install git to continue setup.")
	}
}
