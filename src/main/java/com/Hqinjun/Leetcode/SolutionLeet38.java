package java.com.Hqinjun.Leetcode;

public class SolutionLeet38 {
    public static String countAndSay(int n) {
        StringBuilder s = new StringBuilder("1");
        StringBuilder s1 = new StringBuilder();
        for(int i = 0 ; i < n-1; i++){
            for(int j = 0; j < s.length();){
                char key = s.charAt(j);
                int x = 0;
                for(int k = j; k<s.length(); k++){
                    if(s.charAt(k)==key){
                        x++;
                    }else {
                        break;
                    }
                }
                j=j+x;
                s1.append(x).append(String.valueOf(key));
            }
            s.setLength(0);
            s.append(s1);
            s1.setLength(0);
        }

        return s.toString();
    }


    public static void main(String[] args) {
        System.out.println(countAndSay(3));

    }
}
