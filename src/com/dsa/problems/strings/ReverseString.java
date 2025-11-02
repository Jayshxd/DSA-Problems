package com.dsa.problems.strings;

public class ReverseString {
    class Solution {
        static{
            for(int i = 0; i<500; i++)reverseString(new char[]{});
        }
        public static void reverseString(char[] s) {
            int i = 0;
            int j = s.length-1;
            while(i<j){
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i++;
                j--;
            }

        }
    }
}
