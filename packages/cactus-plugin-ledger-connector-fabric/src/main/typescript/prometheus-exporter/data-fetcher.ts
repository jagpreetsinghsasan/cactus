import { Transactions } from "./response.type";

import { totalTxCount } from "./metrics";

export async function collectMetrics(transactions: Transactions) {
  totalTxCount.labels("totalTxCount").set(transactions.length);
}
