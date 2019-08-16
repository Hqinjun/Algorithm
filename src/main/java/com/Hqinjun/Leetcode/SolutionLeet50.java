package java.com.Hqinjun.Leetcode;

public class SolutionLeet50 {
    public static double myPow(double x, int n) {
       for(int i = 0; i < n ; i++){
           x*=x;
       }
       return x;
    }

    public static void main(String[] args) {
        System.out.println(myPow(3,4));
    }
}

