package com.execrise.cn;

/**
 * @author mengyiren
 */
public class OrcCommander extends RequestHandler {
    public OrcCommander(RequestHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            printHandling(request);
            request.markHandled();
        } else {
            super.handleRequest(request);
        }
    }

    @Override
    public String toString() {
        return "OrcCommander{}";
    }
}
