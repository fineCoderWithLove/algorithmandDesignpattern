package com.leetcode.nine9M24d;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/24/18:06
 * @Description:leetcode
 */
public class 只出现一次的数字 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        //先遍历得到次数
        for (int num : nums) {
            //定义次数
            Integer count = map.get(num);
            //取出值没有值就说明是第一次进来，如果有值就是第二次
            count = count == null ? 1 : ++count;
            map.put(num,count);
        }
        //再遍历得到
        for (Integer i :map.keySet()){
            Integer count = map.get(i);
            if (count == 1){
                return i;
            }
        }
        return -1;

    }
}
