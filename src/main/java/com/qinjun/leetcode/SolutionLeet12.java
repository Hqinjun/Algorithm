package com.qinjun.leetcode;

public class SolutionLeet12 {

    public static String intToRoman(int num) {
        int a = 0, b = 0,c = 0,d = 0;
        a = num / 1000+1;
        b = num % 1000 / 100+1;
        c = num % 100/10+1;
        d = num % 10+1;
        String[][] nums= {
                {"","I","II", "III"," IV","V","VI","VII","VIII","IX"},
                {"","X","XX", "XXX"," XL","L","LX","LXX","LXXX","XC"},
                {"","C","CC", "CCC"," CD","D","DC","DCC","DCCC","CM"},
                {"","M","MM", "MMM"}
        };
        String s = nums[3][a-1] + nums[2][b-1] + nums[1][c-1] + nums[0][d-1];
        return s.replace(" ","");
    }

    public static void main(String[] args) {
        char a = 'I';
        char a2 ='V'; //5
        char a3 ='X'; //10
        char a4 ='L'; //50
        char a5 ='C'; //100
        char a6 ='D'; //500
        char a7 ='M'; //1000
        System.out.println(intToRoman(865));
    }
}
