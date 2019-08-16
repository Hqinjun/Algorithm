package com.qinjun.leetcode;

public class SolutionLeet70 {
    static int  climbnum = 0;
//动态规划老牛逼了
    public static int climbStairs2(int n) {
        int a = 1, b = 1;
        while (n != 0) {
            b += a;
            a = b - a;
            n--;
        }
        return a;
    }
    public static int climbStairs3(int n) {
        int a1 = 1;
        int a2 = 2;
       if(n==1){
           return a1;
       }
        if(n==2){
            return a2;
        }
        int nums = 0;
        if(n >=3 ){
           for(int i = 3; i <= n; i++){
               nums = a1 + a2;
               a1 = a2;
               a2 = nums;
           }
           return nums;
        }
        return 0;
    }

    public static int climbStairs(int n) {
        int[] nums = {1,2};
        climbStairs(n,nums,0);
        return climbnum;


    }
    public static void   climbStairs(int n,int[] nums,int m) {
        if(m == n){
            climbnum++;
            return ;
        }
        if(m > n){
            return;
        }
        for(int i = 0; i < nums.length; i++){
            m += nums[i];
            climbStairs(n, nums, m);
            m -= nums[i];
        }
    }

    public static void main(String[] args) {

        System.out.println(climbStairs2(3));
    }
}
