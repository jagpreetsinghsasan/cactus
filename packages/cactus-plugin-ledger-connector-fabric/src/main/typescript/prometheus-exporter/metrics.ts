import { Gauge } from "prom-client";

export const totalTxCount = new Gauge({
  name: "totalTxCount",
  help: "Total transactions executed",
  labelNames: ["type"],
});
