package com.qinjun.leetcode;

public class SolotionLeet34 {
    public static int[] searchRange(int[] nums, int target) {

        int[] n = new int[2];

        if(nums==null||nums.length==0){
            n[0] = -1;
            n[1] = -1;
            return n;
        }
        boolean isnums = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                n[0] = i;
                isnums = true;
                break;
            }
        }
        for(int j = n[0]; j < nums.length; j++){
            if(nums[j]==target ){
                n[1] = j;
            }
        }
        if (!isnums){
            n[0] = -1;
            n[1] = -1;
            return n;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(searchRange(nums,2));
    }
}
