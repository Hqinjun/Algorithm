package java.com.Hqinjun.Leetcode;

public class SolutionLeet53 {
    public static int maxSubArray(int[] nums) {

        int num = 0;
        if(nums.length ==1){
            return nums[0];
        }
        int max = nums[0];

        boolean is = true;
        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] > 0){
                is = false;
                num += nums[i];
                if(nums[i] > 0 && num > max){
                    max = num;
                }
                for(int j = i+1; j < nums.length; j++){
                    num += nums[j];
                    if(nums[j] > 0 && num > max){
                        max = num;
                    }
                }
            }

            num = 0;
        }
        for(int i = 0; i < nums.length; i++ ) {
            if (is) {
                num = nums[i];
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }
    public static int maxSubArray2(int[] nums) {
        int sum = nums[0];
        int n = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(n > 0) n += nums[i];
            else n = nums[i];
            if(n > sum) sum = n;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray2(nums));
    }
}
