package com.leetcode.nine9M26d;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/26/17:26
 * @Description:leetcode中下一个更大的就用单调栈
 */
public class 下一个更大的元素 {
    /*
        单调栈的解决办法
     */
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //一旦有下一个更大就把栈中所有元素全部出了
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new LinkedList<>();
        //单调栈从后往前
        for (int i = nums2.length-1; i >= 0; --i) {
            int num = nums2[i];
            //当栈非空的时候且下一个元素大于栈顶的时候就全部出栈
            while (!stack.isEmpty() && num > stack.peek()) {
                stack.pop();
            }
            //如果栈是空的就说明是下一个更大的
            map.put(num, stack.isEmpty() ? -1 : stack.peek());
            stack.push(num);
        }
        int[] res = new int[nums1.length];
        for(int i =0;i< nums1.length;++i){
            res[i] = map.get(nums1[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4})));

    }
}
