package com.dsa.problems.binary_search;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 6;
        int result = binarySearch(arr,target);
        System.out.println(result);
    }
    //T : O(n) -> Brute
    //S : O(1)
    public static int linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //T : O(LogN) -> Optimal
    //S : O(1)
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
