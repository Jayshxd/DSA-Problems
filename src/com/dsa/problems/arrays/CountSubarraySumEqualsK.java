package com.dsa.problems.arrays;

public class CountSubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr ={3, 1, 2, 4};
        int k = 6;
        int n = arr.length;
        int result = brute(arr,k,n);
        System.out.println(result);
    }

    static int brute(int[] arr,int k,int n){
        int sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            sum = 0;
            for(int j =i;j<n;j++){
                sum+=arr[j];
                if(sum==k) count++;
            }
        }
        return count;
    }

}
