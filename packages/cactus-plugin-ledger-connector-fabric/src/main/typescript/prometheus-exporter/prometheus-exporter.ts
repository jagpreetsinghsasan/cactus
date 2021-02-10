import promClient from "prom-client";
import { Transaction, Transactions } from "./response.type";
import { collectMetrics } from "./data-fetcher";
import { PrometheusExporterMetricsResponse } from "../generated/openapi/typescript-axios";

export interface PrometheusExporterOptions {
  pollingIntervalInMin?: number;
}

export interface PrometheusExporterResponse {
  result: string;
}

export class PrometheusExporter {
  public readonly metricsPollingIntervalInMin: number;
  public readonly transactions: Transactions = [];

  constructor(
    public readonly prometheusExporterOptions: PrometheusExporterOptions,
  ) {
    this.metricsPollingIntervalInMin =
      prometheusExporterOptions.pollingIntervalInMin || 1;
  }

  public addCurrentTransaction(startTimestamp: Date, endTimestamp: Date) {
    this.transactions.push({
      startTime: startTimestamp,
      endTime: endTimestamp,
    } as Transaction);
  }

  public async getPrometheusMetrics(): Promise<
    PrometheusExporterMetricsResponse
  > {
    const result = {
      result: await promClient.register.getSingleMetricAsString("totalTxCount"),
    };
    return result;
  }

  public startMetricsCollection(): NodeJS.Timeout {
    promClient.collectDefaultMetrics();

    const pollTimeoutRefreshIntervalId = setInterval(() => {
      collectMetrics(this.transactions);
    }, this.metricsPollingIntervalInMin * 60 * 1000);
    collectMetrics(this.transactions);

    return pollTimeoutRefreshIntervalId;
  }
}
