export async function getCommitMessageStringArray(url) {
  const commitMessagesJson = await fetch(url);
  return commitMessagesJson;
}

const args = process.argv.slice(2);
const pullReqUrl = args[0];

const res = await getCommitMessageStringArray(pullReqUrl);
console.log(JSON.stringify(res));
