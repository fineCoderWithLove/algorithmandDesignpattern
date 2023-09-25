package com.leetcode.nine9M24d;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/24/19:58
 * @Description:
 */
public class 存在重复元素219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //常规方法超时了，所以考虑hash
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            int num = nums[i];
            if(map.containsKey(num)&&i-map.get(num)<=k){
                return true;
            }
            map.put(num,i);
        }
        return false;
    }
}
