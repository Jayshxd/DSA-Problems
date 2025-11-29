package com.dsa.problems.recursion;

public class FactorialPrint {
    public static void main(String[] args) {

    }

    public static int func(int n){
        if(n==0) return 1;
        return n *  func(n-1);
    }

    public static void p(int n){
        if(n==0) return;
        int res = func(n);
        System.out.println(res);
        p(n-1);
    }
}
