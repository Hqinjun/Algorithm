package java.com.Hqinjun.Leetcode;

import java.util.Stack;

public class Solution20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int len = 0;
        while (len < s.length()){
            switch (s.charAt(len)){
                case '{':
                case '(':
                case '[':
                    stack.push(s.charAt(len));
                  break;
                case '}':
                    if(stack.empty()){
                        return false;
                    }
                   char chars = stack.pop();
                    if( chars == '{')
                        break;
                    return false;

                case ')':
                    if(stack.empty()){
                        return false;
                    }
                    char char2 = stack.pop();
                    if( char2 == '(')
                        break;
                    return false;
                case ']':
                    if(stack.empty()){
                       return false;
                    }
                    char char3 = stack.pop();
                    if( char3 == '[')
                        break;
                    return false;
            }
            len++;
        }
        if(stack.empty())
        return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{{{"));
    }
}
