package com.dsa.problems.arrays;

public class MajorityElementN2 {
    public static void main(String[] args) {
        int[] arr = {4,4,2,4,3,4,4,3,2,4};
        int x = linearlyCount(arr);
        System.out.println(x);

    }
    //Brute Force
    //T : O(n^2)
    //S : O(1)
    static int linearlyCount(int [] arr){
        int count = 0;
        for(int i : arr){
            count = 0;
            for(int j  : arr){
                if(j==i){
                    count++;
                }
            }
            if(count>(arr.length/2)){
                return i;
            }

        }
        return -1;
    }
}
