// /* eslint-disable prettier/prettier */
// import HelloWorldContractJson from "../../../../solidity/hello-world-contract/HelloWorld.json";
// import Web3 from "web3";

// const Web3Quorum = require("web3js-quorum");

// const keyStatic = {
//   tessera: {
//     member1: {
//       publicKey: "BULeR8JyUWhiuuCMU/HLA0Q5pzkYT+cHII3ZKBey3Bo=",
//     },
//     member2: {
//       publicKey: "QfeDAys9MPDs2XHExtc84jKGHxZg/aj52DTh0vtA3Xc=",
//     },
//     member3: {
//       publicKey: "1iTZde/ndBHvzhcl7V68x44Vx7pl8nwx9LqnM/AfJUg=",
//     },
//   },
//   quorum: {
//     member1: {
//       name: "member1",
//       url: "http://127.0.0.1:20000",
//       wsUrl: "ws://127.0.0.1:20001",
//       privateUrl: "http://127.0.0.1:9081",
//       privateKey:
//         "b9a4bd1539c15bcc83fa9078fe89200b6e9e802ae992f13cd83c853f16e8bed4",
//       accountAddress: "f0e2db6c8dc6c681bb5d6ad121a107f300e9b2b5",
//     },
//     member2: {
//       name: "member2",
//       url: `http://127.0.0.1:20002`,
//       wsUrl: `http://127.0.0.1:20003`,
//       privateUrl: "http://127.0.0.1:9082",
//       privateKey:
//         "f18166704e19b895c1e2698ebc82b4e007e6d2933f4b31be23662dd0ec602570",
//       accountAddress: "ca843569e3427144cead5e4d5999a3d0ccf92b8e",
//     },
//     member3: {
//       name: "member3",
//       url: `http://127.0.0.1:20004`,
//       wsUrl: `http://127.0.0.1:20005`,
//       privateUrl: "http://127.0.0.1:9083",
//       privateKey:
//         "4107f0b6bf67a3bc679a15fe36f640415cf4da6a4820affaac89c8b280dfd1b3",
//       accountAddress: "0fbdc686b912d7722dc86510934589e0aaf3b55a",
//     },
//     validator1: {
//       accountKeyStore: {
//         address: "ed9d02e382b34818e88b88a309c7fe71e65f419d",
//         crypto: {
//           cipher: "aes-128-ctr",
//           ciphertext:
//             "4e77046ba3f699e744acb4a89c36a3ea1158a1bd90a076d36675f4c883864377",
//           cipherparams: {
//             iv: "a8932af2a3c0225ee8e872bc0e462c11",
//           },
//           kdf: "scrypt",
//           kdfparams: {
//             dklen: 32,
//             n: 262144,
//             p: 1,
//             r: 8,
//             salt:
//               "8ca49552b3e92f79c51f2cd3d38dfc723412c212e702bd337a3724e8937aff0f",
//           },
//           mac:
//             "6d1354fef5aa0418389b1a5d1f5ee0050d7273292a1171c51fd02f9ecff55264",
//         },
//         id: "a65d1ac3-db7e-445d-a1cc-b6c5eeaa05e0",
//         version: 3,
//       },
//     },
//   },
// };

// const keys = keyStatic;
// const web3 = new Web3Quorum(new Web3(keys.quorum.member1.url),{privateUrl: "http://localhost:9081",},true);
// const signAcct = web3.eth.accounts.decrypt(keys.quorum.validator1.accountKeyStore, "");

// web3.eth.getTransactionCount(`0x${keys.quorum.member1.accountAddress}`).then((txCount: any) => {
//   const newTx = web3.priv.generateAndSendRawTransaction({
//     gasPrice: 0,
//     gasLimit: 4300000,
//     value: 0,
//     data: "0x" + HelloWorldContractJson.bytecode,
//     from: signAcct,
//     isPrivate: true,
//     privateFrom: keys.tessera.member1.publicKey,
//     privateFor: [keys.tessera.member2.publicKey],
//     nonce: txCount
//   });
//   newTx
//     .then((tx: any) => {
//       console.log("Contract address: ", tx.contractAddress);
//     })
//     .catch(console.log);
// });
