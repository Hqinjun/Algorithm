package java.com.Hqinjun.Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SolutionLeet {
    public int[] twoSum(int[] nums, int target) {
        int [] num_1 = {0,0};
         if (nums.length < 2){
            return num_1;
        }
        for(int i = 0 ; i < nums.length ; i++){

                 for (int j = i + 1; j < nums.length; j++) {
                     if (nums[i] + nums[j] == target) {
                         num_1[0] = i;
                         num_1[1] = j;
                     }
                 }

        }

        return  num_1;
    }


    //优化方法老牛逼了
    public int[] twoSum_leet(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int [] nums = {0,4,0,3,0};
        int [] result = new SolutionLeet().twoSum_leet( nums ,0);
        System.out.println( result[0]+"====="+result[1]);
    }
}
