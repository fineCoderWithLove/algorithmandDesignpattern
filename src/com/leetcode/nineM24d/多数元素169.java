package com.leetcode.nineM24d;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/24/18:36
 * @Description:不可能有两个数出现的次数都是大于1/2，所以只需要找出出现次数最多的就行了
 */
public class 多数元素169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        //定义一个最大的出现次数和一个最大出现次数的数
        int maxCount = 0;
        Integer majorityElement = null;
        //先遍历得到次数和多数元素
        for (int num : nums) {
            Integer count = map.get(num);
            count = count == null ? 1 : count + 1;
            map.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                majorityElement = num;
            }
        }
        return majorityElement;
    }
}
