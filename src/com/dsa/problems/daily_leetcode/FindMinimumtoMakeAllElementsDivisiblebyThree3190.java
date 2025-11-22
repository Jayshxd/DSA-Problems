package com.dsa.problems.daily_leetcode;

public class FindMinimumtoMakeAllElementsDivisiblebyThree3190 {
    class Solution {
        public int minimumOperations(int[] nums) {
            int c = 0;
            for(int i : nums){
                if(i%3!=0) c++;
            }
            return c;
        }
    }
}
