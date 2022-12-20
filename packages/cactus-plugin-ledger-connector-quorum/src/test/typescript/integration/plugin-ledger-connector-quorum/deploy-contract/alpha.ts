/* eslint-disable prettier/prettier */
import HelloWorldContractJson from "../../../../solidity/hello-world-contract/HelloWorld.json";
import Web3 from "web3";

const keyStatic = {
  tessera: {
    member1: {
      publicKey: "BULeR8JyUWhiuuCMU/HLA0Q5pzkYT+cHII3ZKBey3Bo=",
    },
    member2: {
      publicKey: "QfeDAys9MPDs2XHExtc84jKGHxZg/aj52DTh0vtA3Xc=",
    },
    member3: {
      publicKey: "1iTZde/ndBHvzhcl7V68x44Vx7pl8nwx9LqnM/AfJUg=",
    },
  },
  quorum: {
    member1: {
      name: "member1",
      url: "http://127.0.0.1:20000",
      wsUrl: "ws://127.0.0.1:20001",
      privateUrl: "http://127.0.0.1:9081",
      privateKey:
        "b9a4bd1539c15bcc83fa9078fe89200b6e9e802ae992f13cd83c853f16e8bed4",
      accountAddress: "f0e2db6c8dc6c681bb5d6ad121a107f300e9b2b5",
    },
    member2: {
      name: "member2",
      url: `http://127.0.0.1:20002`,
      wsUrl: `http://127.0.0.1:20003`,
      privateUrl: "http://127.0.0.1:9082",
      privateKey:
        "f18166704e19b895c1e2698ebc82b4e007e6d2933f4b31be23662dd0ec602570",
      accountAddress: "ca843569e3427144cead5e4d5999a3d0ccf92b8e",
    },
    member3: {
      name: "member3",
      url: `http://127.0.0.1:20004`,
      wsUrl: `http://127.0.0.1:20005`,
      privateUrl: "http://127.0.0.1:9083",
      privateKey:
        "4107f0b6bf67a3bc679a15fe36f640415cf4da6a4820affaac89c8b280dfd1b3",
      accountAddress: "0fbdc686b912d7722dc86510934589e0aaf3b55a",
    },
    validator1: {
      privateKey: "0xe6181caaffff94a09d7e332fc8da9884d99902c7874eb74354bdcadf411929f1"
    }
  },
};

const keys = keyStatic;
const rpcApiHttpHostMember1 = keys.quorum.member1.url;
const quorumjs = require("quorum-js");
const web3 = new Web3(rpcApiHttpHostMember1);
quorumjs.extend(web3);

const signAcct = web3.eth.accounts.privateKeyToAccount(keys.quorum.validator1.privateKey);

const rawTransactionManager = quorumjs.RawTransactionManager(web3, {
  privateUrl: "http://localhost:9081"
});

web3.eth.getTransactionCount(`0x${keys.quorum.member1.accountAddress}`).then(txCount => {
  const newTx = rawTransactionManager.sendRawTransaction({
    gasPrice: 0,
    gasLimit: 4300000,
    value: 0,
    data: "0x" + HelloWorldContractJson.bytecode,
    from: signAcct,
    isPrivate: true,
    privateFrom: keys.tessera.member1.publicKey,
    privateFor: [keys.tessera.member2.publicKey],
    nonce: txCount
  });

  newTx
    .then((tx: any) => {
      console.log("Contract address: ", tx.contractAddress);
    })
    .catch(console.log);
});

