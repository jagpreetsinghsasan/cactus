export async function getCommitMessageStringArray(url) {
  const commitMessagesJsonResponse = await fetch(url);
  return commitMessagesJsonResponse.text();
}

const args = process.argv.slice(2);
const pullReqUrl = args[0];

const res = await getCommitMessageStringArray(pullReqUrl);
console.log(res);
