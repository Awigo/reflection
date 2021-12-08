package com.epam.reflection.Ex2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ReflectionTime {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        SomeClass someClass = new SomeClass();
        long num = 100_000_000;

        long start = System.nanoTime();
        int result = someClass.someMethod(num);
        long end = System.nanoTime();
        long elapsedTimeInSecond = (end - start);
        System.out.println(end);
        System.out.println(start);
        System.out.println("Result = " + result + " and time for calculation was :" + elapsedTimeInSecond);

        Method someMethod = someClass.getClass().getMethod("someMethod", long.class);
        start = System.nanoTime();
        result = (int) someMethod.invoke(null, num);
        end = System.nanoTime();
        elapsedTimeInSecond = end - start;
        System.out.println(end);
        System.out.println(start);
        System.out.println("Result = " + result + " and time for calculation was :" + elapsedTimeInSecond);
    }
}


