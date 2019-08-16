package java.com.Hqinjun.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_leet17 {
     static char[][] chars ={{'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','z','y'}
    };
    public static List<String> letterCombinations(String digits) {
        List<String> charList = new ArrayList<>();
        if(digits!=null && digits.length() <= 0){
            return charList;
        }
        letterCombinations("",digits,0,charList);
        return charList;
    }
    public static void letterCombinations(String s,String digits,int low,List<String> charList){
        if(low >= digits.length()){
            charList.add(s);
            return;
        }
        int i = Integer.valueOf(digits.charAt(low)+"");
        char[] chars1 = chars[i-2];
        for(int k = 0; k<chars1.length; k++){
            letterCombinations(s+chars1[k],digits,low+1,charList);
        }

    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
