package com.epam.reflection.Ex2;

class SomeClass {
    public static int someMethod(long num) {
        int a = 0;
        for (int i = 0; i < num; i++) {
            a += i % 4 == 0 ? i : 1;
        }
        return a;
    }
}
