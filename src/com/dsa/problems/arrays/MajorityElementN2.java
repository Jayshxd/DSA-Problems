package com.dsa.problems.arrays;

public class MajorityElementN2 {
    public static void main(String[] args) {
        int[] arr = {4,4,2,4,3,4,4,3,2,4};
        int x = linearlyCount(arr);
        int y = mooreVotingAlgo(arr);
        System.out.println(y);

    }
    //Brute Force
    //T : O(n^2)
    //S : O(1)
    static int linearlyCount(int [] arr){
        int count = 0;
        for(int i : arr){
            count = 0;
            for(int j  : arr){
                if(j==i){
                    count++;
                }
            }
            if(count>(arr.length/2)){
                return i;
            }

        }
        return -1;
    }

    //Optimal : Moore's Voting Algorithm
    //T : O()
    //S : O()

    static int mooreVotingAlgo(int[] arr){
        int count = 0;
        int element = 0;
        for(int i : arr){
            if(count==0){
                element = i;
            }
            if(i==element){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int i : arr){
            if(element==i) count++;
        }
        if(count>arr.length/2){
            return element;
        }
        return -1;


    }

}
