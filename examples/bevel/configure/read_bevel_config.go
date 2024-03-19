package configure

import (
	"encoding/json"
	"fmt"
	"os"
	"go.uber.org/zap"
)

func ReadBevelConfig(bevelConfigFileAbsPath string, logger *zap.Logger) BevelConfig{
	logger.Info("Reading file contents from: " + bevelConfigFileAbsPath)

	file, err := os.Open(bevelConfigFileAbsPath)
	if err != nil {
		logger.Error(fmt.Sprint(err))
	}
	defer file.Close()

	var bevelConfig BevelConfig
	decoder := json.NewDecoder(file)
	err = decoder.Decode(&bevelConfig)
	if err != nil {
		logger.Error(fmt.Sprint(err))
	}

	return bevelConfig
}

