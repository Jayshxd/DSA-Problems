package com.dsa.problems.arrays;
import java.util.Arrays;
public class largestElementInArray {

    public static void main(String[] args) {
        int[] arr = {3,1,2,4,5,12,3,6};
        int result1 = solution1(arr);
        int result2 = solution2(arr);
        System.out.println(result1);
        System.out.println(result2);
    }

    /* SOLUTION 1 : Sorting */
    static int solution1(int [] arr){
        if(arr.length==1) return arr[0];
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    /* SOLUTION 2 : COMPARING AND STORING */
    static int solution2(int [] arr){
        if(arr.length==1) return arr[0];
        int max = Integer.MIN_VALUE;
        for(int x : arr){
            max = Math.max(max,x);
        }
        return max;
    }


}