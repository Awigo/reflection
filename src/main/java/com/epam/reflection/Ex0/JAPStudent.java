package com.epam.reflection.Ex0;

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

    @Override
    public String toString() {
        return "JAPStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", notebook=" + notebook +
                '}';
    }

    public static void main(String[] args) {
        //some code here
    }
}

