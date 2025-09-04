package com.dsa.problems.binary_search;

public class MinInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {3,3,0,3,3,3,3};
        int result = binarySearch(arr);
        System.out.println(result);
    }

    static  int binarySearch(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<arr[high]){
                high = mid;
            } else if (arr[mid]>arr[high]) {
                low = mid + 1;
            } else if (arr[mid] == arr[high]) {
                high--;
            }

        }
        return arr[low];
    }
}
