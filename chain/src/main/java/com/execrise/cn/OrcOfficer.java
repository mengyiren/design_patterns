package com.execrise.cn;

/**
 * @author mengyiren
 */
public class OrcOfficer extends RequestHandler {
    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "OrcOfficer{}";
    }
}
