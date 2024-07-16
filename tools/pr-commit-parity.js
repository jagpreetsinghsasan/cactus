export async function getCommitMessageStringArray(url) {
  const commitMessagesJsonResponse = await fetch(url);
  return commitMessagesJsonResponse.json();
}

const args = process.argv.slice(2);
const pullReqUrl = args[0];

const res = await getCommitMessageStringArray(pullReqUrl);
console.log(encodeURIComponent(JSON.stringify(res.body)));
