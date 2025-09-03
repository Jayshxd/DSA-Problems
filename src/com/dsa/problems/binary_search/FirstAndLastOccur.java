package com.dsa.problems.binary_search;

import java.util.Arrays;

public class FirstAndLastOccur {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        linearSearch(arr,target);
        int[] result = binarySearch(arr,target);
        System.out.println(Arrays.toString(result));
    }
    //Brute Force
    //T : O(n)
    //S : O(1)
    public static void linearSearch(int[] arr,int target){
        int first = -1;
        int last = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                if(first==-1){
                    first = i;
                }
                last = i;
            }
        }
        System.out.println("first:"+first+" last:"+last);
    }

    //Optimal
    //T : O(LogN)
    //S : O(1)
    public static int[] binarySearch(int[] arr,int target){
        int first = -1;
        int last = -1;
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = low + ((high-low)/2);
            if(arr[mid]==target){
                first = mid;
                high = mid - 1;

            }else if(arr[mid]>target){
                high = mid - 1;

            }else{
                low = mid + 1;
            }
        }

        low = 0;
        high = n-1;
        while(low<=high){
            int mid = low + ((high-low)/2);
            if(arr[mid]==target){
                last = mid;
                low = mid + 1;
            }else if(arr[mid]>target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return new int[]{first ,last};
    }


}
