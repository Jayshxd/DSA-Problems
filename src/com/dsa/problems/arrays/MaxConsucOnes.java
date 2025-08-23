package com.dsa.problems.arrays;
public  class MaxConsucOnes{
    public static void main(String[] args) {
        int [] arr = {1, 1, 0, 1, 1, 1,1,1,1,1,1,1,1,0,1};
        int result = searching(arr);
        System.out.println(result);

    }

    //T : O(n)
    //S : O(1)
    static int searching(int[] arr){
        int count = 0;
        int maxCount = 0;
        for(int i : arr){
            if(i==1){
                count++;
            }else{
                count=0;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}