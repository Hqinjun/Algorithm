package java.com.Hqinjun.Leetcode;

import java.util.Arrays;

public class SolutionLeet16 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int size = nums.length;
        int start, end, res = nums[0], minn = 999999999, t;
        for (int i = 0; i < size - 2; i++) {
            start = i + 1;
            end = size - 1;
            while (start < end) {
                t = nums[start] + nums[end] + nums[i];
                if (t == target) {
                    res = t;
                    minn = 0;
                    start++;
                    end--;
                } else if (t < target) {
                    if (target - t < minn) {
                        minn = target - t;
                        res = t;
                    }
                    start++;
                } else {
                    if (t - target < minn) {
                        minn = t - target;
                        res = t;
                    }
                    end--;
                }
            }
            while (i < size - 2 && nums[i] == nums[i+1]) {
                i++;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums ={-1,2,1,-4};
        System.out.println(threeSumClosest(nums,1));
    }
}
