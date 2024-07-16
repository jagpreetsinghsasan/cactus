export async function getPrMetadata(url) {
  const commitMessagesJsonResponse = await fetch(url);
  return commitMessagesJsonResponse.json();
}

const args = process.argv.slice(2);
const pullReqUrl = args[0];

const prMetaData = await getCommitMessageStringArray(pullReqUrl);
const prBodyRaw = JSON.stringify(prMetaData.body);
const prBodyStriped = prBodyRaw.replace(/\r\n/g);

console.log(prBodyStriped);
