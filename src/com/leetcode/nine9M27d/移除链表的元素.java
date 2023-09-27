package com.leetcode.nine9M27d;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/27/21:17
 * @Description:TODO 使用虚拟头节点
 */
public class 移除链表的元素 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeElements(ListNode head, int val) {

        //进行头节点的判断
        while(head!=null&&head.val == val){
            head = head.next;
        }
        if (head == null) {
            return head;
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
    public ListNode removeElementsVM(ListNode head, int val) {

        //进行头节点的判断
        while(head!=null&&head.val == val){
            head = head.next;
        }
        if (head == null) {
            return head;
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
