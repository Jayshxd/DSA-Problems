package com.dsa.problems.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4};
        solution3(arr);
        for(int x : arr){
            System.out.print(x+" ");
        }

    }

    static void solution1(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int x : arr){
            if(!(list.contains(x))){
                list.add(x);
            }
        }
        System.out.println(list);
    }
    static void solution2(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        System.out.println(set);
    }
    static void solution3(int[] arr){
        int n = arr.length;
        int j = 0;
        for(int i = 1; i<n; i++){
            if(arr[i]!=arr[j]){
                arr[j+1]=arr[i];
                j++;
            }
        }
        for(int i = j+1; i<n; i++){
            arr[i]=0;
        }
    }

}
