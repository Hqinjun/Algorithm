package com.qinjun.leetcode;

import java.util.HashSet;

public class Solution_leet3 {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        char[] b = s.toCharArray();
        for(char c : b){
            set.add(c);
        }

        return set.size();
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() < 1){
            return 0;
        }
        char[] b = s.toCharArray();
        int a = 0 , temp = 0 , n = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0 ; i < b.length ; i++){


            builder.append(b[i]);
            a++;
            if( i+1 < b.length && builder.toString().contains(String.valueOf(b[i+1]))){
                for(char c : builder.toString().toCharArray()){
                    if(c == b[i+1]){
                        break;
                    }
                    n++;
                }

                {
                    if(a > temp){
                        temp = a;
                    }
                }


                builder.delete(0,n+1);
                a = builder.toString().length();
                n = 0;
            }

        }
        if(a > temp){
            temp = a;
        }
        return temp;
    }
    public static void main(String[] args) {
        Solution_leet3 solution_leet3 = new Solution_leet3();
        System.out.println(solution_leet3.lengthOfLongestSubstring2("loddktdji"));
    }
}
