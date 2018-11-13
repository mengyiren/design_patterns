package com.execrise.cn;

/**
 * @author mengyiren
 */
public class OrcKing {
    RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request request) {
        chain.handleRequest(request);
    }
}
