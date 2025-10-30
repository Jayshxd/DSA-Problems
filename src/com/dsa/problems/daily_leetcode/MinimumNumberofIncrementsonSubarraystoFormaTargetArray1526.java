package com.dsa.problems.daily_leetcode;

public class MinimumNumberofIncrementsonSubarraystoFormaTargetArray1526 {
    class Solution {
        public int minNumberOperations(int[] target) {
            int s = target[0];
            for (int i = 1; i < target.length; i++)
                if (target[i] > target[i - 1])
                    s += (target[i] - target[i - 1]);
            return s;
        }
    }
}
