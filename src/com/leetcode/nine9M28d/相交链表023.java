package com.leetcode.nine9M28d;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/28/17:54
 * @Description:
 */
public class 相交链表023 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //判断空间是否重复就行
        Set<ListNode> set = new HashSet<>();
        //头
        ListNode now = headA;
        //存入A
        while(now!=null){
            set.add(now);
            now = now.next;
        }
        //存入B
        now = headB;
        while (now!=null){
            if(!set.add(now)){
                return now;
            }
            now = now.next;
        }
        return null;
    }
}
