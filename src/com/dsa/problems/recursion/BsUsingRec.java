package com.dsa.problems.recursion;

public class BsUsingRec {
    public static void main(String[] args) {
        int[] arr = {1,22,44,555,666,777,8888};
        int t = 777;
        System.out.println(bs(arr,0,arr.length-1,t));
    }

    private static int bs(int[] arr, int start, int end , int t) {
        if(start>end){
            return -1;
        }
        int m = start + (end-start)/2;
        if(arr[m]==t){
            return m;
        }
        if(arr[m]<t){
            return bs(arr,m+1,end,t);
        }
        return bs(arr,start,m-1,t);
    }
}
