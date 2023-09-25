package com.leetcode.nine9M25d;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/25/16:12
 * @Description:
 */
public class 两个数组的交集二350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        // 创建一个用于存储结果的列表
        List<Integer> result = new ArrayList<>();

        // 创建一个 HashMap，用于统计 nums1 中每个数字出现的次数
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            //如果不存在就返回0
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 遍历 nums2 数组，如果当前数字在 map 中存在且出现次数大于 0，则将其加入结果列表，并将对应的出现次数减一
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        // 将结果列表转换为数组
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
