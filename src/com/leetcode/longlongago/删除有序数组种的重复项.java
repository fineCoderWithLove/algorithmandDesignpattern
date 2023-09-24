package com.leetcode.longlongago;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/23/15:19
 * @Description:
 */
public class 删除有序数组种的重复项 {
    public void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }

    public int removeDuplicates(int[] nums) {
        //定义快慢指针相等的话快指针向后移动，不相等的话就交换
        if (nums.length == 0) return 0;
        int low = 0;
        for (int high = 1; high < nums.length; high++) {
            if (nums[high] != nums[low]) {
                low++;
                nums[low] = nums[high];
            }
        }
        return low + 1;
    }
}
