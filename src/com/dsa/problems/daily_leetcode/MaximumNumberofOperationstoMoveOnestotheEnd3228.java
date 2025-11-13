package com.dsa.problems.daily_leetcode;

public class MaximumNumberofOperationstoMoveOnestotheEnd3228 {
    class Solution {
        public int maxOperations(String s) {
            int n = s.length();
            char[] a= s.toCharArray();

            int i = 0;
            int count = 0;
            int total = 0;
            while(i<n){
                if(a[i]=='0'){
                    total+=count;
                    while(i<n && a[i]=='0')i++;
                }else{
                    count++;
                    i++;
                }
            }
            return total;
        }
    }
}
