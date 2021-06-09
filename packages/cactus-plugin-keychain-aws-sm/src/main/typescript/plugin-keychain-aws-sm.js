"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
exports.__esModule = true;
var aws_sdk_1 = require("aws-sdk");
var typescript_optional_1 = require("typescript-optional");
var cactus_common_1 = require("@hyperledger/cactus-common");
var os_1 = require("os");
var AwsCredentialType;
(function (AwsCredentialType) {
    AwsCredentialType["LocalFile"] = "LOCAL_FILE";
    AwsCredentialType["InMemory"] = "IN_MEMORY";
})(AwsCredentialType = exports.AwsCredentialType || (exports.AwsCredentialType = {}));
var SECRETMANAGER_STATUS_KEY_NOT_FOUND = "Secrets Manager can't find the specified secret.";
var PluginKeychainAwsSm = /** @class */ (function () {
    function PluginKeychainAwsSm(opts) {
        this.opts = opts;
        var fnTag = this.className + "#constructor()";
        cactus_common_1.Checks.truthy(opts, fnTag + " arg options");
        cactus_common_1.Checks.truthy(opts.keychainId, fnTag + " arg options.keychainId");
        cactus_common_1.Checks.truthy(opts.instanceId, fnTag + " options.instanceId");
        cactus_common_1.Checks.truthy(opts.awsProfile, fnTag + " options.awsProfile");
        cactus_common_1.Checks.truthy(opts.awsRegion, fnTag + " options.awsRegion");
        cactus_common_1.Checks.truthy(opts.awsEndpoint, fnTag + " options.awsEndpoint");
        cactus_common_1.Checks.truthy(opts.awsCredentialType, fnTag + " options.awsCredentialType");
        cactus_common_1.Checks.nonBlankString(opts.keychainId, fnTag + " options.keychainId");
        cactus_common_1.Checks.nonBlankString(opts.awsProfile, fnTag + " options.awsProfile");
        cactus_common_1.Checks.nonBlankString(opts.awsRegion, fnTag + " options.awsRegion");
        cactus_common_1.Checks.nonBlankString(opts.awsEndpoint, fnTag + " options.awsEndpoint");
        if (opts.awsCredentialType == AwsCredentialType.InMemory) {
            cactus_common_1.Checks.nonBlankString(opts.awsAccessKeyId, fnTag + " options.awsAccessKeyId");
            cactus_common_1.Checks.nonBlankString(opts.awsSecretAccessKey, fnTag + " options.awsSecretAccessKey");
        }
        var level = this.opts.logLevel || "INFO";
        var label = this.className;
        this.log = cactus_common_1.LoggerProvider.getOrCreate({ level: level, label: label });
        this.instanceId = this.opts.instanceId;
        this.awsProfile = this.opts.awsProfile;
        this.awsRegion = this.opts.awsRegion;
        this.awsEndpoint = this.opts.awsEndpoint;
        this.awsCredentialType = this.opts.awsCredentialType;
        if (this.awsCredentialType == AwsCredentialType.LocalFile) {
            var credentials = new aws_sdk_1.SharedIniFileCredentials({
                profile: this.awsProfile,
                filename: this.opts.awsCredentialFilePath || os_1.homedir() + "/.aws/credentials"
            });
            aws_sdk_1.config.credentials = credentials;
        }
        else if (this.awsCredentialType == AwsCredentialType.InMemory) {
            var credentials = new aws_sdk_1.Credentials({
                accessKeyId: this.opts.awsAccessKeyId || "",
                secretAccessKey: this.opts.awsSecretAccessKey || ""
            });
            aws_sdk_1.config.credentials = credentials;
        }
        aws_sdk_1.config.region = this.awsRegion;
        this.awsClient = new aws_sdk_1.SecretsManager({
            endpoint: this.awsEndpoint
        });
        this.log.info("Created " + this.className + ". KeychainID=" + opts.keychainId);
    }
    Object.defineProperty(PluginKeychainAwsSm.prototype, "className", {
        get: function () {
            return PluginKeychainAwsSm.CLASS_NAME;
        },
        enumerable: true,
        configurable: true
    });
    PluginKeychainAwsSm.prototype.getAwsClient = function () {
        return this.awsClient;
    };
    PluginKeychainAwsSm.prototype.registerWebServices = function (app) {
        return __awaiter(this, void 0, void 0, function () {
            var webServices;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0: return [4 /*yield*/, this.getOrCreateWebServices()];
                    case 1:
                        webServices = _a.sent();
                        return [4 /*yield*/, Promise.all(webServices.map(function (ws) { return ws.registerExpress(app); }))];
                    case 2:
                        _a.sent();
                        return [2 /*return*/, webServices];
                }
            });
        });
    };
    PluginKeychainAwsSm.prototype.getOrCreateWebServices = function () {
        return __awaiter(this, void 0, void 0, function () {
            var endpoints;
            return __generator(this, function (_a) {
                if (Array.isArray(this.endpoints)) {
                    return [2 /*return*/, this.endpoints];
                }
                endpoints = [];
                this.endpoints = endpoints;
                return [2 /*return*/, endpoints];
            });
        });
    };
    PluginKeychainAwsSm.prototype.getHttpServer = function () {
        return typescript_optional_1.Optional.empty();
    };
    PluginKeychainAwsSm.prototype.shutdown = function () {
        return __awaiter(this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                throw new Error("Method not implemented.");
            });
        });
    };
    PluginKeychainAwsSm.prototype.getInstanceId = function () {
        return this.instanceId;
    };
    PluginKeychainAwsSm.prototype.getKeychainId = function () {
        return this.opts.keychainId;
    };
    PluginKeychainAwsSm.prototype.getPackageName = function () {
        return "@hyperledger/cactus-plugin-keychain-aws-sm";
    };
    PluginKeychainAwsSm.prototype.rotateEncryptionKeys = function () {
        return __awaiter(this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                throw new Error("Method not implemented.");
            });
        });
    };
    PluginKeychainAwsSm.prototype.getEncryptionAlgorithm = function () {
        return null;
    };
    PluginKeychainAwsSm.prototype.get = function (key) {
        return __awaiter(this, void 0, void 0, function () {
            var fnTag, awsClient, res, ex_1, errorStatus;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        fnTag = this.className + "#get(key: string)";
                        awsClient = this.getAwsClient();
                        _a.label = 1;
                    case 1:
                        _a.trys.push([1, 3, , 4]);
                        return [4 /*yield*/, awsClient
                                .getSecretValue({
                                SecretId: key
                            })
                                .promise()];
                    case 2:
                        res = (_a.sent());
                        if (res.SecretString) {
                            return [2 /*return*/, res.SecretString];
                        }
                        else {
                            throw new Error(fnTag + ": Invalid response recieved from AWS SecretsManager. Expected \"response.SecretString\" property chain to be truthy");
                        }
                        return [3 /*break*/, 4];
                    case 3:
                        ex_1 = _a.sent();
                        errorStatus = ex_1.message.includes(SECRETMANAGER_STATUS_KEY_NOT_FOUND);
                        if (errorStatus) {
                            return [2 /*return*/, null];
                        }
                        else {
                            this.log.error("Error retriving secret value for the key \"" + key + "\"");
                            throw ex_1;
                        }
                        return [3 /*break*/, 4];
                    case 4: return [2 /*return*/];
                }
            });
        });
    };
    PluginKeychainAwsSm.prototype.has = function (key) {
        return __awaiter(this, void 0, void 0, function () {
            var fnTag, awsClient, ex_2, errorStatus;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        fnTag = this.className + "#has(key: string)";
                        awsClient = this.getAwsClient();
                        _a.label = 1;
                    case 1:
                        _a.trys.push([1, 3, , 4]);
                        return [4 /*yield*/, awsClient
                                .describeSecret({
                                SecretId: key
                            })
                                .promise()];
                    case 2:
                        (_a.sent());
                        return [2 /*return*/, true];
                    case 3:
                        ex_2 = _a.sent();
                        errorStatus = ex_2.message.includes(SECRETMANAGER_STATUS_KEY_NOT_FOUND);
                        if (errorStatus) {
                            return [2 /*return*/, false];
                        }
                        else {
                            this.log.error(fnTag + ": Presence check of \"" + key + "\" crashed:", ex_2);
                            throw ex_2;
                        }
                        return [3 /*break*/, 4];
                    case 4: return [2 /*return*/];
                }
            });
        });
    };
    PluginKeychainAwsSm.prototype.set = function (key, value) {
        return __awaiter(this, void 0, void 0, function () {
            var fnTag, awsClient, ex_3;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        fnTag = this.className + "#set(key: string)";
                        awsClient = this.getAwsClient();
                        _a.label = 1;
                    case 1:
                        _a.trys.push([1, 3, , 4]);
                        return [4 /*yield*/, awsClient
                                .createSecret({
                                Name: key,
                                SecretString: value
                            })
                                .promise()];
                    case 2:
                        (_a.sent());
                        return [3 /*break*/, 4];
                    case 3:
                        ex_3 = _a.sent();
                        this.log.error(" " + fnTag + ": Error writing secret \"" + key + "\"");
                        throw ex_3;
                    case 4: return [2 /*return*/];
                }
            });
        });
    };
    PluginKeychainAwsSm.prototype["delete"] = function (key) {
        return __awaiter(this, void 0, void 0, function () {
            var fnTag, awsClient, ex_4;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        fnTag = this.className + "#delete(key: string)";
                        awsClient = this.getAwsClient();
                        _a.label = 1;
                    case 1:
                        _a.trys.push([1, 3, , 4]);
                        return [4 /*yield*/, awsClient
                                .deleteSecret({
                                SecretId: key,
                                ForceDeleteWithoutRecovery: true
                            })
                                .promise()];
                    case 2:
                        (_a.sent());
                        return [3 /*break*/, 4];
                    case 3:
                        ex_4 = _a.sent();
                        this.log.error(fnTag + " Error deleting secret \"" + key + "\"");
                        throw ex_4;
                    case 4: return [2 /*return*/];
                }
            });
        });
    };
    PluginKeychainAwsSm.CLASS_NAME = "PluginKeychainAwsSm";
    return PluginKeychainAwsSm;
}());
exports.PluginKeychainAwsSm = PluginKeychainAwsSm;
