package java.com.Hqinjun.Leetcode;

public class Solution_leet5 {


    public static String longestPalindrome2(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static boolean isHuiWen(String msg,int low,int high) {
        if (low - high >= 0) {
            return true;
        } else if (msg.charAt(low) == msg.charAt(high)) {
            return isHuiWen(msg, low+1, high-1);
        } else {
            return false;
        }

    }

    public static String findLongestPalindrome(String s){
        int len = s.length(); // 字符串长度
        int maxlength = 0;  // 最长回文字符串长度
        int start = 0; // 回文开始的地方
        for(int i = 0; i < len; i++){
            for(int j = i ; j < len; j++){
                int index1 = 0;
                int index2 = 0;
                // 对每个子串都从两边开始向中间遍历
                for(index1 = i, index2 = j; index1 <= index2; index1 ++, index2--){
                    if(s.charAt(index1) != s.charAt(index2))
                        break;
                }
                // 若index1=index2,表示串是类似于abcba这种类型；若大于，则是abccba这种类型
                if(index1 >= index2 && j - i >= maxlength){
                    maxlength = j - i + 1;
                    start = i;
                }
            }

        }
        if(maxlength >= 0)
            return s.substring(start, start + maxlength);
        return "";

    }
    public static void main(String[] args) {

        System.out.println(findLongestPalindrome("a"));
    }
}
