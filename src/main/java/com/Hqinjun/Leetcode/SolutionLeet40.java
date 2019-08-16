package java.com.Hqinjun.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionLeet40 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] ints = new int[candidates.length];
        combinationSum2(candidates,target,lists,list,0,ints,0);
        return lists;
    }
    public static void combinationSum2(int[] candidates, int target,
                                       List<List<Integer>> lists,List<Integer> list,
                                       int nums,int[] ints,int low) {
        if(nums==target){
            lists.add(new ArrayList<Integer>(list));
            return;
        }
        if(nums > target){
            return;
        }
        for(int i = low; i < candidates.length; i++){


            if(ints[i] == 0 ){
                ints[i] = 1;
                list.add(candidates[i]);
                combinationSum2(candidates,target,lists,list,nums+candidates[i],ints,i+1);
                list.remove((Integer)candidates[i]);
                ints[i] = 0;
            }
            while (i < candidates.length-1 &&  candidates[i] == candidates[i+1]){
                i++;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        System.out.println(combinationSum2(nums,6));
    }
}
