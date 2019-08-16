package com.qinjun.leetcode;

public class SolutionLeet11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;  //首尾指针

        int maxArea = 0;    //最大的面积，最后的结果

        while (left < right) {
            maxArea = Math.max(maxArea,     //注意这里
                    Math.min(height[left], height[right])*(right - left) );

            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

}
