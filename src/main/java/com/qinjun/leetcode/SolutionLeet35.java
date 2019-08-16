package com.qinjun.leetcode;

public class SolutionLeet35 {
    public static int searchInsert(int[] nums, int target) {
        for(int i = nums.length-1 ; i >= 0; ){
            if(nums[i] == target){
                return i;
            } else if (nums[i] < target){
                return i+1;
            } else {
                i--;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,2) );
    }
}
