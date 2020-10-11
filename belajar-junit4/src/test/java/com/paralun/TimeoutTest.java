package com.paralun;

import org.junit.Test;

public class TimeoutTest {

    // 1 seconds
    @Test(timeout = 1000)
    public void rto() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
