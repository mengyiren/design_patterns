package com.execrise.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

/**
 * @author mengyiren
 */
public class Retry<T> implements BusinessOperation<T> {

    private final BusinessOperation<T> op;
    private final int maxAttempts;
    private final long delay;

    private final Predicate<Exception> test;
    private final AtomicInteger attempts;
    private final ArrayList<Exception> errors;

    public Retry(BusinessOperation<T> op, int maxAttempts, long delay, Predicate<Exception>... ignoreTest) {
        this.op = op;
        this.maxAttempts = maxAttempts;
        this.delay = delay;
        this.attempts = new AtomicInteger();
        this.test = Arrays.stream(ignoreTest).reduce(Predicate::or).orElse(e -> false);
        this.errors = new ArrayList<>();
    }

    public List<Exception> errors() {
        return Collections.unmodifiableList(this.errors);
    }

    public int attempts() {
        return this.attempts.intValue();
    }

    @Override
    public T perform() throws BusinessException {
        do {
            try {
                return this.op.perform();
            } catch (BusinessException e) {
                this.errors.add(e);

                if (this.attempts.incrementAndGet() >= this.maxAttempts || !this.test.test(e)) {
                    throw e;
                }

                try {
                    Thread.sleep(this.delay);
                } catch (InterruptedException e1) {
                }
            }
        } while (true);
    }

}
