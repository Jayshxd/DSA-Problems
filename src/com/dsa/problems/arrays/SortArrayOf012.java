package com.dsa.problems.arrays;

import java.util.Arrays;

public class SortArrayOf012 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort(arr);

    }
    //T : O(n log n)
    //S : O(1)
    //Brute
    static void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
