package com.execrise.cn;

/**
 * @author mengyiren
 */
public class OrcSoldier extends RequestHandler {
    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.COLLECT_TAX)) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "OrcSoldier{}";
    }
}
