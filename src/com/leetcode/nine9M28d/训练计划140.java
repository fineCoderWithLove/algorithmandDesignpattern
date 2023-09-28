package com.leetcode.nine9M28d;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/28/18:38
 * @Description:
 */
public class 训练计划140 {
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

    public ListNode trainingPlan(ListNode head, int cnt) {
        List<Integer> list = new ArrayList<>();
        ListNode now = head;
        int k = 0;
        while (now != null) {
            list.add(now.val);
            now = head.next;
            k++;
        }
        now = head;
        for (int i = 0; i < k - cnt; i++) {
            now = head.next;
        }
        return now;
    }
}
