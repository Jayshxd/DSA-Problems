package com.dsa.problems.arrays;

public class SumOfMaxMin {
    /*
    Bhai chhoti si baat: interview me agar aise easy problem aaye,
    toh sorting avoid karke single pass solution likho,
    warna interviewer bolega ki tum unnecessarily extra cost laga rahe ho.
     */
    public static int maxSum(int[] arr) {
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int i : arr){
            mn = Math.min(mn,i);
            mx = Math.max(mx,i);
        }
        return mx+mn;
    }
}
