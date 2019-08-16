package com.qinjun.leetcode;

import java.util.Arrays;

public class SolutionLeet31 {
    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        int k = 0;
        here:
        for(int i = len-1 ; i >= 0; i--){
            int key = nums[i];
            for (int j =i; j < len; j++){
                if( nums[j]>nums[i] ){
                    k = i;
                    break here;
                }

            }
        }
        int min = 999;
        int m = 0;
        for (int j = k ; j < len; j++){
            if (nums[j] > nums[k] && nums[j] - nums[k] < min){
                min = nums[j] - nums[k];
                m = j;
            }
        }
        if( m !=0 ){
            int temp = nums[m];
            nums[m] = nums[k];
            nums[k] = temp;
            Arrays.sort(nums,k+1,len);
        }else {
            Arrays.sort(nums);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        nextPermutation(nums);
    }
}
