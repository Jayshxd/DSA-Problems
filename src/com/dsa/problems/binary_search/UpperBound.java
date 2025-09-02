package com.dsa.problems.binary_search;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,15,19};
        int target = 9;
        int result = upperBound(arr,arr.length,target);
        System.out.println(result);
    }

    static int upperBound(int[] arr,int n,int target){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = low + ((high - low)/2);
            if(arr[mid]>target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
