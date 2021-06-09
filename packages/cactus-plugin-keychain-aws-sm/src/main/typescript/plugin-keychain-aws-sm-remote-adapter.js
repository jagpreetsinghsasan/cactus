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
var typescript_optional_1 = require("typescript-optional");
var cactus_common_1 = require("@hyperledger/cactus-common");
var typescript_axios_1 = require("./generated/openapi/typescript-axios");
/**
 * Class responsible for ecapsulating an API client object and then acting as
 * an adapter (ta-da) between said API client object and the calling code to
 * which it is (should be) transparent whether it is talking to an in-process
 * plugin instance of the keychain plugin or an adapter backed by an API client
 * object in which scenario the real keychain plugin object can be anywhere
 * else on the network and also can be written in any programming language that
 * the author so desires.
 */
var PluginKeychainAwsSmRemoteAdapter = /** @class */ (function () {
    function PluginKeychainAwsSmRemoteAdapter(opts) {
        this.opts = opts;
        var fnTag = this.className + "#constructor()";
        cactus_common_1.Checks.truthy(opts, fnTag + " arg options");
        cactus_common_1.Checks.truthy(opts.keychainId, fnTag + " arg options.keychainId");
        cactus_common_1.Checks.truthy(opts.instanceId, fnTag + " options.instanceId");
        cactus_common_1.Checks.nonBlankString(opts.keychainId, fnTag + " options.keychainId");
        cactus_common_1.Checks.truthy(opts.backend, fnTag + " options.backend");
        cactus_common_1.Checks.truthy(opts.backend instanceof typescript_axios_1.DefaultApi, fnTag + " opts.backend instanceof DefaultApi");
        var level = this.opts.logLevel || "INFO";
        var label = this.className;
        this.log = cactus_common_1.LoggerProvider.getOrCreate({ level: level, label: label });
        this.instanceId = this.opts.instanceId;
        this.backend = opts.backend;
        this.keychainId = opts.keychainId;
        this.log.info("Created " + this.className + ". KeychainID=" + opts.keychainId);
    }
    Object.defineProperty(PluginKeychainAwsSmRemoteAdapter.prototype, "className", {
        get: function () {
            return PluginKeychainAwsSmRemoteAdapter.CLASS_NAME;
        },
        enumerable: true,
        configurable: true
    });
    /**
     * Dummy implementation that wires no web services on the host API server
     * because there is no need. All the functionality is implemented somewhere
     * else on a host that's accessible through the network to this object
     * (because this class is a remote adapter not an actual plugin impl.).
     *
     * @param _expressApp
     */
    PluginKeychainAwsSmRemoteAdapter.prototype.getOrCreateWebServices = function () {
        return __awaiter(this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                return [2 /*return*/, []];
            });
        });
    };
    /* eslint-disable-next-line @typescript-eslint/no-unused-vars */
    PluginKeychainAwsSmRemoteAdapter.prototype.registerWebServices = function (app) {
        return this.getOrCreateWebServices();
    };
    PluginKeychainAwsSmRemoteAdapter.prototype.getHttpServer = function () {
        return typescript_optional_1.Optional.empty();
    };
    PluginKeychainAwsSmRemoteAdapter.prototype.shutdown = function () {
        return __awaiter(this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                return [2 /*return*/];
            });
        });
    };
    PluginKeychainAwsSmRemoteAdapter.prototype.rotateEncryptionKeys = function () {
        throw new Error("Method not implemented.");
    };
    PluginKeychainAwsSmRemoteAdapter.prototype.getEncryptionAlgorithm = function () {
        throw new Error("Method not implemented.");
    };
    PluginKeychainAwsSmRemoteAdapter.prototype.getKeychainId = function () {
        return this.keychainId;
    };
    PluginKeychainAwsSmRemoteAdapter.prototype.has = function (key) {
        return __awaiter(this, void 0, void 0, function () {
            var ex_1;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0:
                        _a.trys.push([0, 2, , 3]);
                        return [4 /*yield*/, this.backend.getKeychainEntry({ key: key })];
                    case 1:
                        _a.sent();
                        return [2 /*return*/, true];
                    case 2:
                        ex_1 = _a.sent();
                        // FIXME check for errors being thrown due to something other than
                        // the key not being present...
                        return [2 /*return*/, false];
                    case 3: return [2 /*return*/];
                }
            });
        });
    };
    PluginKeychainAwsSmRemoteAdapter.prototype.get = function (key) {
        return __awaiter(this, void 0, void 0, function () {
            var data;
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0: return [4 /*yield*/, this.backend.getKeychainEntry({ key: key })];
                    case 1:
                        data = (_a.sent()).data;
                        // FIXME what to do here? Does it make any sense to have the get() method
                        // of the keychain be generically parameterizable when we know we can only
                        // return a string anyway?
                        return [2 /*return*/, data.value];
                }
            });
        });
    };
    PluginKeychainAwsSmRemoteAdapter.prototype.set = function (key, value) {
        return __awaiter(this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0: 
                    // FIXME Does it make any sense to have the set() method be generic?
                    return [4 /*yield*/, this.backend.setKeychainEntry({ key: key, value: value })];
                    case 1:
                        // FIXME Does it make any sense to have the set() method be generic?
                        _a.sent();
                        return [2 /*return*/];
                }
            });
        });
    };
    PluginKeychainAwsSmRemoteAdapter.prototype["delete"] = function (key) {
        return __awaiter(this, void 0, void 0, function () {
            return __generator(this, function (_a) {
                switch (_a.label) {
                    case 0: 
                    // FIXME Pretty sure aws secret manager can do delete so we don't have to hack it like this
                    // but it cannot be done in this code until the rust code has been updated
                    // to have that endpoint as well...
                    return [4 /*yield*/, this.backend.setKeychainEntry({ key: key, value: "" })];
                    case 1:
                        // FIXME Pretty sure aws secret manager can do delete so we don't have to hack it like this
                        // but it cannot be done in this code until the rust code has been updated
                        // to have that endpoint as well...
                        _a.sent();
                        return [2 /*return*/];
                }
            });
        });
    };
    PluginKeychainAwsSmRemoteAdapter.prototype.getInstanceId = function () {
        return this.instanceId;
    };
    PluginKeychainAwsSmRemoteAdapter.prototype.getPackageName = function () {
        return "@hyperledger/cactus-plugin-keychain-aws-sm";
    };
    PluginKeychainAwsSmRemoteAdapter.CLASS_NAME = "PluginKeychainAwsSmRemoteAdapter";
    return PluginKeychainAwsSmRemoteAdapter;
}());
exports.PluginKeychainAwsSmRemoteAdapter = PluginKeychainAwsSmRemoteAdapter;
