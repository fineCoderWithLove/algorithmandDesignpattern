package com.leetcode.nine9M28d;


/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/28/10:32
 * @Description:
 */
public class 两数相加2 {
    public  class ListNode {
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

    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //l1now节点
        ListNode l1head = l1;
        ListNode l2head = l2;
        while (l1head != null && l2head != null) {
            //判断
            //先赋值
            if (l1head.val + l2head.val > 10) {
                l1head.val = (l1head.val + l2head.val) % 10;
                System.out.println(l1head);
                System.out.println(l1head.val);
                l1head.next.val++;

            }else{
                l1head.val = (l1head.val + l2head.val);
            }
            //再移动
            l1head = l1head.next;
            l2head = l2head.next;
        }
        return l1;
    }
}
