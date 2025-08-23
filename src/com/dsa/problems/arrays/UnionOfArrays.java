package com.dsa.problems.arrays;

import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int []arr2 = {2,3,4,4,5,11,12};
        usingSet(arr1,arr2);
    }
    //Works for sorted and unsorted arrays;
    //T : O(n1 + n2)
    //S : O(n1 + n2)
    static void usingSet(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            set.add(i);
        }
        System.out.println(set);

    }
}