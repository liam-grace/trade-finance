/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.tradefinance.common;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FabricProxyTest {
    Path walletPath = Paths.get("wallet");
    Path connectionProfilePath = Paths.get("connection.json");
    String channelName = "mychannel";
    String contractName = "mycontract";
    String org = "org1";

    public FabricProxyTest() {

    }

    // @Test public void testEvaluateTransactionReturnsJSONObject() throws IOException {
    //     FabricProxyConfig config = new FabricProxyConfig(walletPath, connectionProfilePath, channelName, contractName, org);
    //     FabricProxy classUnderTest = new FabricProxy(config);
    //     assertTrue("someLibraryMethod should return an instance of JSONObject", classUnderTest.evaluateTransaction() instanceof JSONObject);
    // }
}
