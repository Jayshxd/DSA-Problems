package com.dsa.problems.arrays;

import java.util.ArrayList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        int n = arr.length;
        ArrayList<Integer> r = brute(arr, n);
        ArrayList<Integer> r1 = reverseTraversal(arr, n);
        System.out.println(r1);
    }

    /*
    Time Complexity: O(N^2) { Since there are nested loops being used, at the worst case n^2 time would be consumed }.

Space Complexity: O(N) { There is no extra space being used in this approach. But, a O(N) of space for ans array will be used in the worst case }.
     */
    static ArrayList<Integer> brute(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean check = true;
            for (int j = i; j < n; j++) {
                if (arr[j] > arr[i]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                list.add(arr[i]);
            }

        }
        return list;
    }

    //Optimal
    /*
    Time Complexity: O(N) { Since the array is traversed single time back to front, it will consume O(N) of time where N = size of the array }.

Space Complexity: O(N) { There is no extra space being used in this approach. But, a O(N) of space for ans array will be used in the worst case }.
     */
    static ArrayList<Integer> reverseTraversal(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxi) {
                list.add(arr[i]);
                maxi = arr[i];
            }
        }
        return list;
    }
}
