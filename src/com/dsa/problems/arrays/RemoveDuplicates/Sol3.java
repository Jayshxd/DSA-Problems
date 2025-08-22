package com.dsa.problems.arrays.RemoveDuplicates;
public class Sol3{
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,3,3,3,4,4,4};
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
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}