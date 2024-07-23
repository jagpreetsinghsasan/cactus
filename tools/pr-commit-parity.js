export async function getPrMetadata(url) {
  const getPrMetadataResponse = await fetch(url);
  return getPrMetadataResponse.json();
}

export async function getCommitMessagesData(url) {
  const commitMessagesResponse = await fetch(url);
  return commitMessagesResponse.json();
}

//regex expressions uses
const PULL_REQ_REQUIREMENTS_REGEX = /\*\*Pull\sRequest\sRequirements(.|\n)*/gim;
const FIXES_OR_DEPENDS_REGEX = /(Fixes|Depends)(.|\n)*/gim;
const SIGNED_OFF_REGEX = /(")*Signed-off-by:(.|\s)*/gim;
const HYPHEN_REGEX = /(-)+/gm;
const BACKTICK_REGEX = /`+/gm;
const SPACE_REGEX = /  +/gm;
const COMMIT_TO_BE_REVIEWED_REGEX = /("#*\s*Commit\sto\sbe\sreviewed)/gim;
const WHITESPACES_HARDCODED_REGEX = /(\r\n|\n|\r|\\r|\\n)/gm;

const args = process.argv.slice(2);
const pullReqUrl = args[0];

// const prMetadata = await getPrMetadata("https://api.github.com/repos/hyperledger/cacti/pulls/3428");
const prMetadata = await getPrMetadata(pullReqUrl);
const prBodyRaw = JSON.stringify(prMetadata.body);

let commitMessageList = [];
// const commitMessagesMetadata = await getCommitMessagesData("https://api.github.com/repos/hyperledger/cacti/pulls/3428/commits")
const commitMessagesMetadata = await getCommitMessagesData(
  pullReqUrl + "/commits",
);

commitMessagesMetadata.forEach((commitMessageMetadata) => {
  //Get the commit message and strip off Signed-by...
  commitMessageList.push(
    commitMessageMetadata["commit"]["message"]
      .replace(SIGNED_OFF_REGEX, "")
      .replace(HYPHEN_REGEX, "")
      .replace(BACKTICK_REGEX, ""),
  );
});

// Removing all line breaks from PR Body and Commit Messages
// This loosens the check, otherwise we will see more influx of questions such as
// "Even though my PR message and Commit message remains the same, why do we still have this check failed?"
let prBodyStriped = prBodyRaw
  .replace(PULL_REQ_REQUIREMENTS_REGEX, "")
  .replace(FIXES_OR_DEPENDS_REGEX, "")
  .replace(WHITESPACES_HARDCODED_REGEX, "")
  .replace(SIGNED_OFF_REGEX, "")
  .replace(HYPHEN_REGEX, "")
  .replace(BACKTICK_REGEX, "")
  .replace(COMMIT_TO_BE_REVIEWED_REGEX, "")
  .replace(SPACE_REGEX, " ");

let PR_BODY_IN_COMMIT_MESSAGES = false;
for (let commitMessageListIndex in commitMessageList) {
  let commitMessage = commitMessageList[commitMessageListIndex]
    .replace(WHITESPACES_HARDCODED_REGEX, "")
    .replace(FIXES_OR_DEPENDS_REGEX, "")
    .replace(SPACE_REGEX, " ");
  // console.log(commitMessage);
  // console.log("-------------");
  // console.log(prBodyStriped);
  // console.log("-------------");
  if (commitMessage == prBodyStriped) PR_BODY_IN_COMMIT_MESSAGES = true;
}

console.log(PR_BODY_IN_COMMIT_MESSAGES);

if (!PR_BODY_IN_COMMIT_MESSAGES) {
  console.error(
    "PR Body does not match any existing commit message\n" +
      "Please make sure that the PR Body matches to minimum one of the commit messages\n" +
      "Please refer the following PR for reference: https://github.com/hyperledger/cacti/pull/3338\n" +
      "And the commit message here: https://github.com/hyperledger/cacti/pull/3338/commits/47ebdec442d30fa48c8518b876c47c38097cf028",
  );
  process.exit(-1);
}
