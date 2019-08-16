package java.com.Hqinjun.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SolutionLeet26 {
    public static int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i<nums.length){
            int k = nums[i];
            list.add(k);
            while (i < nums.length && k == nums[i]){
                i++;
            }
        }
        int[] d = new int[list.size()];
        for(int j = 0;j<list.size();j++) {
            nums[j] = list.get(j);
        }


            return list.size();
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
