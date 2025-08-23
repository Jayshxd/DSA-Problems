package com.dsa.problems.arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = arr.length;
        leftRotate(arr, k, n);
        rightRotate(arr, k, n);
    }

    static void leftRotate(int[] arr, int k, int n) {
        k = k % n;
        rotate(arr, 0, k - 1);
        rotate(arr, k, n - 1);
        rotate(arr, 0, n - 1);

    }

    static void rightRotate(int[] arr, int k, int n) {
        k = k % n;
        rotate(arr, 0, n - 1);
        rotate(arr, 0, k - 1);
        rotate(arr, k, n - 1);
    }

    static void rotate(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
