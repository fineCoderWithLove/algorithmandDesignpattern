package com.leetcode.longlongago;


import java.util.*;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/08/26/12:26
 * @Description:
 */
public class main {
    public static void main(String[] args) {


    }


    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length-1; i++) {
            for(int j=i+1;j< prices.length;j++) {
                int profit = prices[j]-prices[i];
                if (profit>max) {
                    max = profit;
                }
            }
        }
        return max;
    }
}
