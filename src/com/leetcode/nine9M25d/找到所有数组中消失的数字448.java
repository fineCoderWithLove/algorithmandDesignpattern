package com.leetcode.nine9M25d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/25/17:12
 * @Description:
 */
public class 找到所有数组中消失的数字448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // 对数组进行去重，得到不重复的数组
        int[] distinctArr = Arrays.stream(nums)
                .distinct()
                .toArray();

        // 标记数组，用于记录出现过的数字
        boolean[] exist = new boolean[nums.length + 1];

        // 将不重复的数组中的数字在标记数组中标记为出现过
        for (int num : distinctArr) {
            exist[num] = true;
        }

        // 遍历标记数组，找到未出现过的数字
        for (int i = 1; i < exist.length; i++) {
            if (!exist[i]) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }
}
