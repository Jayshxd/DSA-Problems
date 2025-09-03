package com.dsa.problems.binary_search;

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1,1,1};
        int target = 0;
        boolean result = binarySearch(arr,target);
        System.out.println(result);
    }


    public static boolean binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[low]==arr[mid] && arr[high]==arr[mid]){
                low++;
                high--;
                continue;
            }
            else if(arr[low]<=arr[mid]){
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
        return false;
    }
}
