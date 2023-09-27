package com.leetcode.nine9M27d;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/27/22:16
 * @Description:
 */
public class 删除排序链表中的重复元素83 {
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

    public ListNode deleteDuplicates(ListNode head) {
        //定义当前节点
        ListNode now = head;
        //循环删除
        while (now!=null&&now.next!=null){
            if(now.val==now.next.val){
                now.next = now.next.next;
            }else{
                //指针迁移
                now= now.next;
            }
        }
        return head;
    }
}
