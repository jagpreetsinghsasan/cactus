`@hyperledger/cactus-test-cmd-api-server`
=================================================================================================================

This is the test package for the package that’s called `cactus-cmd-api-server`

Usage
--------------------------------------------

// TODO: DEMONSTRATE API

FAQ
----------------------------------------

### **What is a dedicated test package for?**

This is a dedicated test package meaning that it verifies the integration between two packages that are somehow dependent on each other and therefore these tests cannot be added properly in the child package due to circular dependency issues and it would not be fitting to add it in the parent because the child package’s tests should not be held by the parent as a matter of principle.

[Previous](cactus-test-api-client.md "@hyperledger/cactus-test-api-client") [Next](cactus-test-tooling.md "@hyperledger/cactus-test-tooling")

* * *
