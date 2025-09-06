package com.dsa.problems.binary_search;

public class MinDaysToMakeMBouquets {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 12, 7, 7};
        int m = 2;
        int k = 3;
        int result = binarySearchOnAnswers(arr, m, k);
        int result2 = linearSearch(arr, m, k);

        System.out.println(result2);


    }

    //T : O(max(arr)-min(arr)+1 * N) -> Brute
    //S : O(1)
    static int linearSearch(int[] arr, int m, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int x : arr) {
            low = Math.min(low, x);
            high = Math.max(high, x);
        }
        int ans = -1;
        for (int i = low; i <= high; i++) {
            if (isPossible(arr, i, m, k)) {
                ans = i;
            }
        }
        return ans;
    }

    //T : O(Log(max(arr)-min(arr)+1 * N)) -> Optimal
    //S : O(1)
    static int binarySearchOnAnswers(int[] arr, int m, int k) {
        if (((long) m * k) > arr.length) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int x : arr) {
            low = Math.min(low, x);
            high = Math.max(high, x);
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (isPossible(arr, mid, m, k)) {
                ans = mid;
                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] arr, int mid, int m, int k) {
        int count = 0;
        int total = 0;
        for (int element : arr) {
            if (element <= mid) {
                count++;
            } else {
                total += count / k;
                count = 0;
            }
        }
        total += count / k;
        return (total >= m);

    }
}
