package com.qinjun.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SolutionLeet14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length<=0){
            return "";
        }
        Map<Integer,String> mapString = new HashMap<>();
        int min = strs[0].length();
        for(int i = 0; i < strs.length; i++){
            if(min >= strs[i].length()){
                min = strs[i].length();
            }
            mapString.put(i,strs[i]);
        }
        here:
        for(int j = 0; j < min; j++){
            char tempChar =  strs[0].charAt(j);
            for(int i = 0; i < strs.length; i++){
                if(tempChar != mapString.get(i).charAt(j)){
                    min = j;
                    break here;
                }
            }
        }


        return strs[0].substring(0,min);
    }

    public static void main(String[] args) {
        String[] strings ={};
        System.out.println(longestCommonPrefix(strings));
    }
}
