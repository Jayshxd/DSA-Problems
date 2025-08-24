package com.dsa.problems.arrays;

import java.util.Arrays;

public class SortArrayOf012 {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        //sort(arr);
        //manualCount(arr);
        DNF(arr);

    }
    //T : O(n log n)
    //S : O(1)
    //Brute
    static void sort(int[] arr){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Better : Faster than Arrays.sort
    //T: O(n)
    //S : O(1)
        static void manualCount(int[] arr) {
            int count0 = 0, count1 = 0, count2 = 0;

            // Count 0s, 1s, and 2s
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    count0++;
                } else if (arr[i] == 1) {
                    count1++;
                } else {
                    count2++;
                }
            }

            // Fill back into array
            for (int i = 0; i < count0; i++) {
                arr[i] = 0;
            }
            for (int i = count0; i < (count0 + count1); i++) {
                arr[i] = 1;
            }
            for (int i = (count0 + count1); i < arr.length; i++) {
                arr[i] = 2;
            }

            System.out.println(Arrays.toString(arr));
        }

        //Optimal : Dutch National Flag Algorithm
        //T : O(n) -> One pass
        //S : O(1)

    static void DNF(int[] arr){
        int left = 0;
        int mid = 0;
        int right = arr.length-1;

        while(mid<=right){
            if(arr[mid]==0){
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                left++;
                mid++;

            }else if (arr[mid]==1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right]= temp;
                mid++;
                right--;
            }

        }
        System.out.println(Arrays.toString(arr));
    }


}
