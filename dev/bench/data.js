window.BENCHMARK_DATA = {
  "lastUpdate": 1718603341750,
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
      }
    ]
  }
}