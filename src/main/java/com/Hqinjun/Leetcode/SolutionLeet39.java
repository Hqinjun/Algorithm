package java.com.Hqinjun.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionLeet39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        int nums = 0;
        combinationSum(candidates,target,lists,list,nums);
        return lists;

    }

    public void combinationSum(int[] candidates, int target,List<List<Integer>> lists,
                               List<Integer> list,int nums ) {
        if(nums == target){
            lists.add(new ArrayList<Integer>(list));
            return;
        }
        if (nums > target){
            return;
        }

        for(int i = 0; i < candidates.length ; i++){
            if( list.size() ==0 || candidates[i] >= list.get(list.size()-1)){
                list.add(candidates[i]);
                nums+=candidates[i];
                combinationSum(candidates,target,lists,list,nums);
                nums-=candidates[i];
                list.remove((Integer) candidates[i]);
            }

        }



    }
    public static void main(String[] args) {
        int[] nums = {7,3,2};
        System.out.println(new SolutionLeet39().combinationSum(nums,18));
    }
}
