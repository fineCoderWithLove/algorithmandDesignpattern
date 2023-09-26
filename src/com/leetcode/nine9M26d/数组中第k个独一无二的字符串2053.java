package com.leetcode.nine9M26d;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/26/21:18
 * @Description:
 */
public class 数组中第k个独一无二的字符串2053 {
    public static String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        System.out.println(map);
        for (String str : map.keySet()) {
            if (map.get(str) < 2) {
                list.add(str);
            }
        }
        String[] strings = list.toArray(new String[0]);
        if(strings.length<k){
            return "";
        }
        System.out.println(Arrays.toString(strings));
        return strings[k-1];
    }

    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"d", "b", "c", "b", "c", "a"}, 2));
    }
}
