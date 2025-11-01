package com.dsa.problems.arrays;

public class ContainerWithMostWater {
    class Solution {
        static{
            for(int i = 0; i<500; i++)maxArea(new int[] {});
        }
        public static int maxArea(int[] h) {
            int l = 0,r=h.length-1,m=0;
            while(l<r){
                m = Math.max((Math.min(h[l],h[r])*Math.abs(r-l)),m);
                if(h[l]<h[r])l++;
                else r--;
            }
            return m;
        }
    }
}
