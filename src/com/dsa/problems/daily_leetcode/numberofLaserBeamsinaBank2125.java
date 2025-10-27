package com.dsa.problems.daily_leetcode;

public class numberofLaserBeamsinaBank2125 {
    class Solution {
        public int numberOfBeams(String[] bank) {

            int n = bank.length;
            int m = bank[0].length();

            int prev = 0;
            int curr = 0;
            int total = 0;
            for(int i = 0; i<n; i++){
                int count = 0;
                char[] arr = bank[i].toCharArray();
                for(int x : arr){
                    if(x-'0'==1){
                        count++;
                    }
                }
                if(count==0) continue;
                curr = count;
                if(prev!=0){
                    total+=(prev*curr);
                }
                prev=curr;
            }
            return total;
        }
    }
}
