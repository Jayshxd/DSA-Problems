package com.dsa.problems.binary_search;

public class HowManyTimesArrayRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int result = binarySearch(arr);
        System.out.println(result);
    }

    static int binarySearch(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while(low<=high){
            if(arr[low]<=arr[high]){
                ans = Math.min(ans,arr[low]);
                if(ans==arr[low]) index = low;
                break;
            }
            int mid = (low+high)/2;
            if(arr[low]<=arr[mid]){
                ans  = Math.min(ans,arr[low]);
                if(ans==arr[mid]) index = mid;
                low = mid+1;
            }else{
                ans = Math.min(ans,arr[mid]);
                if(ans==arr[mid]) index = mid;
                high = mid-1;
            }

        }
        return index;
    }
}
