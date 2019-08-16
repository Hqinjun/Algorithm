package java.com.Hqinjun.Leetcode;

public class SolutionLeet58 {
    public static int lengthOfLastWord(String s) {
        int nums = 0;
        s = '*'+s+'*';
        String s1 = s.replaceAll(" ","*");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = s1.length()-1; i >= 0; i--){
            if(s1.charAt(i)=='*'){
                if(stringBuilder.length()>0){
                    return stringBuilder.length();
                }
            }else {
                stringBuilder.append(s1.charAt(i));
            }

        }
        return nums;
    }

    public static void main(String[] args) {
        String s = "asfaddf safs ";
        System.out.println(lengthOfLastWord(s));
    }
}
