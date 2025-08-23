package com.dsa.problems.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};
        // 1 2 3 4 1 0 0 0
        int n = arr.length;
        extraArray(arr, n);
        placingNonZero(arr, n);
        stableShift(arr, n);
        System.out.println(Arrays.toString(arr));


    }
    //T : O(n)
    //S : O(n)
    static void extraArray(int[] arr, int n) {
        int[] newArr = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                newArr[j] = arr[i];
                j++;
            }
        }
        //java initial array is [0,0,0,0,0,0]
        //so no need to fill zeros;
        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }

    //T : O(n)
    //S : O(1)
    static void placingNonZero(int[] arr, int n){
        int j = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

    }

    //T : O(n)
    //S : O(1)
    static void stableShift(int[] arr, int n) {
        int j = 0;

        // Step 1: Move all non-zeros in order
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Step 2: Fill remaining with zeros
        while (j < n) {
            arr[j] = 0;
            j++;
        }
    }




}