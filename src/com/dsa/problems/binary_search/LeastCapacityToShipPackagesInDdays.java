package com.dsa.problems.binary_search;

public class LeastCapacityToShipPackagesInDdays {
    public static void main(String[] args) {
        int[] weights = {5,4,5,2,3,4,5,6};
        int d = 5;
        int result = binarySeachOnAnswers(weights,d);
        System.out.println(result);
    }


    //T : O(Log(sum(weights) - max(weights)+1)*N)
    //S : O(1)
    static int binarySeachOnAnswers(int[] weights, int d) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i : weights){
            low = Math.max(i,low);
            high += i;
        }
        while(low<=high){
            int capacity = low + ((high - low)/2);
            int totalDays = countDays(weights,capacity);
            if(totalDays<=d){
                high = capacity-1;
            }else{
                low = capacity+1;
            }
        }
        return low;
    }

    private static int countDays(int[] weights, int capacity) {
        int day = 1;
        int load = 0;
        for(int weight : weights){

            if(load+weight > capacity){
                day++;
                load = weight;
            }else{
                load += weight;
            }

        }
        return day;
    }
}

/*
if (load + weight > capacity)
iska matlab hai:
👉 Kya current din ka ship, ab tak ka load + agla package ka weight mila ke utha sakta hai ya nahi?

Case 1: Agar load + weight <= capacity
➡️ Matlab ship abhi bhi sambhal sakta hai
👉 Toh package ko current din me hi daal dete hai
load += weight;




Case 2: Agar load + weight > capacity
➡️ Matlab current din ka ship full ho gaya, aur agla package usme fit nahi ho sakta.
👉 Ab kya karna hoga?

Ek naya din start karna hoga → day++

Aur naya din start hote hi, us din ka pehla package hoga weight → load = weight;


 */
