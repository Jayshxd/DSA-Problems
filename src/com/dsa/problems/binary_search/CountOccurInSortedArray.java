package com.dsa.problems.binary_search;

public class CountOccurInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,9,9,9,9};
        int target = 9;
        int result = count(arr,arr.length,target);
        System.out.println(result);

    }
    public static int count(int[] arr, int n, int target) {
        //Your code goes here
        int first = -1;
        int last = -1;
        //int n = arr.length;
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
        if(first!=-1){
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
        }
        if(first==-1) return 0;
        return last-first+1;
    }
}
