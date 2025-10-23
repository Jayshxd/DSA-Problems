package com.dsa.problems.strings;

public class DetectCapital {
    static class Solution {
        public boolean detectCapitalUse(String word) {
            return allCap(word) || allSmall(word,0) || (Character.isUpperCase(word.charAt(0)) && allSmall(word,1));

        }
        public boolean allCap(String s ){
            int i = 0;
            while(i<s.length()){
                if(!Character.isUpperCase(s.charAt(i))){
                    return false;
                }
                i++;
            }
            return true;
        }
        public boolean allSmall(String s,int start){
            int i = start;
            while(i<s.length()){
                if(!Character.isLowerCase(s.charAt(i))){
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    static class Solution2 {
        public boolean detectCapitalUse(String s) {
            return s.equals(s.toUpperCase()) || s.equals(s.toLowerCase()) ||
                    (Character.isUpperCase(s.charAt(0)) && s.substring(1).equals(s.substring(1).toLowerCase()));
        }
    }


}
