package com.dsa.problems.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int find = binarySearch(arr,target);
        System.out.println(find);
    }

    //T : O(LogN)
    //S : O(1)
    static int  binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low+((high - low)/2);
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
               high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;

    }
}
