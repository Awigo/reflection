package com.epam.reflection.Ex0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class JAPStudent {
    public String name;
    int age;
    ArrayList<String> notebook;
    private final String passwordToPC;

    JAPStudent(String name, int age, String passwordToPC, ArrayList<String> notebook) {
        this.name = name;
        this.age = age;
        this.passwordToPC = passwordToPC;
        this.notebook = notebook;
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //todo ukryc przed studentami

        Class<?> studentClass = Class.forName("com.epam.reflection.Ex0.JAPStudent");
        Constructor<?> constructor = studentClass.getDeclaredConstructor(String.class, int.class, String.class, ArrayList.class);
        Object o = constructor.newInstance("Bartek", 29, "kaczka", new ArrayList<>());
        Method toString = studentClass.getMethod("toString");
        System.out.println(toString.invoke(o));
        System.out.println(o);
    }

    @Override
    public String toString() {
        return "JAPStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", notebook=" + notebook +
                '}';
    }
}

