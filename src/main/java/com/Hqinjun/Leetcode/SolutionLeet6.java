package java.com.Hqinjun.Leetcode;

public class SolutionLeet6 {
    public static String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        int len = s.length();
        //StringBuilder tmpe = new StringBuilder();
        String tmpe="";
        int hang = 0;
        if (numRows == 1 || len <= numRows)
            return s;

        if(len > 2 * numRows - 1 && (2*numRows - 2) > 0){
            hang = len / (2*numRows - 2) * (numRows - 1);
            int yu = len % (2 * numRows - 2);
            int tphang = 1;
            while (tphang<numRows){
                if(yu <= numRows){
                    tphang = tphang;
                    break;
                }
                yu--;
                tphang++;
            }
            hang += tphang;
        }


        int f = 0;
        char[][] tmpes = new char[hang][numRows];
        here:
        for(int j = 0; j < hang; j++){
            for (int i = 0; i < numRows; i++){
                for(int x = numRows; x > 0; x--){
                    if(f == len)
                    break here;
                    char cs = s.charAt(f);
                  tmpes[j][i++] = cs;
                    f++;
                  if(f >= len){
                      break here;
                  }
                }
            }
            int  i =numRows - 1;
            for( int y = numRows - 2; y > 0; y--){
                j++;
                i--;
                if(i < numRows && j < hang)
                tmpes[j][i] = s.charAt(f);
                f++;
                if(f > len){
                    break here;
                }
            }
        }

        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < hang; j++){
                if(tmpes[j][i]!='0'){
                    tmpe+=tmpes[j][i];
                }
            }
        }

        return tmpe;
    }


    //有索引关联
    public static String convert2(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }


    public static void main(String[] args) {
        System.out.println(convert2("ABQWERTYJN",5));
    }
}
