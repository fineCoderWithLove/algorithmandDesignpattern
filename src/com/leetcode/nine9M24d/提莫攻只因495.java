package com.leetcode.nine9M24d;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/24/21:32
 * @Description:情景题目
 */
public class 提莫攻只因495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        for (int i = 0; i < timeSeries.length-1;i++) {
            if(timeSeries[i+1]-timeSeries[i]>=duration){
                total+=duration;
            }else{
                total+=timeSeries[i+1]-timeSeries[i];
            }
        }
        return total+duration;
    }
}
