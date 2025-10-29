package com.dsa.problems.daily_leetcode;

public class SmallestNumberWithAllSetBits3370 {
    class Solution {
        public int smallestNumber(int n) {
            int result = 1;
            while(result<n){
                result = (result*2)+1;
            }
            return result;

        }
    }
}
