package com.dsa.problems.strings;

public class ReverseVowelsOfAString {
    class Solution {
        public String reverseVowels(String s) {
            char[] arr = s.toCharArray();
            int l = 0, r = arr.length - 1;

            while (l < r) {
                while (l < r && !isVowel(arr[l])) l++;
                while (l < r && !isVowel(arr[r])) r--;

                // swap vowels
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;

                l++;
                r--;
            }

            return new String(arr);
        }

        private boolean isVowel(char ch) {
            return "aeiouAEIOU".indexOf(ch) != -1;
        }
    }

}
