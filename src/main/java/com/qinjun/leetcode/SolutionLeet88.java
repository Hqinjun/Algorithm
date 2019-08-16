package com.qinjun.leetcode;

public class SolutionLeet88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        if(m <= 0 ){
            for(int i = 0; i<nums2.length; i++){
                nums1[i] = nums2[i];
            }

            return ;
        }
        n = n-1;
        m = m;
        for(int i = n; i >= 0; i--){
            int key = nums2[i];
            for( j = m; m < nums1.length && j-1 >=0 && nums1[j-1] > key;j-- ){
                nums1[j] = nums1[j-1];
            }
            nums1[j] = key;
            m++;
        }

    }

    public static void main(String[] args) {
      int[]  nums1 = {4,5,6,0,0,0};
       int[] nums2 = {1,2,3};
       merge(nums1,3,nums2,3);
        System.out.println("111");
    }
}
