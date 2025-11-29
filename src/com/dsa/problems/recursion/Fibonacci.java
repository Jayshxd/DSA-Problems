package com.dsa.problems.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        print(50);

    }

    private static int fibo(int i) {
        if(i<2){
            return i;
        }
        return fibo(i-1)+fibo(i-2);
    }

    public static void print(int i){
        if(i==0){
            return;
        }
        int ans = fibo(i);
        System.out.println(ans);
        print(i-1);
    }
}
