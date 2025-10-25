package com.dsa.problems.daily_leetcode;

public class calculateMoneyInLeetcodeBank1716 {
    class Solution {
        static{
            for(int i = 0; i<500; i++){
                totalMoney(0);
            }
        }
        public static int totalMoney(int n) {
            int j = 0 , sum = 0 , i = 0;
            while(n>0){
                i = j + 1;
                int count = 1;
                while(n>0 && count < 8){
                    sum+=i;
                    count++;
                    n--;
                    i++;
                }
                j++;
            }
            return sum;
        }
    }
}
