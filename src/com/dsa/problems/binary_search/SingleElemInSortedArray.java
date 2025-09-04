package com.dsa.problems.binary_search;

public class SingleElemInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
        int result = xor(arr);
        int result2 = binarySearch(arr);
        System.out.println(result2);

    }

    static int xor(int[] arr){
        int xor = 0;
        for(int i : arr){
            xor = xor ^ i;
        }
        return xor;

    }

    static int linearSearch(int[] arr){
        for(int  i = 1; i<arr.length-1; i++){
            if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr){
        int low = 0;
        int high = arr.length-1;
        if(arr.length==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[arr.length-1]!=arr[arr.length-2]) return arr[arr.length-1];
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
                return arr[mid];
            }else if((mid%2==0 && arr[mid]==arr[mid+1])||(mid%2!=0 && arr[mid]==arr[mid-1])){
                low =  mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }




}
