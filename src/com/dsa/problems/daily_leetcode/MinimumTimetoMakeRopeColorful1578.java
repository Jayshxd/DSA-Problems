package com.dsa.problems.daily_leetcode;

public class MinimumTimetoMakeRopeColorful1578 {
    class Solution {
        public int minCost(String c, int[] t) {
            int n = t.length;
            if(n==1) return 0;
            int sum = 0;
            int prev = 0;
            for(int curr = 1; curr<n; curr++){

                if(c.charAt(prev) == c.charAt(curr)){
                    if(t[prev]<t[curr]){
                        sum+=t[prev];
                        prev=curr;
                    }else{
                        sum+=t[curr];
                    }
                }else{
                    prev=curr;
                }
            }
            return sum;
        }
    }
}
