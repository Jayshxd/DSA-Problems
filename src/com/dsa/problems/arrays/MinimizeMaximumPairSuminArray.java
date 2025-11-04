package com.dsa.problems.arrays;

import java.util.Arrays;

public class MinimizeMaximumPairSuminArray {

    class Solution {
        public int minPairSum(int[] nums) {
            Arrays.sort(nums);
            int i = 0,j=nums.length-1,maxi=0;
            while(i<j){
                int sum = nums[i]+nums[j];
                maxi = Math.max(sum,maxi);
                i++;
                j--;

            }
            return maxi;

        }
    }

}
