package com.dsa.problems.binary_search;

public class PeakElementInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,5,1};
        int result = binarySearch(arr);
        int result2 = linearSearch(arr);
        System.out.println(result);
        System.out.println(result2);
    }

    //T :O(n) -> Brute
    //S : O(1)
    static int linearSearch(int[] arr){

        for(int i = 0; i < arr.length; i++){
            if((i==0 || arr[i]>arr[i-1]) && (i==arr.length-1 || arr[i]>arr[i+1])){
                return i;
            }
        }
        return -1;
    }


    //T : O(LogN) -> Optimal
    //S : O(1)
    static int binarySearch(int[] arr){
        if(arr.length==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[arr.length-1]>arr[arr.length-2]) return arr.length-1;
        int low = 1;
        int high = arr.length-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
