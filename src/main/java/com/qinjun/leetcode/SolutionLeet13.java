package com.qinjun.leetcode;

public class SolutionLeet13 {
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int num = 0;
        for(int i =chars.length-1; i >= 0 ; i--){
            switch (chars[i]){
                case 'I':
                    num+=1;
                    if(i+1< chars.length && (chars[i+1]=='X'||chars[i+1]=='V')){
                        num-=2;
                    }
                    break;
                case 'V':
                    num+=5;
                    break;
                case 'X':
                    num+=10;
                    if(i+1< chars.length && (chars[i+1]=='L'||chars[i+1]=='C')){
                        num-=20;
                    }
                    break;
                case 'L':
                    num+=50;
                    break;
                case 'C':
                    num+=100;
                    if(i+1< chars.length && (chars[i+1]=='D'||chars[i+1]=='M')){
                        num-=200;
                    }
                    break;
                case 'D':
                    num+=500;
                    break;
                case 'M':
                    num+=1000;
                    break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
}
