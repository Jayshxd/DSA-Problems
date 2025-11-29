package com.dsa.problems.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int res = sumOfDigits(56793);
        System.out.println(res);
    }

    public static int sumOfDigits(int n){
        if(n==0) return 0;
        return (n%10)+sumOfDigits(n/10);
    }
}
