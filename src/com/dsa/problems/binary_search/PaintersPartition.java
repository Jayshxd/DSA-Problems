package com.dsa.problems.binary_search;

public class PaintersPartition {
    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int k = 2;
        int result = binarySearchOnAnswers(boards,k);
        System.out.println(result);
    }

    public static int binarySearchOnAnswers(int[] boards, int k) {
       //impossible case
        int n = boards.length;
       if(n<k) return -1;
        //range
            //min(max(time))
            //each should get atleast 1 so for atlesat 1 the minimum should be min of arr
            //min -> max(arr)
            //max -> sum(arr)
        int low = 0, high = 0;
        for(int i : boards){
            low = Math.max(i,low);
            high += i;
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            int time = count(boards,mid);
            if(time<=k){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    static int count(int[] boards, int mid){
        int count = 1;
        int sum = 0;
        for(int i : boards){
            if(sum+i<=mid){
                sum+=i;
            }else{
                count++;
                sum=i;
            }
        }
        return count;
    }
}
