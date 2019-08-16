package com.qinjun.leetcode;

public class SolutionLeet9 {
    public static boolean isPalindrome(int x) {
        boolean  ishuiwen = true;

        if(x<0){
            return false;
        }
        char[] chars = String.valueOf(x).toCharArray();
        int len = chars.length;
        if(len%2==1){//奇数
            int length =(len-1)/2;
            for(int i = 0; i < length; i++){
                if(chars[i]!=chars[len-1-i]){
                    return false;
                }
            }

        }else {
            int length =(len)/2;
            for(int i = 0; i < length; i++){
                if(chars[i]!=chars[len-1-i]){
                    return false;
                }
            }

        }

        return  ishuiwen;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1235432185));
    }
}
