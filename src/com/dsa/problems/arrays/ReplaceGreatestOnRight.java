package com.dsa.problems.arrays;

import java.util.Arrays;

public class ReplaceGreatestOnRight {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        int n = arr.length;
        int[] r = solution(arr,n);
        System.out.println(Arrays.toString(r));

    }
    //right most dont have right element so last element will always be -1
    //thats why largest = -1
    static int[] solution(int[] arr, int n){
        int largest = -1;
        for(int i = n-1; i>=0; i--){
            //we will preserve our current element
            int curr = arr[i];
            //and largest jo bhi hai wo chipkate gaye
            arr[i] = largest;
            //update kardiya largest ko
            largest = Math.max(largest,curr);
        }
        return arr;
    }
}
