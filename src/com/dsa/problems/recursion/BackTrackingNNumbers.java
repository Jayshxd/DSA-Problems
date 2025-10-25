package com.dsa.problems.recursion;

public class BackTrackingNNumbers {
    public static void main(String[] args) {
        func(10);
    }
    public static void func(int n){
        if(n<10) return;
        func(n-1);
        System.out.println(n);
    }
}
