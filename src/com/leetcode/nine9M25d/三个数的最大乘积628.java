package com.leetcode.nine9M25d;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/25/19:38
 * @Description:
 */
public class 三个数的最大乘积628 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        //要么是倒数的要么是正数的，其实就是两种情况
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
    }
}
