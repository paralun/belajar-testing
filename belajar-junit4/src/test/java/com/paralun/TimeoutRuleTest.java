package com.paralun;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

public class TimeoutRuleTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(2);

    @Test
    public void testSlowMethod1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
    }
}
