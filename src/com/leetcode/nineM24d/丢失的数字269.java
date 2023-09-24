package com.leetcode.nineM24d;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/24/18:22
 * @Description:
 */
public class 丢失的数字269 {
    public int missingNumber(int[] nums) {
        int total = nums.length; // 所有的数字
        Arrays.sort(nums);
        for (int i = 0; i < total-1; i++) {
            if(nums[i+1]-nums[i]!=1){
                return i+1;
            }
        }
        return -1;
    }
}
