package com.execrise.cn;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        OrcKing king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "保卫城堡"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "折磨囚犯"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "收税"));
    }
}
