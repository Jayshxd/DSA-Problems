package com.dsa.problems.matrices;

public class RotateImage {
    class Solution {
        public void rotate(int[][] mat) {
            int n = mat.length;
            for(int i = 0; i<n-1; i++){
                for(int j = i+1; j<n; j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
            for(int x = 0; x<n; x++){
                int i = 0; int j = mat[x].length-1;
                while(i<j){
                    int temp = mat[x][i];
                    mat[x][i] = mat[x][j];
                    mat[x][j] = temp;
                    i++;
                    j--;
                }
            }
        }
    }
}
