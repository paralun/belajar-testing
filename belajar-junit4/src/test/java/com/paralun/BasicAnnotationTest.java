package com.paralun;

import org.junit.*;

public class BasicAnnotationTest {

    /* Run once, e.g. Database connection, connection pool */
    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }

    /* Run once, e.g close connection, cleanup */
    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }

    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - runBeforeTestMethod");
    }

    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

    @Test
    public void testMethod1() {
        System.out.println("@Test - Method1");
    }

    @Test
    public void testMethod2() {
        System.out.println("@Test - Method2");
    }

}
