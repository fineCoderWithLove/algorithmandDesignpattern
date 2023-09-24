package com.leetcode.nineM24d;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/24/20:31
 * @Description:
 */
public class 移动零283 {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // 遍历数组中的所有元素
        for (int i = 0; i < nums.length; i++) {
            // 如果当前元素非零，则将其移动到正确的位置
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // 将剩余的位置填充为零
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
