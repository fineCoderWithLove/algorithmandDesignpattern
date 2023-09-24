package com.leetcode.longlongago;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/23/15:47
 * @Description:
 */
public class 移除元素 {
    public void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
    }
    public int removeElement(int[] nums, int val) {
        //双指针一个在头一个在尾部
        int low = 0;
        for (int right=0;right< nums.length;right++) {
            if(nums[right] != val) {
                nums[low] = nums[right];
                low++;
            }
        }
        return  low;
    }
}
