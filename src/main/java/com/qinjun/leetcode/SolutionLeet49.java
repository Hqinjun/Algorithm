package com.qinjun.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SolutionLeet49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,  List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);

            }else {
                List<String> list1 = new ArrayList<>();
                list1.add(strs[i]);
                map.put(key,list1);

            }
        }

        return new ArrayList(map.values());
    }




    public static void main(String[] args) {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strings));
    }
}
