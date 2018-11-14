package com.execrise.cn;

/**
 * Hello world!
 */
public class App {
    private static BusinessOperation<String> op;

    public static void main(String[] args) throws Exception {
        noErrors();
        errorNoRetry();
        errorWithRetry();
    }

    private static void errorWithRetry() throws Exception {
        final Retry<String> retry = new Retry<String>(new FindCustomer("123", new CustomerNotFoundException("未找到")
                , new DataBaseNotAvailableException("数据库不存在"))
                , 3, 100, e -> CustomerNotFoundException.class.isAssignableFrom(e.getClass()));
        op = retry;
        final String customerId = op.perform();
        System.out.println(String.format("结果 %s 重试次数 %s", customerId, retry.attempts()));
    }

    private static void errorNoRetry() throws Exception {
        op = new FindCustomer("123", new CustomerNotFoundException("没发现"));
        try {
            op.perform();
        } catch (CustomerNotFoundException e) {
            System.out.println("抛出异常一次");
        }
    }

    private static void noErrors() throws Exception {
        op = new FindCustomer("123");
        op.perform();
        System.out.println("无异常抛出");
    }
}
