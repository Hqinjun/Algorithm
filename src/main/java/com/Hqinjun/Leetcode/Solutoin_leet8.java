package java.com.Hqinjun.Leetcode;

import java.util.Map;
import java.util.TreeMap;

public class Solutoin_leet8 {
    public static int myAtoi(String str) {
        int a = 0;
        if(str == null || str .equals("") ){
            return 0;
        }
        //str = str.replaceFirst(" ","");
        char[] chars = str.toCharArray();
        int len = str.length();

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0;i < len; i++){
            String s = String.valueOf(chars[i]);
            String next = "";
            if(i+1<len){
                next = String.valueOf(chars[i+1]);
            }

            if(!(s.equals(" ") ||s.equals("-") || s.equals("+") || s.matches("\\d"))){
                break;
            }
            if( s.equals("-") || s.equals("+")){
                if (next.matches("\\d")){
                } else {
                    break;
                }
            }
            if(s.matches("\\d") ){
                if (i+1 <= len && next.matches("\\d")) {
                    stringBuilder.append(s);
                } else {
                    stringBuilder.append(s);
                    break;
                }
            }


        }
        if(stringBuilder.toString().equals("")){
            return 0;
        }
        long aLong = 0;
        try {
            aLong = Long.valueOf(stringBuilder.toString());
        }catch (Exception e){
            return 0;
        }

        double ceil = Math.pow(2,31) - 1;
        double fool = Math.pow(-2,31);
        if(aLong >= ceil ){
            return (int)ceil;
        }
        if(aLong <= fool){
            return (int)fool;
        }

        return (int) aLong;
    }




    public static int myAtoi2(String str) {
        double ceil = Math.pow(2,31) - 1;
        double fool = Math.pow(-2,31);
        if(str == null || str .equals("") ){
            return 0;
        }
        String temp = str.replaceAll("\\d", "#");
        char[] chars = str.toCharArray();
        char[] tempChars = temp.toCharArray();
        Map<Integer, Character> map = new TreeMap<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if(!(tempChars[i]=='#'||tempChars[i]=='+'||tempChars[i]=='-'||tempChars[i]==' ')){
                break;
            }
            if(tempChars[i]=='+' || tempChars[i]=='-'){
                if (i+1<len && tempChars[i + 1]=='#'){
                } else {
                    break;
                }
            }

            if (tempChars[i]=='#') {
                if (i+1<len && String.valueOf(tempChars[i + 1]).equals("#")) {
                    map.put(i, chars[i]);
                } else {
                    map.put(i, chars[i]);
                    break;
                }
            }
        }
        int f = 1;
        StringBuilder stringBuilder = new StringBuilder();
        int maplen =  map.size();
        int[] keys = new int[maplen];
        int i =0;
        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            int a = entry.getKey();
            char b = entry.getValue();
            keys[i++] = a;
            stringBuilder.append(b);
        }
        if(map.size()>0) {
            int one = keys[0];
            if (one >= 2) {
                char fuhao = str.charAt(one - 1);
                char fuhaoofter = str.charAt(one - 2);
                if (fuhaoofter == '+'||fuhaoofter=='-') {
                    f = 0;

                } else if (fuhaoofter == ' ' || !String.valueOf(fuhao).matches("\\d")){
                    if (fuhao == '-') {
                        f = -1;
                    } else if(fuhao == '+' ||fuhao == ' ' || !String.valueOf(fuhao).matches("\\d")){
                        f = 1;
                    }
                }

            }
            if (one - 1 == 0) {
                char fuhao = str.charAt(one - 1);
                if (fuhao == '-') {
                    f = -1;
                }
            }
            if (one == 0) {
                f = 1;
            }
        }
        long aLong = 0;
        if(stringBuilder.toString().equals("")){
            return 0;
        }
        try {
            aLong = Long.valueOf(stringBuilder.toString());
        }catch (Exception e){
            if(f == 1)
            return (int )ceil;
            return (int)(fool);
        }
        aLong*=f;

        if(aLong >= ceil ){
            return (int)ceil;
        }
        if(aLong <= fool){
            return (int)fool;
        }
        return (int) aLong;

    }
        public static void main (String[] args) {
            //"+-2","words and 987","+0 123"，"-91283472332","" ," " , "+"," -42"
            String[] s = {"+-2","words and 987","+0 123","-91283472332","" ," " , "+"," -42","20000000000000000000","-   234"};
            for(String str :s){
                System.out.println(myAtoi(str));
            }
            System.out.println(myAtoi("+0 123"));
            System.out.println('\'');
        }

}
