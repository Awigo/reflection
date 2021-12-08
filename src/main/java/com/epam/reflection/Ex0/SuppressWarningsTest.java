package com.epam.reflection.Ex0;

import java.util.List;

class SuppressWarningsTest {
    public static void main(String[] args) {
        List someList = List.of(1, 2, 3);
        List<Integer> listOfIntegers = someList;
        System.out.println(listOfIntegers);
    }
}
