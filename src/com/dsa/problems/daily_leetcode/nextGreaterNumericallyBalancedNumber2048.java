package com.dsa.problems.daily_leetcode;
import java.util.Arrays;
public class nextGreaterNumericallyBalancedNumber2048 {
    class Solution {
        public int nextBeautifulNumber(int n) {
            int[] arr = new int[10];
            n = n+1;
            while(true){
                int temp = n;
                Arrays.fill(arr,0);
                while(temp>0){
                    int num = temp%10;
                    arr[num]++;
                    temp=temp/10;
                }
                boolean flag = true;
                for(int i = 0; i<arr.length; i++){
                    if(arr[i]==0 && i!=0){
                        continue;
                    }
                    if(arr[i]!=i){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    return n;
                }
                n++;
            }

        }
    }
}
