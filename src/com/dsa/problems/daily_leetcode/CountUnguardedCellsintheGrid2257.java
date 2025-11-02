package com.dsa.problems.daily_leetcode;

public class CountUnguardedCellsintheGrid2257 {

    class Solution {
        public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
            int[][] mat = new int[m][n];
            for(int[] g : guards){
                mat[g[0]][g[1]] = 1;
            }
            for(int[] w : walls){
                mat[w[0]][w[1]] = 2;
            }
            for(int r = 0; r<m; r++){
                for(int c = 0; c<n; c++){
                    if(mat[r][c] == 1){


                        //right
                        for(int j = c+1; j<n; j++){
                            if(mat[r][j] == 1 || mat[r][j] == 2) break;
                            if(mat[r][j]== 0){
                                mat[r][j] = 3;
                            }
                        }
                        //left
                        for(int j = c-1; j>=0; j--){
                            if(mat[r][j] == 1 || mat[r][j] == 2) break;
                            if(mat[r][j]== 0){
                                mat[r][j] = 3;
                            }
                        }

                        //up
                        for(int i = r-1; i>=0; i--){
                            if(mat[i][c] == 1 || mat[i][c] == 2) break;
                            if(mat[i][c]== 0){
                                mat[i][c] = 3;
                            }
                        }

                        //down
                        for(int i = r+1; i<m; i++){
                            if(mat[i][c] == 1 || mat[i][c] == 2) break;
                            if(mat[i][c]== 0){
                                mat[i][c] = 3;
                            }
                        }

                    }

                }
            }

            int counter = 0;
            for(int i = 0; i<m; i++){
                for(int j = 0; j<n; j++){
                    if(mat[i][j]==0){
                        counter++;
                    }
                }
            }
            return counter;
        }
    }
}
