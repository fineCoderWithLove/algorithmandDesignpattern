package com.leetcode.nine9M28d;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/28/18:24
 * @Description:
 */
public class 图书管理一123 {
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

    public int[] reverseBookList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head, pre = null;
        while(cur != null) {
            // 新节点
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        while(cur!=null){
            list.add(cur.val);
            cur=cur.next;
        }
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}
