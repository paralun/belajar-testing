package com.paralun;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestEquals {
    Kalkulator kalkulator = new Kalkulator();

    @Test
    public void testAdd() {
        int result = kalkulator.addInt(10, 10);
        assertEquals("nilai harusnya 20", 20, result);
    }
}
