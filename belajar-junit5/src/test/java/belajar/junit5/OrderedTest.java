package belajar.junit5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
public class OrderedTest {

    @Test
    public void test2() {

    }

    @Test
    public void test1() {

    }

    @Test
    public void test3() {

    }
}
