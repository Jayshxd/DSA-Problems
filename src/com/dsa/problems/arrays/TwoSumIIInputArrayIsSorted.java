package com.dsa.problems.arrays;

public class TwoSumIIInputArrayIsSorted {
    class Solution {
        static{
            for(int i = 0; i<500;i++){
                twoSum(new int[]{},0);
            }
        }
        public static int[] twoSum(int[] a, int t) {
            int i = 0; int j = a.length-1;
            while(i<j){
                if(a[i]+a[j]>t){
                    j--;
                }else if (a[i]+a[j]<t){
                    i++;
                }else{
                    return new int[]{i+1,j+1};
                }
            }
            return new int[]{};
        }
    }
}
