package com.dsa.problems.arrays.RemoveDuplicates;
import java.util.*;
public class Sol2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5};
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        System.out.println(set);
    }
}