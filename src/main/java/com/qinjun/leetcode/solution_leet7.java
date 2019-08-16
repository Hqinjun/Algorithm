package com.qinjun.leetcode;

public class solution_leet7 {
    public static int reverse(int x) {
        int a = 1;
        double ceil = Math.pow(2,31) - 1;
        double fool = Math.pow(-2,31);
        if(x >= ceil || x <= fool){
            return 0;
        }
        if(x < 0){
            a = -1;
            x *= -1;
        }

        String s = String.valueOf(x);
        char[] chars = new char[s.length()];
        for(int i = s.length()-1 ,j=0; i >= 0 && j < s.length(); i--,j++){
            chars[i] = s.charAt(j);
        }
        s = String.valueOf(chars);

        long y = Long.valueOf(s);
        if(y >= ceil || y <= fool){
            return 0;
        }
        return (int) (a*y);

    }

    public static void main(String[] args) {
        System.out.println(reverse(-1563847412));
    }
}
