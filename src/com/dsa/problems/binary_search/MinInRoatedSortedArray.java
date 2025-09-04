package com.dsa.problems.binary_search;

public class MinInRoatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int result = binarySearch(arr);
        System.out.println(result);

    }

    static int binarySearch(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[high]){
                ans = Math.min(ans,arr[low]);
                break;
            }
            else if(arr[low]<=arr[mid]){
                ans = Math.min(ans,arr[low]);
                low = mid+1;
            }else{
                ans = Math.min(ans,arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}
