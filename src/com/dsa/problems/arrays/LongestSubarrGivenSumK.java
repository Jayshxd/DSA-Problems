package com.dsa.problems.arrays;
public class LongestSubarrGivenSumK {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};
        int k = 10;
        int result = generateAllSubarrays(arr,k);
        int result1 = optimal(arr,k);
        System.out.println(result1);
    }

    static int generateAllSubarrays(int[] arr, int k){
        int sum = 0;
        int longest = 0;
        for(int i =0; i<arr.length; i++){
            sum = 0;
            for(int j = i;j<arr.length;j++){
                sum = sum + arr[j];
                if(sum==k){
                    longest = Math.max(i-j+1,longest);
                }
            }
        }
        return longest;
    }
    static int optimal(int[] arr, int k){
        int sum = arr[0];
        int longest = 0;
        int left = 0;
        int right = 0;
        while(right<arr.length){
            while(sum>k){
                sum -= arr[left];
                left++;

            }
            if(sum==k){
                longest = Math.max(right-left+1,longest);
            }
            right++;
            if(right<arr.length) {
                sum = sum + arr[right];
            }
        }
        return longest;
    }
}