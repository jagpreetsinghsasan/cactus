package utils

import (
	"bytes"
	"fmt"
	"os/exec"
	"strings"

	"go.uber.org/zap"
)

func ExecuteCmd(cmdWithArgs []string, ignoreErrors bool, logger *zap.Logger) {
	// cmd := exec.Command(cmdWithArgs[0], cmdWithArgs[1:]...)
	// stdout, err := cmd.Output()

	// if err != nil && !ignoreErrors {
	// 	logger.Error(fmt.Sprint(err))
	// }
	// logger.Info(string(stdout))

	cmd := exec.Command(cmdWithArgs[0], cmdWithArgs[1:]...)
	var stdoutBuf bytes.Buffer
	var stdErrBuf bytes.Buffer

	cmd.Stdout = &stdoutBuf
	cmd.Stderr = &stdErrBuf
	err := cmd.Run()
	if err != nil  && !ignoreErrors {
		logger.Error(fmt.Sprintln(err) + stdErrBuf.String())
	}

	logger.Info("COMMAND: " + strings.Join(cmdWithArgs, " "))
	logger.Info(stdoutBuf.String())
	logger.Info(stdErrBuf.String())
}