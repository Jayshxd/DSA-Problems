package com.dsa.problems.arrays.RemoveDuplicates;
import java.util.*;
public class Sol1{
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4};
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : arr){
            if(!(list.contains(x))){
                list.add(x);
            }
        }
        System.out.println(list);

    }
}