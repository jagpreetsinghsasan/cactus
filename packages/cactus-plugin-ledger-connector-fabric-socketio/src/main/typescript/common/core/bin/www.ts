#!/usr/bin/env node

/*
 * Copyright 2021 Hyperledger Cactus Contributors
 * SPDX-License-Identifier: Apache-2.0
 *
 * www.js
 */

/* Summary:
 * Connector: a part independent of end-chains
 */

import app from "../app";
import https = require("https");

// Overwrite config read path
export const DEFAULT_NODE_CONFIG_DIR = "/etc/cactus/connector-fabric-socketio/";
if (!process.env["NODE_CONFIG_DIR"]) {
  // Must be set before import config
  process.env["NODE_CONFIG_DIR"] = DEFAULT_NODE_CONFIG_DIR;
}
import { configRead } from "@hyperledger/cactus-cmd-socketio-server";

import fs = require("fs");
import { Server } from "socket.io"
// Log settings
import { getLogger } from "log4js";
const logger = getLogger("connector_main[" + process.pid + "]");
logger.level = configRead('logLevel', 'info');

export async function startFabricSocketIOConnector() {

}
