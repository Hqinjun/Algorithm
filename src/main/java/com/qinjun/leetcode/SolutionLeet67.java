package com.qinjun.leetcode;

public class SolutionLeet67 {
    public static String addBinary(String a, String b) {
        if(a.length() < b.length()){
            String s = b;
            b = a;
            a = s;
        }
        int i = 0;
        int ax = a.length();
        int by = b.length();
        int nums = 0;
        String res = "";
        while (by > 0){
            nums = a.charAt(ax - 1) - '0' + b.charAt(by - 1) - '0' +nums / 2;
            res = nums % 2 + res;
            by--;
            ax--;
        }
        while (ax > 0){
            nums = a.charAt(ax - 1) - '0' +nums / 2;
            res = nums % 2 + res;
            ax--;
        }
        if(nums / 2 == 1){
            res = 1 + res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1","111"));
    }
}
