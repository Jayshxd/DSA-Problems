package com.dsa.problems.binary_search;

public class SmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        int[] arr = {44,22,33,11,1};
        int h = 5;
        int result = binarySearch(arr, h);
        int result2 = linearSearch(arr, h);
        System.out.println(result2);

    }

    //T : O(max(pile)*N);
    static int linearSearch(int[] arr, int h) {
        int max = 0;
        for (int x : arr) {
            max = Math.max(max, x);
        }
        int ans = max;

        for (int i = 1; i <= max; i++) {
            int th = compute(arr, i);
            if (th < h) {
                ans = i;
            } else if (th == h) {
                return i;
            }
        }
        return ans;
    }

    //T : O(Log(max(arr)*N);
    //S : O(1)
    static int binarySearch(int[] arr, int h) {
        int low = 1;
        int high = 0;
        for (int x : arr) {
            high = Math.max(high, x);
        }
        int ans = high;
        while (low <= high) {
            int mid = low + ((high - low) / 2);
            int th = compute(arr, mid);
            if (th <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int compute(int[] arr, int k) {
        int th = 0;
        for (int x : arr) {
            th += (int) Math.ceil(((double) x) / ((double) k));
        }
        return th;
    }
}
