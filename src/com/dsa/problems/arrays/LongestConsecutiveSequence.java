package com.dsa.problems.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr ={100, 200, 300, 500, 200, 400};
        int n = arr.length;
        int result = bySorting(arr,n);
        int result2 = usingSet(arr,n);
        System.out.println(result2);
        System.out.println(result);

    }
    //brute
    /*
    Time: O(n log n) (sorting dominates)

Space: O(1) extra (in-place),
     */
    static int bySorting(int[] arr , int n){
        int longest = 1;
        int count = 1;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int check = arr[i]+1;
            if(arr[i+1]==check){
                count++;
            }else if(arr[i+1]!=arr[i]){
                count=1;
            }
                longest=Math.max(count,longest);
        }
        return longest;
    }


    //optimal
    /*
    Time: O(n) average case (HashSet lookup/insertion are O(1)).

Space: O(n) (storing set).
     */
    static int usingSet(int[] arr, int n){
        int longest = 1;
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        for(int i : set){
            if(!set.contains(i-1)){
                int count = 1;
                int x = i;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                longest=Math.max(count,longest);
            }
        }
        return longest;
    }
}
