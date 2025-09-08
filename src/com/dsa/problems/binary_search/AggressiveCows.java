package com.dsa.problems.binary_search;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] position = {0,3,4,7,10,9};
        int cows = 4;
        int result = binarySearchOnAnswers(position,cows);
        System.out.println(result);
    }

    static int binarySearchOnAnswers(int[] position, int cows) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1] - position[0];
        while(low<=high){

            int dist = low + (high-low)/2;
            if(isPossible(position,dist,cows)){
                low = dist + 1;

            }else{
                high = dist - 1;
            }
        }
        return high;
    }

    static boolean isPossible(int[] position,int dist,int cows){
        int cowsPlaced = 1;
        int lastPost = position[0];
        for(int i=1;i<position.length;i++){
            if(position[i]-lastPost >= dist){
                cowsPlaced++;
                lastPost = position[i];
            }
        }
        return cowsPlaced >= cows;
    }
}
