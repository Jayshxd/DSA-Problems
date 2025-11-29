package com.dsa.problems.recursion;

public class ArraySortedOrNotRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,6,7};
        boolean res = isSorted(arr,0);
        System.out.println(res);
    }

    public static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1) return true;
        if(arr[i]>arr[i+1]) return false;
        return isSorted(arr,i+1);
    }
}
