package com.paralun;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;

public class Exception2Test {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testDivisionWithException() {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage(containsString("/ by zero"));
        int i = 1 / 0;
    }
}
