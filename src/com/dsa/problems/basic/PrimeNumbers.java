package com.dsa.problems.basic;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 15655;
        for(int i = 2; i<n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int n){
        if(n<=1)return false;
        int c = 2;
        while(c*c<=n){
            if(n%c==0)
                return false;
            c++;
        }
        return true;
    }
}
