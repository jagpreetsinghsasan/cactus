// export async function getCommitMessageStringArray(url: string) {
//   const commitMessagesJson = await fetch(url);
//   return commitMessagesJson;
// }

const pullReqUrl = process.env.PULL_REQ_URL;
const pullReqTitle = process.env.PULL_REQ_TITLE;
const pullReqBody = process.env.PULL_REQ_BODY;
const githubApiCommitIdsRef = pullReqBody + "/commits";
console.log(pullReqUrl);
console.log(pullReqTitle);
console.log(githubApiCommitIdsRef);
// const res = await getCommitMessageStringArray(githubApiCommitIdsRef);
// console.log(JSON.stringify(res));
