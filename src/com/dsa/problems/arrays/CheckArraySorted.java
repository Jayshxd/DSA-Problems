package com.dsa.problems.arrays;
public class CheckArraySorted{
    public static void main(String[] args){
        int[] arr = {9,1,2,3,4,5,7,8};
        int n = arr.length;
        solution(arr,n);
    }
    static void solution(int[] arr,int n){
        if(n<2){
            System.out.println(true);
            return;
        }
        for(int i = 1; i<n; i++){
            if(arr[i]<arr[i-1]){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
/*Time Complexity: O(N)
Space Complexity: O(1)
 */