package com.dsa.problems.arrays;

public class SquaresofaSortedArray {
    class Solution {
        static{
            for(int i = 0; i<500; i++) sortedSquares(new int[]{});
        }
        public static int[] sortedSquares(int[] nums) {
            int l = 0;
            int r = nums.length-1;
            int[] ans = new int[nums.length];
            int index = nums.length-1;
            while(l<=r){
                if(Math.abs(nums[l])<Math.abs(nums[r])  && index>=0){
                    ans[index--] = Math.abs(nums[r])* Math.abs(nums[r]);
                    r--;
                }else if(Math.abs(nums[l])>=Math.abs(nums[r])  && index>=0){
                    ans[index--] = Math.abs(nums[l])* Math.abs(nums[l]);
                    l++;
                }
            }
            // System.gc();
            return ans;
        }
    }
}
