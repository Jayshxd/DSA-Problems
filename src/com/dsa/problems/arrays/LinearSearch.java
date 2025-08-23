package com.dsa.problems.arrays;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,5,12,3,6};
        int find = 5;
        int result = linearSearch(arr,find);
        System.out.println(result);
    }
    static int linearSearch(int[] arr, int ele){

        for(int i = 0; i< arr.length; i++){
            if(arr[i]==ele){
                return i;

            }

        }
        return -1;

    }
}