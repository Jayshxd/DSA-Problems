package com.dsa.problems.daily_leetcode;

import java.util.HashSet;

public class TheTwoSneakyNumbersofDigitville3289 {
    class Solution {
        public int[] getSneakyNumbers(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            int[] res = new int[2];
            int count = 0; int index = 0;
            for(int i : nums){

                if(!set.add(i)){
                    res[index++] = i;
                    count++;
                }
                if(count==2) break;
            }
            return res;

        }
    }
}
