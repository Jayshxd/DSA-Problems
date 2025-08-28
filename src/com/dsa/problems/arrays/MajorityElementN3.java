package com.dsa.problems.arrays;

import java.util.Arrays;

public class MajorityElementN3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3,1,2,3,1,1,2,2,3,3};
        mooreVotingAlgo(arr);

    }
    static void mooreVotingAlgo(int[] arr){
        int c1 = 0,c2=0;
        int ele1 =Integer.MIN_VALUE,ele2 = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(c1==0 && ele2!=arr[i]){
                ele1=arr[i];
            }else if(c2==0 && ele1!=arr[i]){
                ele2=arr[i];
            }
            if(arr[i]==ele1){
                c1++;
            }else if(arr[i]==ele2){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }

        c1=0;c2=0;
        for(int i : arr){
            if(i==ele1){
                c1++;
            }else if(i==ele2){
                c2++;
            }
        }
        if(c1>arr.length/3) System.out.println(ele1);
        if(c2>arr.length/3) System.out.println(ele2);
        if(c1<=arr.length/3 && c2<=arr.length/3)System.out.println("Nope");

    }
}
