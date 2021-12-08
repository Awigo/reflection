package com.epam.reflection.Ex1;

class Tricky {
    private String field;

    private Tricky(String field) {
        this.field = field;
    }

    private void show() {
        System.out.println("The name of the field is " + field);
    }

}
