package java.com.Hqinjun.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionLeet18 {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            if (nums.length < 4) {
                return res;
            }
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                for (int j = i + 1; j < nums.length; j++) {

                    if (j > i + 1 && nums[j] == nums[j - 1]) {
                        continue;
                    }
                    int l = j + 1;
                    int r = nums.length - 1;
                    while (l < r) {
                        int sum = nums[i] + nums[j] + nums[l] + nums[r];
                        if (sum == target) {
                            res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                            while (l < r && nums[l] == nums[l + 1]) l++;
                            while (l < r && nums[r] == nums[r - 1]) r--;
                            l++;
                            r--;
                        } else if (sum < target) {
                            l++;
                        } else {
                            r--;
                        }
                    }
                }
            }
            return res;
        }
//        ---------------------
//                作者：码蹄疾
//        来源：CSDN
//        原文：https://blog.csdn.net/hit1110310422/article/details/80934545?utm_source=copy
//        版权声明：本文为博主原创文章，转载请附上博文链接！



//    public ArrayList<ArrayList<Integer>> fourSum(int[] numbers, int target) {
//        Arrays.sort(numbers);
//        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
//        fourSum(ret, new ArrayList<Integer>(), numbers, 0, target,0);
//        return ret;
//    }
//
//    private void fourSum(ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> condidate, int[] numbers, int curIndex,
//                     int target,int nums) {
//        // 以后求n数和，只要改这里就能解决，比如4改为3，改为5
//        if (condidate.size() == 4 && nums == target) {
//                ret.add(new ArrayList<>(condidate));
//            return;
//        }
//        if (curIndex > numbers.length - 1) {
//            return;
//        }
//        for (int i = curIndex; i < numbers.length; i++) {
//            // 如果是一样的数字，直接忽略，否则会有重复的答案
//            if (i != curIndex && numbers[i] == numbers[i - 1]) {
//                continue;
//            }
//            condidate.add(numbers[i]);
//            // 如果已经大于target，并且当前数字大于0，再循环加下去已经没有意义了，因为只会更大，直接return
//            if (nums > target && numbers[i] > 0) {
//                if (!condidate.isEmpty()) {
//                    condidate.remove(condidate.size() - 1);
//                }
//                return;
//            }
//            fourSum(ret, condidate, numbers, i + 1, target,nums+numbers[i]);
//            if (!condidate.isEmpty()) {
//                condidate.remove(condidate.size() - 1);
//            }
//        }
//    }

//    private int getSum(ArrayList<Integer> condidate) {
//        int total = 0;
//        for (Integer num : condidate) {
//            total += num;
//        }
//        return total;
//    }
//

//    public static  List<List<Integer>>  fourSum(int[] numbers, int target) {
//        Arrays.sort(numbers);
//        List<List<Integer>> ret = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        int[] ints = new int[numbers.length];
//        fourSum(numbers,target,ret,list,0,0,ints,0);
//        return ret;
//    }
//
//    public static void fourSum(int[] numbers, int target,
//                               List<List<Integer>> ret,List<Integer> list,
//                               int low,int nums,int[] ints,int l) {
//
//        if(low ==4 && nums == target){
//            ret.add(new ArrayList<>(list));
//            return;
//        }
//        for(int i =l; i < numbers.length; i++){
//            if(ints[i]==0){
//                ints[i] = 1;
//                list.add(numbers[i]);
//                fourSum(numbers,target,ret,list,low+1,nums+numbers[i],ints,i+1);
//                list.remove((Integer)numbers[i]);
//                ints[i] = 0;
//            }
//            while(i+1 < numbers.length && numbers[i]==numbers[i+1]){
//                i++;
//            }
//        }
//    }


    public static void main(String[] args) {
       int[] nums = {1, 0, -1, 0, -2, 2};
       System.out.println(new SolutionLeet18().fourSum(nums,0));
    }
}
