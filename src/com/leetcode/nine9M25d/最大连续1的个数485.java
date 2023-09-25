package com.leetcode.nine9M25d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/25/18:07
 * @Description:
 */
public class 最大连续1的个数485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
            } else {
                list.add(count);
                count = 0;
            }
        }
        //最后一次还有值要放进去
        if (count > 0) {
            list.add(count);
        }
        int maxCount = Collections.max(list);
        return maxCount;
    }
}
