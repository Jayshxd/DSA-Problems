package com.dsa.problems.daily_leetcode;

import java.util.Arrays;

public class MakeArrayElementsEqualtoZero3354 {

    class Solution {

        public int countValidSelections(int[] nums) {
            int result = 0;
            for(int i = 0; i<nums.length; i++){
                if(nums[i]==0){
                    if(allZero(nums,1,i)){
                        result++;
                    }

                    if(allZero(nums,-1,i)){
                        result++;
                    }
                }
            }
            return result;
        }
        public boolean allZero(int[] nums, int dir, int index){
            int[] a = Arrays.copyOf(nums,nums.length);
            int curr = index;
            int currDir = dir;

            //base condition [0,n-1]
            while(curr>=0 && curr<a.length){
                if(a[curr]==0){
                    curr+=currDir;
                }else{
                    a[curr]--;
                    currDir=-currDir;
                    curr+=currDir;
                }
            }
            for(int x : a){
                if(x!=0) return false;
            }
            return true;
        }
    }
}
