package com.dsa.problems.arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {1,1,5};
        nextPermutation(arr);
    }

    static void nextPermutation(int[] arr) {
        //1 find the dip
        int index = -1;
        int n = arr.length;
        for(int i = n-2; i>=0; i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            rev(arr,0,n-1);
            return;
        }
        for(int i = n-1; i>index; i--){
            if(arr[i]>arr[index]){
                swap(arr,index,i);
                break;
            }
        }
        rev(arr,index+1,n-1);
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void rev(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
}
