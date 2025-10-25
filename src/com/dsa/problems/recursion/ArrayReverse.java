package com.dsa.problems.recursion;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        func(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void func(int i,int j,int[] arr){
        if(i>=j)return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        func(i+1,j-1,arr);
    }
}
