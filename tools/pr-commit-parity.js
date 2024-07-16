export async function getPrMetadata(url) {
  const commitMessagesJsonResponse = await fetch(url);
  return commitMessagesJsonResponse.json();
}

const args = process.argv.slice(2);
const pullReqUrl = args[0];

const prMetaData = await getPrMetadata(pullReqUrl);
const prBodyRaw = JSON.stringify(prMetaData.body);
const prBodyStriped = prBodyRaw.replace(/\r/g, "").split("**Pull")[0];

console.log(prBodyStriped);

// const str =
//   "Alpha\r\nBeta\r\nGamma\r\n\r\n**Pull Request Requirements**\r\n- [ ] Rebased onto `upstream/main` branch and squashed into single commit to help maintainers review it more efficient and to avoid spaghetti git commit graphs that obfuscate which commit did exactly what change, when and, why.\r\n- [ ] Have git sign off at the end of commit message to avoid being marked red. You can add `-s` flag when using `git commit` command. You may refer to this [link](https://docs.github.com/en/authentication/managing-commit-signature-verification/signing-commits) for more information.\r\n- [ ] Follow the Commit Linting specification. You may refer to this [link](https://www.conventionalcommits.org/en/v1.0.0-beta.4/#specification) for more information. \r\n\r\n**Character Limit**\r\n- [ ] Pull Request Title and Commit Subject must not exceed 72 characters (including spaces and special characters).\r\n- [ ] Commit Message per line must not exceed 80 characters (including spaces and special characters).\r\n\r\n**A Must Read for Beginners**\r\nFor rebasing and squashing, here's a [must read guide](https://github.com/servo/servo/wiki/Beginner's-guide-to-rebasing-and-squashing) for beginners.";

// console.log(str.replace(/\r/g, "").split("**Pull")[0]);
