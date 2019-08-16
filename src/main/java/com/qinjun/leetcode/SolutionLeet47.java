package com.qinjun.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionLeet47 {
    public static List<List<Integer>> permuteUnique(int[] nums) {
       Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] pos = new int[nums.length];
        permuteUnique(nums,0,list,lists,pos);
        return lists;
    }
    public static void permuteUnique(int[] nums,int low,List<Integer> list, List<List<Integer>> lists,   int[] pos ) {
        if(low == nums.length){
            lists.add(new ArrayList<Integer>(list));
            return ;
        }
        //数组计数老牛逼了
        for(int i = 0; i < nums.length; i++){
            if( pos[i] == 0 ){
                list.add(nums[i]);
                pos[i] = 1;
                permuteUnique(nums,low+1,list,lists,pos);
                pos[i] = 0;
                list.remove(list.size()-1);
                while (i < nums.length-1 && nums[i] == nums[i+1]){
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(permuteUnique(nums));

    }
}
