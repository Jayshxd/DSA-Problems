package com.dsa.problems.daily_leetcode;

import java.util.*;

public class FindXSumofAllKLongSubarraysI3318 {
    class Solution {
        public int[] findXSum(int[] nums, int k, int x) {
            int index = 0 , n= nums.length;
            int[] ans = new int[n-k+1];
            int i = 0 , j = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            while(j<n){

                map.put(nums[j],map.getOrDefault(nums[j],0)+1);


                if(j-i+1 == k){
                    List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
                    Collections.sort(list,(a, b)->{
                        if(!b.getValue().equals(a.getValue())){
                            return b.getValue()-a.getValue();
                        }else{
                            return b.getKey()-a.getKey();
                        }
                    });
                    int count = 0; int sum = 0;
                    for(Map.Entry<Integer,Integer> entry : list){
                        if(count==x){
                            break;
                        }
                        sum = sum + (entry.getKey()*entry.getValue());
                        count++;
                    }
                    ans[index] = sum;
                    index++;

                    map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                    if(map.get(nums[i])==0){
                        map.remove(nums[i]);
                    }
                    i++;


                }
                j++;
            }
            return ans;
        }
    }
}
