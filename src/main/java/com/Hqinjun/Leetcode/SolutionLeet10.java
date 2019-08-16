package java.com.Hqinjun.Leetcode;

public class SolutionLeet10 {
    public static boolean isMatch(String s, String p) {
            if(s == null || p==null){
                return false;
            }
//            if(p.length() == 0){
//                return false;
//            }
//            if(p.equals(".*") ){
//                return true;
//            }
            return match2(s,0,p,0);
        }
        private static boolean match(String s,int s1,String p,int p1){
            boolean isStrDone = s1 >= s.length();
            boolean isPatDone = p1 >= p.length();

            if(isStrDone && isPatDone){
                return true;
            }
            if(!isStrDone && isPatDone){
                return false;
            }
            //一、下一个字符是*
            if(p1+1<p.length()&&p.charAt(p1+1)=='*'){
                if(isStrDone){
                    return match(s,s1,p,p1+2);
                }
                if(p.charAt(p1)==s.charAt(s1)||p.charAt(p1)=='.'&&s.charAt(s1)!='\0'){
                    return match(s,s1+1,p,p1)||match(s,s1,p,p1+2);
                }else{
                    return match(s,s1,p,p1+2);
                }
            }
            if(isStrDone&&!isPatDone){
                return false;
            }


            if(p.charAt(p1)==s.charAt(s1)||p.charAt(p1)=='.'&&s.charAt(s1)!='\0'){
                return match(s,s1+1,p,p1+1);
            }
            return false;

    }

    private static boolean match2(String s,int s1,String p,int p1){
        int lens = s.length();
        int lenp = p.length();
        if (s1 >= lens && p1 >= lenp){
            return true;
        }
        if (s1 < lens && p1 >= lenp){
            return false;
        }
        if(s1<lens){

        }

        if(p1+1<lenp && p.charAt(p1+1) == '*'){
            if( s1 >= lens){
                return match2(s,s1,p,p1+2);
            }

            if(s.charAt(s1) == p.charAt(p1) || p.charAt(p1)=='.'){

                return  match2(s,s1+1,p,p1)||match2(s,s1,p,p1+2);
            }{
                return match2(s,s1,p,p1+2);
            }

        }
        if (s1 >= lens && p1 < lenp){

            return false;
        }
        if(s.charAt(s1) ==  p.charAt(p1)  ||  p.charAt(p1)  =='.'){

            return match2(s,s1+1 ,p,p1+1);
        }

        return false;
    }


    //*表示0个或多个。.表示任意元素。 递归算法
    public static void main(String[] args) {
        System.out.println(isMatch("aa","a*"));
    }
}
