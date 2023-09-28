package com.leetcode.nine9M28d;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/28/11:28
 * @Description:
 */
public class 相交链表160 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //判断
        if (headA == null || headB == null) {
            return null;
        }
        //利用hash来存储如果放进去的空间如果now.next没有成功放进去，说明空间重复了，说了可以返回
        Set<ListNode> set = new HashSet<>();
        //定义头
        ListNode ListheadA = headA;
        ListNode ListheadB = headB;
        //先放
        while (ListheadA != null) {
            set.add(ListheadA);
            ListheadA = ListheadA.next;
        }
        //后判断
        while (ListheadB != null) {
            if (!set.add(ListheadB)) {
                return ListheadB;
            }
            ListheadB = ListheadB.next;
        }
        return null;
    }
}
