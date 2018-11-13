package com.execrise.cn;

import lombok.Getter;

/**
 * @author mengyiren
 */
@Getter
public class Request {
    private final RequestType requestType;

    private final String requestDescription;

    private boolean handled;

    public Request(RequestType requestType, String requestDescription) {
        this.requestDescription = requestDescription;
        this.requestType = requestType;
    }

    public void markHandled() {
        this.handled = true;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
