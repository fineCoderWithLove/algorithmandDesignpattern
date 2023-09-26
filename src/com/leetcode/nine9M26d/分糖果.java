package com.leetcode.nine9M26d;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/26/18:35
 * @Description:
 */
public class 分糖果 {
    public static int distributeCandies(int[] candyType) {
        int kinds = candyType.length / 2;
        int twice = 0;
        //糖可以只吃一半，考虑hashset一旦出现就不可以再吃了
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }
        System.out.println(set);
        //遍历出结果
        for (int i = 0; i < set.size(); i++) {
            twice++;
        }
        System.out.println(twice);
        return twice > kinds ? kinds : twice;
    }

    public static void main(String[] args) {
        distributeCandies(new int[]{6, 6, 6, 6});
    }
}
