import { Express, Request, Response } from "express";

import {
  Logger,
  LoggerProvider,
  LogLevelDesc,
  Checks,
} from "@hyperledger/cactus-common";

import {
  IWebServiceEndpoint,
  IExpressRequestHandler,
} from "@hyperledger/cactus-core-api";

import OAS from "../../json/openapi.json";

import { registerWebServiceEndpoint } from "@hyperledger/cactus-core";

import { PluginLedgerConnectorFabric } from "../plugin-ledger-connector-fabric";
import { PrometheusExporter } from "../prometheus-exporter/prometheus-exporter";

export interface IGetPrometheusExporterMetricsV1Options {
  logLevel?: LogLevelDesc;
  connector: PluginLedgerConnectorFabric;
}

export class GetPrometheusExporterMetricsV1 implements IWebServiceEndpoint {
  private readonly log: Logger;

  constructor(public readonly opts: IGetPrometheusExporterMetricsV1Options) {
    const fnTag = "GetPrometheusExporterMetricsV1#constructor()";

    Checks.truthy(opts, `${fnTag} options`);
    Checks.truthy(opts.connector, `${fnTag} options.connector`);

    this.log = LoggerProvider.getOrCreate({
      label: "get-prometheus-exporter-metrics-v1",
      level: opts.logLevel || "INFO",
    });
  }

  public getExpressRequestHandler(): IExpressRequestHandler {
    return this.handleRequest.bind(this);
  }

  public getPath(): string {
    return OAS.paths[
      "/api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/get-prometheus-exporter-metrics"
    ].get["x-hyperledger-cactus"].http.path;
  }

  public getVerbLowerCase(): string {
    return OAS.paths[
      "/api/v1/plugins/@hyperledger/cactus-plugin-ledger-connector-fabric/get-prometheus-exporter-metrics"
    ].get["x-hyperledger-cactus"].http.verbLowerCase;
  }

  public registerExpress(app: Express): IWebServiceEndpoint {
    registerWebServiceEndpoint(app, this);
    return this;
  }

  async handleRequest(req: Request, res: Response): Promise<void> {
    const fnTag = "GetPrometheusExporterMetrics#handleRequest()";
    this.log.debug(`POST ${this.getPath()}`);

    try {
      let prometheusExporterObject: PrometheusExporter = new PrometheusExporter(
        {
          pollingIntervalInMin:
            req.body.promExporter.prometheusExporterOptions
              .pollingIntervalInMin,
        },
      );
      prometheusExporterObject = Object.assign(
        prometheusExporterObject,
        req.body.promExporter,
      );
      const resBody = await this.opts.connector.getPrometheusExporterMetrics({
        promExporter: prometheusExporterObject,
      });
      res.status(200);
      res.json(resBody);
    } catch (ex) {
      this.log.error(`${fnTag} failed to serve request`, ex);
      res.status(500);
      res.statusMessage = ex.message;
      res.json({ error: ex.stack });
    }
  }
}
