package com.epam.reflection.Ex5;

public class TestClassEx {
    @ExceptionTest(RuntimeException.class)
    public static void m1() {
        throw new RuntimeException();
    }

    @ExceptionTest(NumberFormatException.class)
    public static void m2() {
        int i = 1 / 0;
    }

    @ExceptionTest(RuntimeException.class)
    public void m3() {}


}