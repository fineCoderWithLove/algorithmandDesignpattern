package com.leetcode.nine9M24d;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/24/21:00
 * @Description:
 */
public class 区域和检索数组不可变303 {
    class NumArray {
         int[] localnums;

        public NumArray(int[] nums) {
            localnums = nums;
        }

        public int sumRange(int left, int right) {
            int[] ints = Arrays.copyOfRange(localnums, left, right);
            int sum = 0;
            for (int anInt : ints) {
                sum+=anInt;
            }
            return sum;
        }
    }
}
