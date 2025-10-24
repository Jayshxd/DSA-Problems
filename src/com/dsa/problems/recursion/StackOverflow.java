package com.dsa.problems.recursion;

public class StackOverflow {
    static {
        // Static block inside class (runs before main)
        for (int i = 1; i <= 10; i++) {
            StackOverflow.main(new String[]{});
        }
    }

    public static void main(String[] args) {
        try {
            func(1);
        } catch (StackOverflowError e) {
            System.out.println("Stack overflow at depth reached!");
        }
    }

    public static void func(int n) {
        System.out.println(n);
        func(n + 1);
    }
}
