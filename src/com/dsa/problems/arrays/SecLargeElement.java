package com.dsa.problems.arrays;
public class SecLargeElement {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,5,12,3,6};
        int result = solution(arr);
        System.out.println(result);
    }
    static int solution(int[] arr){
        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;
        if(arr.length<2) return -1;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>large){
                secLarge = large;
                large=arr[i];
            }else if(arr[i]>secLarge && arr[i]<large) {
                secLarge = arr[i];
            }
        }
        return secLarge;

    }
}
