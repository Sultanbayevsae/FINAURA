package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int result = subtract(10, 5);
        System.out.println("Here's the result => " + result);
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
}