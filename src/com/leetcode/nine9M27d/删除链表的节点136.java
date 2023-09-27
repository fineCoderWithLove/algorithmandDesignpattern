package com.leetcode.nine9M27d;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/27/20:02
 * @Description:TODO 使用虚拟头节点
 */
public class 删除链表的节点136 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        //进行头节点的判断
        if (head.val == val) {
            return head.next;
        }
        //定义当前遍历的节点
        ListNode now = head;
        //遍历
        while (now.next != null) {
            if (now.next.val == val) {
                //进行节点的删除
                now.next = now.next.next;
            } else {
                //进行节点的遍历
                now = now.next;
            }
        }
        return head;
    }

    //TODO 使用虚拟头节点的方式
    public ListNode deleteNodeVM(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        //进行头节点的判断
        if (head.val == val) {
            return head.next;
        }
        //定义当前遍历的节点
        ListNode now = head;
        //遍历
        while (now.next != null) {
            if (now.next.val == val) {
                //进行节点的删除
                now.next = now.next.next;
            } else {
                //进行节点的遍历
                now = now.next;
            }
        }
        return head;
    }
}
