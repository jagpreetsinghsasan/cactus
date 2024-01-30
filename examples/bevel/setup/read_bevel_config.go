package setup

import "go.uber.org/zap"

func ReadBevelConfig(bevelConfigFileAbsPath string, logger *zap.Logger){
	logger.Info("Reading file contents from: " + bevelConfigFileAbsPath)
}

