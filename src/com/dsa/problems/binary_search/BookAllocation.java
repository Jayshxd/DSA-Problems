package com.dsa.problems.binary_search;

public class BookAllocation {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int k = 2;
        int result = splitArray(arr, k);
        System.out.println(result);
    }
    public static int splitArray(int[] nums, int k) {
        if(nums.length<k) return -1;
        int low = 0;
        int high = 0;
        for(int i : nums){
            low=Math.max(i,low);
            high+=i;
        }
        while(low<=high){
            int sum = low + ((high-low)/2);
            int total = isPossible(nums,sum,k);
            if(total<=k){
                high = sum - 1;
            }else{
                low = sum + 1;
            }
        }
        return low;

    }
   static int isPossible(int[] arr, int sum , int k){
        int count=1;
        long total = 0;
        for(int i = 0; i<arr.length; i++){

            if(total+arr[i]>sum){
                count++;
                total = arr[i];
            }else{
                total+=arr[i];
            }

        }
        return count;
    }
}
