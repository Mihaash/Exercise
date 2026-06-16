package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorControllerTest {

    CalculatorController controller =
            new CalculatorController();

    @Test
    void test1() {
        assertEquals(5, controller.add(2, 3));
    }

    @Test
    void test2() {
        assertEquals(10, controller.add(7, 3));
    }

    @Test
    void test3() {
        assertEquals(0, controller.add(0, 0));
    }

    @Test
    void test4() {
        assertEquals(-5, controller.add(-2, -3));
    }

    @Test
    void test5() {
        assertEquals(1, controller.add(-2, 3));
    }

    @Test
    void test6() {
        assertEquals(100, controller.add(50, 50));
    }

    @Test
    void test7() {
        assertEquals(1000, controller.add(600, 400));
    }

    @Test
    void test8() {
        assertEquals(-1, controller.add(-5, 4));
    }

    @Test
    void test9() {
        assertEquals(15, controller.add(10, 5));
    }

    @Test
    void test10() {
        assertEquals(200, controller.add(150, 50));
    }
}