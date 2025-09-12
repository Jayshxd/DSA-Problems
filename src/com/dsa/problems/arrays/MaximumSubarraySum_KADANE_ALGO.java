package com.dsa.problems.arrays;

public class MaximumSubarraySum_KADANE_ALGO {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int result = brute(arr,n);
        int result2 = kadaneAlgo(arr,n);

        System.out.println(result2);
    }

    //T : O(N^2)
    //S : O(1)
    public static int brute(int[] arr,int n){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            sum = 0;
            for(int j = i; j<n; j++){
               sum += arr[j];
               maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
    //-2,1,-3,4i,-1,2,1,-5,4

/*
    Time Complexity: O(N), where N = size of the array.
    Reason: We are using a single loop running N times.

    Space Complexity: O(1) as we are not using any extra space.

 */
    public  static int kadaneAlgo(int[] arr,int n){
        int i = 0;
        int maxSum = Integer.MIN_VALUE;
        int sum = arr[0];
        while(i<n){
            if(sum<0){
                sum=0;
                //i++;//
            }
            sum+=arr[i];
            maxSum = Math.max(maxSum,sum);
            i++;
        }
        return maxSum;
        //if()
    }
}
