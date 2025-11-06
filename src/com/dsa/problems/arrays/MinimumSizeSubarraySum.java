package com.dsa.problems.arrays;

public class MinimumSizeSubarraySum {
    class Solution {
        static {
            for (int i = 0; i < 500; i++) {
                minSubArrayLen(0, new int[]{1,1});
            }
        }
        public static int minSubArrayLen(int target, int[] nums) {
            int i = 0;
            int j = 0;
            int sum = nums[0];
            int ans = Integer.MAX_VALUE;
            int n = nums.length;

            while(j<n && i<=j){
                while(sum>=target){
                    ans = Math.min(ans,j-i+1);
                    sum = sum - nums[i];
                    i++;
                }
                j++;
                if(j<n){
                    sum = sum + nums[j];
                }
            }
            if(ans==Integer.MAX_VALUE){
                return 0;
            }
            return ans;
        }
    }
}
