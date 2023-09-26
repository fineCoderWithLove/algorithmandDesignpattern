package com.leetcode.nine9M26d;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/26/21:51
 * @Description:
 */
public class 唯一元素的和1748 {
    public int sumOfUnique(int[] nums) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> list = new ArrayList<>();
        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer integer : map.keySet()) {
            if(map.get(integer)==1){
                list.add(integer);
            }
        }
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }
}
