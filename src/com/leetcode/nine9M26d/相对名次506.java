package com.leetcode.nine9M26d;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/26/17:14
 * @Description:
 */
public class 相对名次506 {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new HashMap<>();
        //存的是值和索引
        for (int i = 0; i < score.length; ++i){
            map.put(score[i], i);
        }
        Arrays.sort(score);
        String[] ans = new String[score.length];
        //取出索引的位置
        for (int i = 0; i < score.length; ++i) {
            int s = map.get(score[i]);
            if (i == score.length - 1) ans[s] = "Gold Medal";
            else if (i == score.length - 2) ans[s] = "Silver Medal";
            else if (i == score.length - 3) ans[s] = "Bronze Medal";
            else ans[s] = String.valueOf(score.length - i);
        }
        return ans;
    }
}
