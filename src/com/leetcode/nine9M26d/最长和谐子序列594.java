package com.leetcode.nine9M26d;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/26/19:12
 * @Description:考虑存取索引用Hashmap来存取索引判断值，双for暴力解决好像可以
 */
/*
    1.适用双指针
    2.适用HashMap
 */
public class 最长和谐子序列594 {
    public static int findLHS(int[] nums) {
        //好像要用到hashmap
        //首先求的是长度就可以排序
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        //用于存储具体的序列
        List<Integer> list = new ArrayList<>();
        int maxLength = 0;
        //好像可以适用双指针，相等的话尾指针前移
        for (int j = 1, i = 0; j < nums.length; j++) {
            if (nums[j] - nums[i] == 0 || nums[j] - nums[i] == 1) {
                maxLength++;
                System.out.println("当前的maxLength===>" + maxLength);
            } else {
                //放入
                list.add(maxLength);
                //重置
                maxLength = 0;
                //移动左指针
                i = j + 1;
                //移动右指针重新计数
                j++;
            }
        }
        //取值
        int i = Collections.max(list);
        return i;
    }

    public static int demo(int[] nums) {
        //尝试暴力
        //排序
        Arrays.sort(nums);
        //定义最大长度
        int maxLength = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] - nums[i] == 0 || nums[j] - nums[i] == 1) {
                    maxLength++;
                } else {
                    list.add(maxLength);
                    //重置
                    maxLength = 0;
                }
            }
        }
        if (list.size()==0){
            return 0;
        }
        return Collections.max(list);
    }

    //第三次尝试
    public static int ThirdTest(int[] nums) {
        //排序
        Arrays.sort(nums);
        //双指针
        int begin = 0;
        int res = 0;
        for(int end = 0 ;end<nums.length;end++){
            while(nums[end]-nums[begin]>1){
                begin++;
            }
            //说明符合序列
            if(nums[end]-nums[begin]==1){
                res = Math.max(res,end-begin+1);
            }
        }
        return res;
    }
    //第四次尝试HashMap,Hash要统计出现的次数最长子序列就是两个的次数相加
    public static int ForthTest(int[] nums) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        //排序
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        //统计出现的次数
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if(map.containsKey(key+1)){
                res = Math.max(res,map.get(key)+map.get(key+1));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(ForthTest(new int[]{1,3,2,2,5,2,3,7}));
    }
}
