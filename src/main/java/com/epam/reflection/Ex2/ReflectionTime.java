package com.epam.reflection.Ex2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectionTime {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        int TIMES = 100;

        long start1 = System.nanoTime();
        for (int i = 0; i < TIMES; i++) {
            calculate(i);
        }
        long stop1 = System.nanoTime();
        System.out.println(stop1 - start1);

        Method method = Class.forName("com.epam.reflection.Ex2.ReflectionTime").getDeclaredMethod("calculate", int.class);
        long start2 = System.nanoTime();
        for (int i = 0; i < TIMES; i++) {
            method.invoke(null, i);
        }
        long stop2 = System.nanoTime();
        System.out.println(stop2 - start2);
    }

    public static int calculate(int i) {
        return i % 15 == 3 ? i : i * 17;
    }
}


