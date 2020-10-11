package com.paralun;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class IgnoreTest {

    @Test
    public void testMath1() {
        assertThat(1 + 1, is(2));
    }

    @Ignore
    @Test
    public void testMath2() {
        assertThat(1 + 1, is(7));
    }
}
