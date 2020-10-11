package belajar.junit5;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayName("Standar Tes Saja")
public class StandardTests {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Pertamakali dijalankan");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Terakhir dijalankan");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Dijalankan pertamakali disetiap method test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Dijalankan terakhir disetiap method test");
    }

    @Test
    public void succeedingTest() {
        System.out.println("sukses");
        assertEquals(10, 10);
    }

    @Test
    @Disabled
    public void failingTest() {
        fail("a failing test");
    }

    @Test
    @Disabled
    public void skippedTest(){

    }

    @Test
    public void abortedTest() {
        assumeTrue("abc".contains("g"));
        fail("test should have been aborted");
    }
}
