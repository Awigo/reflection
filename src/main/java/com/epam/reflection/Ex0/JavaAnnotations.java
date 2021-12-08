package com.epam.reflection.Ex0;

import java.util.ArrayList;
import java.util.List;

class JavaAnnotations {
    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        List someList = List.of(1,2,3);
        @SuppressWarnings("unchecked")
        List<Integer> listOfIntegers = someList;
        System.out.println(listOfIntegers);
    }
}
