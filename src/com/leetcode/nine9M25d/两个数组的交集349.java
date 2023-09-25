package com.leetcode.nine9M25d;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/25/15:49
 * @Description:
 */
public class 两个数组的交集349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            set2.add(nums2[j]);
        }
        //找出两个集合的交集
        set1.retainAll(set2);
        //将交集转换为数组
        int[] res = new int[set1.size()>set2.size()?set1.size():set2.size()];
        int index = 0;
        for (Integer integer : set1) {
            res[index++] = integer;
        }
        return res;
    }
}
