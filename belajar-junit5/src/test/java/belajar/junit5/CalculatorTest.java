package belajar.junit5;

import belajar.junit5.service.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess() {
        Integer result = calculator.add(20, 10);
        assertEquals(30, result);
    }

    @Test
    public void testAddGagal() {
        Integer result = calculator.add(20, 10);
        assertEquals(20, result);
    }
}
