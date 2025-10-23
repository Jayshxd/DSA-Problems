package com.dsa.problems.strings;

public class StringCompression {
        public int compress(char[] a) {
            int i = 0;
            int index = 0;
            int n = a.length;
            while(i<n){
                char cc = a[i];
                int count = 0;
                while(i<n && a[i]==cc){
                    count++;
                    i++;
                }
                a[index++]=cc;
                if(count>1){
                    String temp = String.valueOf(count);
                    for(char ch : temp.toCharArray()){
                        a[index++]=ch;
                    }
                }
            }
            return index;
        }

}
