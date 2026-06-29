package com.adarsh.junit;

public class StringOperations {

    public String getMessage() {
        return "Hello JUnit";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public String getNullValue() {
        return null;
    }

    public void divide(int a, int b) {
        int result = a / b;
    }
}