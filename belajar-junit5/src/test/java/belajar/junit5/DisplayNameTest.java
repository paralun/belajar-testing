package belajar.junit5;

import belajar.junit5.service.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator")
public class DisplayNameTest {

    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("Test Function Add Calculator")
    public void addTest() {
        Integer result = calculator.add(10, 10);
        assertEquals(20, result, "Hasilnya harus success");
    }
}
