package com.dsa.problems.arrays;
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int x = searching(arr);
        int y  = summation(arr);
        System.out.println(y);

    }
    //T : O(n^2)
    //S : O(1)
    static int searching(int[] arr){
        int n = arr.length;
        boolean flag = false;
        for(int i = 1; i<n; i++){
            flag = false;
            for(int j = 0; j<n; j++){
                if(arr[j]==i){
                    flag = true;
                }

            }
            if(!flag){
                return i;
            }

        }
        return -1;

    }

    //T : O(n)
    //S : O(1)
    static int summation(int[] arr){
        int n = arr.length;
        int N = n+1;
        int sum = N * (N+1)/2;
        int sumAll = 0;
        for(int i = 0; i<n; i++){
            sumAll += arr[i];
        }
        return sum-sumAll;
    }
}