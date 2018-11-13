package com.execrise.cn;

import java.util.Objects;

/**
 * @author mengyiren
 */
public abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request) {
        if (Objects.nonNull(request)) {
            next.handleRequest(request);
        }
    }

    protected void printHandling(Request request) {
        System.out.println(this + "处理器,正在处理请求:" + request);
    }
}
