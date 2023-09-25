package com.leetcode.nine9M25d;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/25/18:30
 * @Description:
 */
public class 第三大的数414 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int[] distinctArr = Arrays.stream(nums)
                .distinct()
                .toArray();

        if (distinctArr.length < 3) {
            return Arrays.stream(nums).max().getAsInt();
        } else if (distinctArr.length == 3) {
            return Arrays.stream(nums).min().getAsInt();
        }

        return distinctArr[distinctArr.length-3];
    }
}
