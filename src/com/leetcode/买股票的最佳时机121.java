package com.leetcode;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/23/16:19
 * @Description:
 */
public class 买股票的最佳时机121 {
    //暴力没过
//    public int maxProfit(int[] prices) {
//        int max = 0;
//        for (int i = 0; i < prices.length-1; i++) {
//            for(int j=i+1;j< prices.length;j++) {
//                int profit = prices[j]-prices[i];
//                if (profit>max) {
//                    max = profit;
//                }
//            }
//        }
//        return max;
//    }
//


    public static int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        int cost=Integer.MAX_VALUE;
        for(int price:prices){
            //不断更新买入的最低价
            if(price < cost){
                cost=price;
            }
            //获取当前最大利润
            profit=Math.max(profit,price-cost);
        }
        return profit;
    }




    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
