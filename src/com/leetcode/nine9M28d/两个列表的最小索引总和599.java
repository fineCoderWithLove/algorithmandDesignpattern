package com.leetcode.nine9M28d;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/28/12:01
 * @Description:
 */
public class 两个列表的最小索引总和599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        //放入
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        List<String> res = new ArrayList<>();
        int min = 9999;
        for (int i = 0; i < list2.length; i++) {
            String s = list2[i];
            if (!map.containsKey(s)){
                continue;
            }
            if (i + map.get(s) < min) {
                //更新最小索引
                res.clear();
                min = i + map.get(s);
                res.add(s);
            } else if (i + map.get(s) == min) {
                res.add(s);
            }
        }
        return res.toArray(new String[res.size()]);

    }
}
