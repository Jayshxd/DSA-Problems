package com.dsa.problems.arrays;
public class NumAppearsOnce {
    public static void main(String[] args) {
        int [] arr = {4,1,2,1,2,4};
        int res1 = searchAndCount(arr);
        int res2 = xor(arr);
        System.out.println(res1);
        System.out.println(res2);
    }

    //T : O(n^2)
    //S : O(1)
    public static int searchAndCount(int[] arr){
        for (int i : arr) {
            int count = 0;
            for (int j : arr) {
                if (i == j) {
                    count++;
                }
            }
            if (count == 1) return i;
        }
        return 0;
    }


    //T : O(n)
    //S : O(1)
    public static int xor(int[] arr){
        int xor = 0;
        for(int i : arr){
            xor = xor ^ i;
        }
        return xor;
    }


}