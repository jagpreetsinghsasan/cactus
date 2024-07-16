export async function getCommitMessageStringArray(url: string) {
  const commitMessagesJson = await fetch(url);
  return commitMessagesJson;
}

const args = process.argv.slice(2);

// const pullReqUrl = args[0];
// const pullReqTitle = args[1];
const pullReqBody = args[2];
const githubApiCommitIdsRef = pullReqBody + "/commits";
// console.log(pullReqUrl);
// console.log(pullReqTitle);
// console.log(githubApiCommitIdsRef);
const res = await getCommitMessageStringArray(githubApiCommitIdsRef);
console.log(JSON.stringify(res));
