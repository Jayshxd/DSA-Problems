package com.dsa.problems.binary_search;

public class LowerBound {
    public static void main(String[] args) {
        int[] arr =  {3,5,8,15,19};
        int target = 9;
        int result = lowerBound(arr,arr.length,target);
        System.out.println(result);
    }

    static int lowerBound(int[] arr,int n,int target){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
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
