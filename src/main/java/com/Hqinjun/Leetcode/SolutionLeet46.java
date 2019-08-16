package java.com.Hqinjun.Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SolutionLeet46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        permute(nums,0,list,lists);
        return lists;
    }
    public static void permute(int[] nums,int low,List<Integer> list, List<List<Integer>> lists){
        if(low == nums.length){
            lists.add(new ArrayList<Integer>(list));
            return ;
        }
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                permute(nums,low+1,list,lists);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(permute(nums));
    }
}
