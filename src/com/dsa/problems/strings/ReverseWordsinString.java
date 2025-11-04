package com.dsa.problems.strings;

import java.util.ArrayList;

public class ReverseWordsinString {
    class Solution {
        public String reverseWords(String s) {
            StringBuilder str = new StringBuilder();
            int i = 0;
            ArrayList<String> list = new ArrayList<>();

            while (i < s.length()) {
                while (i < s.length() && s.charAt(i) == ' ') i++;
                while (i < s.length() && s.charAt(i) != ' ') {
                    str.append(s.charAt(i));
                    i++;
                }
                if (str.length() > 0) {
                    list.add(str.toString());
                    str.setLength(0);
                }
            }

            for (int x = list.size() - 1; x >= 0; x--) {
                str.append(list.get(x));
                if (x != 0) str.append(' ');
            }

            return str.toString();
        }
    }

}
