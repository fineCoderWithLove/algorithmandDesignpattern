package com.leetcode.nineM24d;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/24/19:07
 * @Description:
 */
public class 存在重复元素217 {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        //遍历
        for (int num : nums) {
            Integer i = map.get(num);
            i = i == null ? 1 : i++;
            map.put(num, i);
        }
        for (Integer integer : map.keySet()) {
            //再遍历得到
            Integer count = map.get(integer);
            if(count>=2) {
                return true;
            }

        }
        return false;
    }
}

