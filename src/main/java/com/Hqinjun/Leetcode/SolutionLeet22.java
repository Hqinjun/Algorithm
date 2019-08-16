package java.com.Hqinjun.Leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionLeet22 {
    public static List<String> generateParenthesis(int n) {
        List<String> stringList = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        generateParenthesis(stringList,n,"",0,0);
        return stringList;
    }
    public static  void generateParenthesis( List<String> stringList , int n , String s,int a,int b) {
        if (a == n && b == n) {
            stringList.add(s);
            return;
        }
        if (a < n)
            generateParenthesis(stringList, n, s + "(", a + 1, b);
        if (a > b)
            generateParenthesis(stringList, n, s + ")", a, b + 1);
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
