window.BENCHMARK_DATA = {
  "lastUpdate": 1725511022206,
  "repoUrl": "https://github.com/jagpreetsinghsasan/cactus",
  "entries": {
    "Benchmark": [
      {
        "commit": {
          "author": {
            "email": "vramakr2@in.ibm.com",
            "name": "VRamakrishna",
            "username": "VRamakrishna"
          },
          "committer": {
            "email": "sandeepn.official@gmail.com",
            "name": "Sandeep Nishad",
            "username": "sandeepnRES"
          },
          "distinct": true,
          "id": "cc2f9c58975f72907576c529c2094b330d8b2b92",
          "message": "ci(ossf): configured GitHub action and badge for OpenSSF scorecard\n\nSigned-off-by: VRamakrishna <vramakr2@in.ibm.com>",
          "timestamp": "2024-06-10T01:11:43+05:30",
          "tree_id": "8f80768252cab6792094c2872aebb5438315caff",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/cc2f9c58975f72907576c529c2094b330d8b2b92"
        },
        "date": 1718162145653,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "cmd-api-server_HTTP_GET_getOpenApiSpecV1",
            "value": 586,
            "range": "±1.61%",
            "unit": "ops/sec",
            "extra": "179 samples"
          },
          {
            "name": "cmd-api-server_gRPC_GetOpenApiSpecV1",
            "value": 367,
            "range": "±1.70%",
            "unit": "ops/sec",
            "extra": "181 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "vramakr2@in.ibm.com",
            "name": "VRamakrishna",
            "username": "VRamakrishna"
          },
          "committer": {
            "email": "sandeepn.official@gmail.com",
            "name": "Sandeep Nishad",
            "username": "sandeepnRES"
          },
          "distinct": true,
          "id": "cc2f9c58975f72907576c529c2094b330d8b2b92",
          "message": "ci(ossf): configured GitHub action and badge for OpenSSF scorecard\n\nSigned-off-by: VRamakrishna <vramakr2@in.ibm.com>",
          "timestamp": "2024-06-10T01:11:43+05:30",
          "tree_id": "8f80768252cab6792094c2872aebb5438315caff",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/cc2f9c58975f72907576c529c2094b330d8b2b92"
        },
        "date": 1718163140726,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "plugin-ledger-connector-besu_HTTP_GET_getOpenApiSpecV1",
            "value": 743,
            "range": "±2.78%",
            "unit": "ops/sec",
            "extra": "181 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "peter.somogyvari@accenture.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": true,
          "id": "4a9ed0aecae84afb19c1a52b2de3cca35fa1a3de",
          "message": "build: add OpenAPI spec bundling, stop using URL references\n\n**IMPORTANT:** From now on, if you are changing the OpenAPI specification of any given\npackage within Cacti, please make sure to edit the template file instead of editing the\nopenapi.json specific file directly because changes in the openapi.json file will be\noverwritten by the codegen script the next time you run it.\nThis slight alteration in the development flow is the least intrusive solution I could find\nto resolving our issues with the release automation.\n\nThis change enables us to have our openapi.json files work without having remote and URL\nreferences in them (which was a blocker issue for release automation).\n\n1. The openapi.json files that we used to have are now called openapi.tpl.json where the\ntpl stands for template. Their content is equivalent to what openapi.json files used to\nhave prior to this commit.\n2. These template specs are fed into the bundler tool which then spits out the files which\nthen are saved as openapi.json files. The big change is that these bundled versions are\nno longer containing any remote nor URL references, only local ones.\n3. This means that we still get project-wide re-use of schema types from packages such as\ncactus-core-api, but we no longer suffer from the additional complexities of having to deal\nwith remote and URL references.\n4. The scirpt that performs the bundling is callable separately by executing this command\n```sh\nyarn tools:bundle-open-api-tpl-files\n```\n5. The `yarn tools:bundle-open-api-tpl-files` is also embedded as a warmup step of the\nlarger `codegen` script so there is no need usually to call the bundling script separately.\n6. The heavylifting in terms of bundling is done by the tooling script that can be found\nhere: `tools/bundle-open-api-tpl-files.ts`. On a high level what it does is loop through\nexisting `openapi.tpl.json` files throughout the project and then renders their bundled\nversion next to it as `openapi.json` which then can be used by all of our tools as a self\ncontained version of the template file which *does* still have the remote and URL references\nin it.\n\nMore information on what URL and remote references are can be read here on the official\nOpenAPI website: https://swagger.io/docs/specification/using-ref/\n\nSigned-off-by: Peter Somogyvari <peter.somogyvari@accenture.com>",
          "timestamp": "2024-06-13T14:33:28-07:00",
          "tree_id": "c843189a368387d67b759d8ab5d97edebaf04ee8",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/4a9ed0aecae84afb19c1a52b2de3cca35fa1a3de"
        },
        "date": 1718345170160,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "cmd-api-server_HTTP_GET_getOpenApiSpecV1",
            "value": 582,
            "range": "±1.51%",
            "unit": "ops/sec",
            "extra": "178 samples"
          },
          {
            "name": "cmd-api-server_gRPC_GetOpenApiSpecV1",
            "value": 361,
            "range": "±1.36%",
            "unit": "ops/sec",
            "extra": "181 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "peter.somogyvari@accenture.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": true,
          "id": "4a9ed0aecae84afb19c1a52b2de3cca35fa1a3de",
          "message": "build: add OpenAPI spec bundling, stop using URL references\n\n**IMPORTANT:** From now on, if you are changing the OpenAPI specification of any given\npackage within Cacti, please make sure to edit the template file instead of editing the\nopenapi.json specific file directly because changes in the openapi.json file will be\noverwritten by the codegen script the next time you run it.\nThis slight alteration in the development flow is the least intrusive solution I could find\nto resolving our issues with the release automation.\n\nThis change enables us to have our openapi.json files work without having remote and URL\nreferences in them (which was a blocker issue for release automation).\n\n1. The openapi.json files that we used to have are now called openapi.tpl.json where the\ntpl stands for template. Their content is equivalent to what openapi.json files used to\nhave prior to this commit.\n2. These template specs are fed into the bundler tool which then spits out the files which\nthen are saved as openapi.json files. The big change is that these bundled versions are\nno longer containing any remote nor URL references, only local ones.\n3. This means that we still get project-wide re-use of schema types from packages such as\ncactus-core-api, but we no longer suffer from the additional complexities of having to deal\nwith remote and URL references.\n4. The scirpt that performs the bundling is callable separately by executing this command\n```sh\nyarn tools:bundle-open-api-tpl-files\n```\n5. The `yarn tools:bundle-open-api-tpl-files` is also embedded as a warmup step of the\nlarger `codegen` script so there is no need usually to call the bundling script separately.\n6. The heavylifting in terms of bundling is done by the tooling script that can be found\nhere: `tools/bundle-open-api-tpl-files.ts`. On a high level what it does is loop through\nexisting `openapi.tpl.json` files throughout the project and then renders their bundled\nversion next to it as `openapi.json` which then can be used by all of our tools as a self\ncontained version of the template file which *does* still have the remote and URL references\nin it.\n\nMore information on what URL and remote references are can be read here on the official\nOpenAPI website: https://swagger.io/docs/specification/using-ref/\n\nSigned-off-by: Peter Somogyvari <peter.somogyvari@accenture.com>",
          "timestamp": "2024-06-13T14:33:28-07:00",
          "tree_id": "c843189a368387d67b759d8ab5d97edebaf04ee8",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/4a9ed0aecae84afb19c1a52b2de3cca35fa1a3de"
        },
        "date": 1718345971406,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "plugin-ledger-connector-besu_HTTP_GET_getOpenApiSpecV1",
            "value": 744,
            "range": "±2.82%",
            "unit": "ops/sec",
            "extra": "180 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "peter.somogyvari@accenture.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": true,
          "id": "092d4501ccf0e43001f2cefb0860b1bcbb0f1485",
          "message": "ci(github): add workflow for DCO check\n\nSigned-off-by: Peter Somogyvari <peter.somogyvari@accenture.com>",
          "timestamp": "2024-06-14T08:52:05-07:00",
          "tree_id": "e59a83c4ef3ce206b28d85053c8bca7119a4c82d",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/092d4501ccf0e43001f2cefb0860b1bcbb0f1485"
        },
        "date": 1718602454846,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "cmd-api-server_HTTP_GET_getOpenApiSpecV1",
            "value": 588,
            "range": "±1.64%",
            "unit": "ops/sec",
            "extra": "177 samples"
          },
          {
            "name": "cmd-api-server_gRPC_GetOpenApiSpecV1",
            "value": 355,
            "range": "±1.42%",
            "unit": "ops/sec",
            "extra": "180 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "peter.somogyvari@accenture.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": true,
          "id": "092d4501ccf0e43001f2cefb0860b1bcbb0f1485",
          "message": "ci(github): add workflow for DCO check\n\nSigned-off-by: Peter Somogyvari <peter.somogyvari@accenture.com>",
          "timestamp": "2024-06-14T08:52:05-07:00",
          "tree_id": "e59a83c4ef3ce206b28d85053c8bca7119a4c82d",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/092d4501ccf0e43001f2cefb0860b1bcbb0f1485"
        },
        "date": 1718603339716,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "plugin-ledger-connector-besu_HTTP_GET_getOpenApiSpecV1",
            "value": 719,
            "range": "±3.14%",
            "unit": "ops/sec",
            "extra": "180 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "peter.somogyvari@accenture.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": true,
          "id": "997ee75725989e02b0e83a71bb06812c1f621b31",
          "message": "docs(examples): migrate supply chain app to XDai connector\n\n1. We are in the process of decomissioning the Quorum connector and this\nis a pre-requisite to that end.\n\nDepends on #3379\n> test(test-tooling): fix BesuTestLedger start cfg: publish all ports)\n\nFixes #3272\n\nSigned-off-by: Peter Somogyvari <peter.somogyvari@accenture.com>",
          "timestamp": "2024-07-08T10:00:45-07:00",
          "tree_id": "917ab21bf7f842d66833db2d171e9fd9f26c2020",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/997ee75725989e02b0e83a71bb06812c1f621b31"
        },
        "date": 1720502588004,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "cmd-api-server_HTTP_GET_getOpenApiSpecV1",
            "value": 573,
            "range": "±1.61%",
            "unit": "ops/sec",
            "extra": "178 samples"
          },
          {
            "name": "cmd-api-server_gRPC_GetOpenApiSpecV1",
            "value": 349,
            "range": "±1.34%",
            "unit": "ops/sec",
            "extra": "180 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "aldousss.alvarez@gmail.com",
            "name": "aldousalvarez",
            "username": "aldousalvarez"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": false,
          "id": "c7fce889866f0cbfd8868d5c8293c9c3ade54ef3",
          "message": "ci(coverage): add total typescript code coverage statistics\n\nPrimary Changes\n----------------\n1. Updated the ci.yaml and ci.sh to introduce total typescript code coverage\n   statistics using jest and istanbul-merge\n2. Added Codecov to cspell.json\n\nFixes #2661\n\nSigned-off-by: aldousalvarez <aldousss.alvarez@gmail.com>",
          "timestamp": "2024-07-13T11:29:03-07:00",
          "tree_id": "518091d13dd3d4010c8db1d0a6c07d89072c7edf",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/c7fce889866f0cbfd8868d5c8293c9c3ade54ef3"
        },
        "date": 1721045137312,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "cmd-api-server_HTTP_GET_getOpenApiSpecV1",
            "value": 562,
            "range": "±1.74%",
            "unit": "ops/sec",
            "extra": "178 samples"
          },
          {
            "name": "cmd-api-server_gRPC_GetOpenApiSpecV1",
            "value": 345,
            "range": "±1.51%",
            "unit": "ops/sec",
            "extra": "181 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "vramakr2@in.ibm.com",
            "name": "VRamakrishna",
            "username": "VRamakrishna"
          },
          "committer": {
            "email": "vramakr2@in.ibm.com",
            "name": "VRamakrishna",
            "username": "VRamakrishna"
          },
          "distinct": true,
          "id": "81482ae7cf0c3b58e62a1e4acf63611038569503",
          "message": "chore(cleanup-docs): deleted last-remaining deprecated files and folders\n\nReflected pending changes to the new docs folder.\nUpdated com.jfrog.artifactory versions to fix missing dependency.\n\nSigned-off-by: VRamakrishna <vramakr2@in.ibm.com>",
          "timestamp": "2024-07-23T14:12:54+05:30",
          "tree_id": "57807bf092f668e20c2e16d28feab8ede8b8a24d",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/81482ae7cf0c3b58e62a1e4acf63611038569503"
        },
        "date": 1721741958454,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "cmd-api-server_HTTP_GET_getOpenApiSpecV1",
            "value": 571,
            "range": "±1.75%",
            "unit": "ops/sec",
            "extra": "176 samples"
          },
          {
            "name": "cmd-api-server_gRPC_GetOpenApiSpecV1",
            "value": 340,
            "range": "±1.41%",
            "unit": "ops/sec",
            "extra": "181 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "vramakr2@in.ibm.com",
            "name": "VRamakrishna",
            "username": "VRamakrishna"
          },
          "committer": {
            "email": "vramakr2@in.ibm.com",
            "name": "VRamakrishna",
            "username": "VRamakrishna"
          },
          "distinct": true,
          "id": "81482ae7cf0c3b58e62a1e4acf63611038569503",
          "message": "chore(cleanup-docs): deleted last-remaining deprecated files and folders\n\nReflected pending changes to the new docs folder.\nUpdated com.jfrog.artifactory versions to fix missing dependency.\n\nSigned-off-by: VRamakrishna <vramakr2@in.ibm.com>",
          "timestamp": "2024-07-23T14:12:54+05:30",
          "tree_id": "57807bf092f668e20c2e16d28feab8ede8b8a24d",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/81482ae7cf0c3b58e62a1e4acf63611038569503"
        },
        "date": 1721743010855,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "plugin-ledger-connector-besu_HTTP_GET_getOpenApiSpecV1",
            "value": 655,
            "range": "±2.94%",
            "unit": "ops/sec",
            "extra": "175 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "michal.bajer@fujitsu.com",
            "name": "Michal Bajer",
            "username": "outSH"
          },
          "committer": {
            "email": "9387513+outSH@users.noreply.github.com",
            "name": "Michal Bajer",
            "username": "outSH"
          },
          "distinct": true,
          "id": "b160c52f1a99f8019beb8af9d4f8c0b46cf1953c",
          "message": "feat(persistence-ethereum): migrate to separate db schema\n- Move all database entities relating to ethereum persistence plugin to\n  a seprate schema. Adjust all the files the test to work as expected after\n  that change.\n- Remove sample SQL data from GUI package, one from persistence packages should\n  be used instead.\n- Upgrade web3-utils in persistence-ethereum to fix a bug when running the\n  standalone script.\n\nDepends on #3340\n\nSigned-off-by: Michal Bajer <michal.bajer@fujitsu.com>",
          "timestamp": "2024-08-12T10:11:45+02:00",
          "tree_id": "94b091ee900c5443eb401d300d521121e6a1f15d",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/b160c52f1a99f8019beb8af9d4f8c0b46cf1953c"
        },
        "date": 1723457534343,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "cmd-api-server_HTTP_GET_getOpenApiSpecV1",
            "value": 585,
            "range": "±1.66%",
            "unit": "ops/sec",
            "extra": "180 samples"
          },
          {
            "name": "cmd-api-server_gRPC_GetOpenApiSpecV1",
            "value": 320,
            "range": "±2.19%",
            "unit": "ops/sec",
            "extra": "179 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "michal.bajer@fujitsu.com",
            "name": "Michal Bajer",
            "username": "outSH"
          },
          "committer": {
            "email": "9387513+outSH@users.noreply.github.com",
            "name": "Michal Bajer",
            "username": "outSH"
          },
          "distinct": true,
          "id": "b160c52f1a99f8019beb8af9d4f8c0b46cf1953c",
          "message": "feat(persistence-ethereum): migrate to separate db schema\n- Move all database entities relating to ethereum persistence plugin to\n  a seprate schema. Adjust all the files the test to work as expected after\n  that change.\n- Remove sample SQL data from GUI package, one from persistence packages should\n  be used instead.\n- Upgrade web3-utils in persistence-ethereum to fix a bug when running the\n  standalone script.\n\nDepends on #3340\n\nSigned-off-by: Michal Bajer <michal.bajer@fujitsu.com>",
          "timestamp": "2024-08-12T10:11:45+02:00",
          "tree_id": "94b091ee900c5443eb401d300d521121e6a1f15d",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/b160c52f1a99f8019beb8af9d4f8c0b46cf1953c"
        },
        "date": 1723458733310,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "plugin-ledger-connector-besu_HTTP_GET_getOpenApiSpecV1",
            "value": 664,
            "range": "±3.58%",
            "unit": "ops/sec",
            "extra": "180 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "ashnashahgrover777@gmail.com",
            "name": "ashnashahgrover",
            "username": "ashnashahgrover"
          },
          "committer": {
            "email": "9387513+outSH@users.noreply.github.com",
            "name": "Michal Bajer",
            "username": "outSH"
          },
          "distinct": true,
          "id": "bf357621fa0851b353bc112c1473332915289604",
          "message": "test(aries): refactor jest test negative test cases\n\nPrimary Changes\n----------------\n1. Refactored all the negative test case exception assertions for\ncactus-plugin-ledger-connector-aries. Removed try-catch blocks,\nreplaced with declarations through jest-extended's own API.\n\nFixes #3473\n\nSigned-off-by: ashnashahgrover <ashnashahgrover777@gmail.com>",
          "timestamp": "2024-08-22T19:33:07+02:00",
          "tree_id": "18326f08b3792932a186bddbc84ddd384eb643ee",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/bf357621fa0851b353bc112c1473332915289604"
        },
        "date": 1724737719390,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "cmd-api-server_HTTP_GET_getOpenApiSpecV1",
            "value": 600,
            "range": "±1.59%",
            "unit": "ops/sec",
            "extra": "179 samples"
          },
          {
            "name": "cmd-api-server_gRPC_GetOpenApiSpecV1",
            "value": 348,
            "range": "±2.10%",
            "unit": "ops/sec",
            "extra": "182 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "ashnashahgrover777@gmail.com",
            "name": "ashnashahgrover",
            "username": "ashnashahgrover"
          },
          "committer": {
            "email": "9387513+outSH@users.noreply.github.com",
            "name": "Michal Bajer",
            "username": "outSH"
          },
          "distinct": true,
          "id": "bf357621fa0851b353bc112c1473332915289604",
          "message": "test(aries): refactor jest test negative test cases\n\nPrimary Changes\n----------------\n1. Refactored all the negative test case exception assertions for\ncactus-plugin-ledger-connector-aries. Removed try-catch blocks,\nreplaced with declarations through jest-extended's own API.\n\nFixes #3473\n\nSigned-off-by: ashnashahgrover <ashnashahgrover777@gmail.com>",
          "timestamp": "2024-08-22T19:33:07+02:00",
          "tree_id": "18326f08b3792932a186bddbc84ddd384eb643ee",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/bf357621fa0851b353bc112c1473332915289604"
        },
        "date": 1724738640917,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "plugin-ledger-connector-besu_HTTP_GET_getOpenApiSpecV1",
            "value": 725,
            "range": "±2.47%",
            "unit": "ops/sec",
            "extra": "180 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "peter.somogyvari@accenture.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": false,
          "id": "7e7bb44c01a2d19306ecaaaa2ba2e3c574039c87",
          "message": "fix(security): address CVE-2024-39338 SSRF in axios >= 1.3.2, <= 1.7.3\n\nhttps://github.com/hyperledger/cacti/security/dependabot/1172\n\nCVE ID\nCVE-2024-39338\n\nGHSA ID\nGHSA-8hc4-vh64-cxmj\n\naxios 1.7.2 allows SSRF via unexpected behavior where requests for path\nrelative URLs get processed as protocol relative URLs.\n\nSigned-off-by: Peter Somogyvari <peter.somogyvari@accenture.com>",
          "timestamp": "2024-08-30T09:12:59-07:00",
          "tree_id": "0d531b6cecfdea199fa7b9fd51d490b915f11c3f",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/7e7bb44c01a2d19306ecaaaa2ba2e3c574039c87"
        },
        "date": 1725176829434,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "cmd-api-server_HTTP_GET_getOpenApiSpecV1",
            "value": 580,
            "range": "±1.69%",
            "unit": "ops/sec",
            "extra": "176 samples"
          },
          {
            "name": "cmd-api-server_gRPC_GetOpenApiSpecV1",
            "value": 342,
            "range": "±2.06%",
            "unit": "ops/sec",
            "extra": "182 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "peter.somogyvari@accenture.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": false,
          "id": "7e7bb44c01a2d19306ecaaaa2ba2e3c574039c87",
          "message": "fix(security): address CVE-2024-39338 SSRF in axios >= 1.3.2, <= 1.7.3\n\nhttps://github.com/hyperledger/cacti/security/dependabot/1172\n\nCVE ID\nCVE-2024-39338\n\nGHSA ID\nGHSA-8hc4-vh64-cxmj\n\naxios 1.7.2 allows SSRF via unexpected behavior where requests for path\nrelative URLs get processed as protocol relative URLs.\n\nSigned-off-by: Peter Somogyvari <peter.somogyvari@accenture.com>",
          "timestamp": "2024-08-30T09:12:59-07:00",
          "tree_id": "0d531b6cecfdea199fa7b9fd51d490b915f11c3f",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/7e7bb44c01a2d19306ecaaaa2ba2e3c574039c87"
        },
        "date": 1725177843060,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "plugin-ledger-connector-besu_HTTP_GET_getOpenApiSpecV1",
            "value": 716,
            "range": "±3.17%",
            "unit": "ops/sec",
            "extra": "181 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "peter.somogyvari@accenture.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": true,
          "id": "957da7c3e1d80068391485a825ba6bb1e68333ac",
          "message": "feat(core-api): add createIsJwsGeneralTypeGuard, createAjvTypeGuard<T>\n\n1. createAjvTypeGuard<T>() is the lower level utility which can be used\nto construct the more convenient, higher level type predicates/type guards\nsuch as createIsJwsGeneralTypeGuard() which uses createAjvTypeGuard<JwsGeneral>\nunder the hood.\n2. This commit is also meant to be establishing a larger, more generic\npattern of us being able to create type guards out of the Open API specs\nin a convenient way instead of having to write the validation code by hand.\n\nAn example usage of the new createAjvTypeGuard<T>() utility is the\ncreateIsJwsGeneralTypeGuard() function itself.\n\nAn example usage of the new createIsJwsGeneralTypeGuard() can be found\nin packages/cactus-plugin-consortium-manual/src/main/typescript/plugin-consortium-manual.ts\n\nThe code documentation contains examples as well for maximum discoverabilty\nand I'll also include it here:\n\n```typescript\nimport { JWSGeneral } from \"@hyperledger/cactus-core-api\";\nimport { createIsJwsGeneralTypeGuard } from \"@hyperledger/cactus-core-api\";\n\nexport class PluginConsortiumManual {\n  private readonly isJwsGeneral: (x: unknown) => x is JWSGeneral;\n\n  constructor() {\n    // Creating the type-guard function is relatively costly due to the Ajv schema\n    // compilation that needs to happen as part of it so it is good practice to\n    // cache the type-guard function as much as possible, for examle by adding it\n    // as a class member on a long-lived object such as a plugin instance which is\n    // expected to match the life-cycle of the API server NodeJS process itself.\n    // The specific anti-pattern would be to create a new type-guard function\n    // for each request received by a plugin as this would affect performance\n    // negatively.\n    this.isJwsGeneral = createIsJwsGeneralTypeGuard();\n  }\n\n  public async getNodeJws(): Promise<JWSGeneral> {\n    // rest of the implementation that produces a JWS ...\n    const jws = await joseGeneralSign.sign();\n\n    if (!this.isJwsGeneral(jws)) {\n      throw new TypeError(\"Jose GeneralSign.sign() gave non-JWSGeneral type\");\n    }\n    return jws;\n  }\n}\n```\n\nRelevant discussion took place here:\nhttps://github.com/hyperledger/cacti/pull/3471#discussion_r1731894747\n\nSigned-off-by: Peter Somogyvari <peter.somogyvari@accenture.com>",
          "timestamp": "2024-09-02T08:23:56-07:00",
          "tree_id": "f0a96975cecbe783530ab2031beadee53efbd0b2",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/957da7c3e1d80068391485a825ba6bb1e68333ac"
        },
        "date": 1725335400900,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "cmd-api-server_HTTP_GET_getOpenApiSpecV1",
            "value": 585,
            "range": "±1.70%",
            "unit": "ops/sec",
            "extra": "178 samples"
          },
          {
            "name": "cmd-api-server_gRPC_GetOpenApiSpecV1",
            "value": 339,
            "range": "±1.98%",
            "unit": "ops/sec",
            "extra": "180 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "peter.somogyvari@accenture.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": true,
          "id": "957da7c3e1d80068391485a825ba6bb1e68333ac",
          "message": "feat(core-api): add createIsJwsGeneralTypeGuard, createAjvTypeGuard<T>\n\n1. createAjvTypeGuard<T>() is the lower level utility which can be used\nto construct the more convenient, higher level type predicates/type guards\nsuch as createIsJwsGeneralTypeGuard() which uses createAjvTypeGuard<JwsGeneral>\nunder the hood.\n2. This commit is also meant to be establishing a larger, more generic\npattern of us being able to create type guards out of the Open API specs\nin a convenient way instead of having to write the validation code by hand.\n\nAn example usage of the new createAjvTypeGuard<T>() utility is the\ncreateIsJwsGeneralTypeGuard() function itself.\n\nAn example usage of the new createIsJwsGeneralTypeGuard() can be found\nin packages/cactus-plugin-consortium-manual/src/main/typescript/plugin-consortium-manual.ts\n\nThe code documentation contains examples as well for maximum discoverabilty\nand I'll also include it here:\n\n```typescript\nimport { JWSGeneral } from \"@hyperledger/cactus-core-api\";\nimport { createIsJwsGeneralTypeGuard } from \"@hyperledger/cactus-core-api\";\n\nexport class PluginConsortiumManual {\n  private readonly isJwsGeneral: (x: unknown) => x is JWSGeneral;\n\n  constructor() {\n    // Creating the type-guard function is relatively costly due to the Ajv schema\n    // compilation that needs to happen as part of it so it is good practice to\n    // cache the type-guard function as much as possible, for examle by adding it\n    // as a class member on a long-lived object such as a plugin instance which is\n    // expected to match the life-cycle of the API server NodeJS process itself.\n    // The specific anti-pattern would be to create a new type-guard function\n    // for each request received by a plugin as this would affect performance\n    // negatively.\n    this.isJwsGeneral = createIsJwsGeneralTypeGuard();\n  }\n\n  public async getNodeJws(): Promise<JWSGeneral> {\n    // rest of the implementation that produces a JWS ...\n    const jws = await joseGeneralSign.sign();\n\n    if (!this.isJwsGeneral(jws)) {\n      throw new TypeError(\"Jose GeneralSign.sign() gave non-JWSGeneral type\");\n    }\n    return jws;\n  }\n}\n```\n\nRelevant discussion took place here:\nhttps://github.com/hyperledger/cacti/pull/3471#discussion_r1731894747\n\nSigned-off-by: Peter Somogyvari <peter.somogyvari@accenture.com>",
          "timestamp": "2024-09-02T08:23:56-07:00",
          "tree_id": "f0a96975cecbe783530ab2031beadee53efbd0b2",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/957da7c3e1d80068391485a825ba6bb1e68333ac"
        },
        "date": 1725336401621,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "plugin-ledger-connector-besu_HTTP_GET_getOpenApiSpecV1",
            "value": 734,
            "range": "±2.94%",
            "unit": "ops/sec",
            "extra": "181 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "michal.bajer@fujitsu.com",
            "name": "Michal Bajer",
            "username": "outSH"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": true,
          "id": "bdc5cd79be7a3d1d0130bb2471cd787503b93731",
          "message": "docs(ledger-browser): add initial GUI documentation and fix some bugs\n\n- Add new documentation section to project docs. New pages can be found under\n    `Cactus` -> `Ledger Browser` category. Documentation include GUI setup\n    instructions, application overviews, developer guide and tutorial\n    on developing new app plugin for the GUI.\n- Do some minor quality of life improvements and bug fixes.\n- Add missing GUI database schema file.\n- Remove dead code from GUI that still used `getAppList`.\n- Add documentation links to the GUI. For now, most links are empty and they\n    will be set once this PR is merged and the docs URLs are confirmed.\n- Add sample tutorial application (the same that is created step-by-step in\n    the tutorial in the documentation)\n- Improve plugin app URL regex to allow more valid paths.\n- Expose ethereum and fabric schemas in supabase-all-in-one\n- Extend persistence plugin init SQL with code for exposing custom schemas.\n- Improve supabase-all-in-one readme documentation.\n- Fix persistence sample setup scripts ports so that both scripts can be run\n    at the same time.\n\nDepends on #3448\nDepends on #3449\n\nSigned-off-by: Michal Bajer <michal.bajer@fujitsu.com>",
          "timestamp": "2024-09-04T15:57:23-07:00",
          "tree_id": "8972fe7261443d25dc771b497dd7090c1b795497",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/bdc5cd79be7a3d1d0130bb2471cd787503b93731"
        },
        "date": 1725510109793,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "cmd-api-server_HTTP_GET_getOpenApiSpecV1",
            "value": 589,
            "range": "±1.63%",
            "unit": "ops/sec",
            "extra": "177 samples"
          },
          {
            "name": "cmd-api-server_gRPC_GetOpenApiSpecV1",
            "value": 347,
            "range": "±2.05%",
            "unit": "ops/sec",
            "extra": "181 samples"
          }
        ]
      },
      {
        "commit": {
          "author": {
            "email": "michal.bajer@fujitsu.com",
            "name": "Michal Bajer",
            "username": "outSH"
          },
          "committer": {
            "email": "petermetz@users.noreply.github.com",
            "name": "Peter Somogyvari",
            "username": "petermetz"
          },
          "distinct": true,
          "id": "bdc5cd79be7a3d1d0130bb2471cd787503b93731",
          "message": "docs(ledger-browser): add initial GUI documentation and fix some bugs\n\n- Add new documentation section to project docs. New pages can be found under\n    `Cactus` -> `Ledger Browser` category. Documentation include GUI setup\n    instructions, application overviews, developer guide and tutorial\n    on developing new app plugin for the GUI.\n- Do some minor quality of life improvements and bug fixes.\n- Add missing GUI database schema file.\n- Remove dead code from GUI that still used `getAppList`.\n- Add documentation links to the GUI. For now, most links are empty and they\n    will be set once this PR is merged and the docs URLs are confirmed.\n- Add sample tutorial application (the same that is created step-by-step in\n    the tutorial in the documentation)\n- Improve plugin app URL regex to allow more valid paths.\n- Expose ethereum and fabric schemas in supabase-all-in-one\n- Extend persistence plugin init SQL with code for exposing custom schemas.\n- Improve supabase-all-in-one readme documentation.\n- Fix persistence sample setup scripts ports so that both scripts can be run\n    at the same time.\n\nDepends on #3448\nDepends on #3449\n\nSigned-off-by: Michal Bajer <michal.bajer@fujitsu.com>",
          "timestamp": "2024-09-04T15:57:23-07:00",
          "tree_id": "8972fe7261443d25dc771b497dd7090c1b795497",
          "url": "https://github.com/jagpreetsinghsasan/cactus/commit/bdc5cd79be7a3d1d0130bb2471cd787503b93731"
        },
        "date": 1725511019723,
        "tool": "benchmarkjs",
        "benches": [
          {
            "name": "plugin-ledger-connector-besu_HTTP_GET_getOpenApiSpecV1",
            "value": 661,
            "range": "±3.09%",
            "unit": "ops/sec",
            "extra": "178 samples"
          }
        ]
      }
    ]
  }
}