package com.dsa.problems.arrays.RotateArray;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        k = k%n;
        rotate(arr,0,n-1);
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);

        for(int i : arr){
            System.out.print(i+" ");
        }

    }
    static void rotate(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}