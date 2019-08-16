package com.qinjun.leetcode;

public class SolutionLeet66 {
    public static int[] plusOne(int[] digits) {
        int nums = 0;
        for(int i = digits.length-1; i >= 0; i--){
            if(digits[i]==9){
                nums++;
            }else{
                break;
            }
        }
        if(nums > 0 && nums < digits.length ){
            for(int i = digits.length-nums; i<digits.length;i++){
                digits[i]=0;
            }
            digits[digits.length-1-nums]++;
            return digits;

        }else if(nums == digits.length){
            int[] digits2 = new int[digits.length+1];
            digits2[0] = 1;
            return digits2;
        }else {
            digits[digits.length-1]++;
            return digits;
        }

    }

    public static void main(String[] args) {
        int[] nums = {8,9,9};
        System.out.println(plusOne(nums));
    }
}
