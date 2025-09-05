package com.dsa.problems.binary_search;

public class SqrtX {
    public static void main(String[] args) {
        int n = 38;
        int result = binarySearch(n);
        int result2 = linearSearch(n);
        System.out.println(result2);
    }

    //T :O(n) -> Brute
    //S : O(1)
    static int linearSearch(int n){
        int ans = 1;
        for(int i=0; i<=n; i++){
            if(i*i==n){
                return i;
            }else if(i*i<n){
                ans = i;
            }else{
                break;
            }
        }
        return ans;
    }


    //T : O(LogN) -> Optimal
    //S : O(1)
    static int  binarySearch(int n){
        int low = 0;
        int high = n;
        int ans = 1;
        while (low <= high){
            int mid = (low + high)/2;
            if(mid*mid == n){
                return mid;
            }else if(mid*mid<n){
               ans = mid;
               low = mid+1;
            }else{
                high = mid-1;
            }

        }
        return ans;
    }
}
