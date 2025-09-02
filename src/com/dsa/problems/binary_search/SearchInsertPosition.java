package com.dsa.problems.binary_search;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr =  {3,5,8,15,19};
        int target = 20;
        int result = searchInsertPosition(arr,arr.length,target);
        System.out.println(result);
    }

    //T : O(LogN)
    //S : O(1)
    static int searchInsertPosition(int[] arr,int n,int target){
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low<high){
            int mid = low + ((high-low)/2);
            if(arr[mid]>=target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
