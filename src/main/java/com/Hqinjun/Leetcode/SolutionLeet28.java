package java.com.Hqinjun.Leetcode;

public class SolutionLeet28 {
    public int strStr(String haystack, String needle) {
        //return haystack.indexOf(needle);
        if(needle.length()==0)
            return 0;
        int length = haystack.length();
        int length_s = needle.length();
        int i =0 ,j = 0;
        if(length<length_s)
            return -1;
        for(i=0;i<=length-length_s;++i)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                for(j=1;j<length_s;++j)
                {
                    if(haystack.charAt(i+j)==needle.charAt(j))
                        continue;
                    else
                        break;
                }
                if(j==length_s)
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
