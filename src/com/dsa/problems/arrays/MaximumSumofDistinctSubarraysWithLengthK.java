package com.dsa.problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class MaximumSumofDistinctSubarraysWithLengthK {
    class Solution {
        public long maximumSubarraySum(int[] a, int k) {
            long maxi = 0;
            long sum = 0;
            int i = 0; int j = 0;
            int n = a.length;
            Set<Integer> set = new HashSet<>();
            while(j<n){
                while(set.contains(a[j])){
                    sum-=a[i];
                    set.remove(a[i]);
                    i++;
                }
                sum+=a[j];
                set.add(a[j]);
                if(j-i+1==k){
                    maxi = Math.max(sum,maxi);
                    sum-=a[i];
                    set.remove(a[i]);
                    i++;

                }
                j++;
            }
            return maxi;
        }
    }
}
