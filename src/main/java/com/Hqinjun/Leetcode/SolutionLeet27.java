package java.com.Hqinjun.Leetcode;

public class SolutionLeet27 {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for(int i = 0 ; i< nums.length;i++){
           if (nums[i]!=val){
               nums[j] = nums[i];
               j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeElement(nums,2));
    }
}
