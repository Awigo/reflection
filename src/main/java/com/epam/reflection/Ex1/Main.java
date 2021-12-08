package com.epam.reflection.Ex1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<?> trickyClass = Class.forName("com.epam.reflection.Ex1.Tricky");
        Constructor<?> constructor = trickyClass.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object o = constructor.newInstance("Kaczka");
        Method m = trickyClass.getDeclaredMethod("show");
        m.setAccessible(true);
        m.invoke(o);
    }
}
