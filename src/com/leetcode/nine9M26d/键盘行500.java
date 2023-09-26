package com.leetcode.nine9M26d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/26/18:06
 * @Description:TODO 下次再做，尽力了
 */
public class 键盘行500 {
    public static String[] findWords(String[] words) {
        //存放
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "qwertyuiopQWERTYUIOP");
        map.put(2, "asdfghjklASDFGHJKL");
        map.put(3, "zxcvbnmZXCVBNM");

        List<String> result = new ArrayList<>();
        for (String word : words){
            boolean found = false;
            for (String line : map.values()) {
                if (line.contains(word)){
                    found = true;
                    break;
                }
            }
            if (!found) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
}
