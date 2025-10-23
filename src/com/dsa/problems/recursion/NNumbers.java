package com.dsa.problems.recursion;

public class NNumbers {
    public static void main(String[] args) {
        fact(10);
    }
    public static void fact(int n){
        if(n==0) return;
        System.out.println(n);
        fact(n-1);
    }
}
