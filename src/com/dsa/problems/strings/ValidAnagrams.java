package com.dsa.problems.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class ValidAnagrams {
    public boolean isAnagram(String s, String t){
        int[] arr = new int[26];
        for(char i : s.toCharArray()){
            arr[i-'a']++;
        }
        for(char i : t.toCharArray()){
            arr[i-'a']--;
        }
        for(int i : arr){
            if(i!=0) return false;
        }

        return true;
    }

    public boolean isAnagram2(String s, String t){
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new TreeMap<>();
        for(char i : s.toCharArray()) map1.put(i,map1.getOrDefault(i,0)+1);
        for(char i : t.toCharArray()) map2.put(i,map2.getOrDefault(i,0)+1);
        return map1.equals(map2);
    }


    public boolean isAnagram3(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.equals(sc,tc);

    }
}