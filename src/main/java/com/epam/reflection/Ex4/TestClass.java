package com.epam.reflection.Ex4;

public class TestClass {
    @Test
    public static void m1() {}

    @Test
    public static void m2() {
        throw new RuntimeException("Boom");
    }

    @Test
    public void m3() {}

    @Test
    public static void m4() {
        throw new RuntimeException("Crash");
    }

    @Test
    public static void m5() {
    }
}