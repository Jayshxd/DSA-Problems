package com.dsa.problems.arrays;

public class MaximumAverageSubarrayI {
    class Solution {
        public double findMaxAverage(int[] a, int k) {
            double avg= 0.0;
            int j = 0,i=0;
            double sum = 0.0;
            double maxi = Double.NEGATIVE_INFINITY;
            int n = a.length;
            while(j<n){
                sum+=a[j];
                if(j-i+1 == k){
                    maxi = Math.max(maxi,sum);
                    sum-=a[i];
                    i++;
                }
                j++;
            }
            return maxi/k;
        }
    }
}
