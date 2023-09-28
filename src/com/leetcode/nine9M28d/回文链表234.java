package com.leetcode.nine9M28d;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/28/14:10
 * @Description:
 */
public class 回文链表234 {
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

    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return false;
        }
        //存储数据
        List<Integer> list = new ArrayList<>();
        //定义头节点
        ListNode now = head;
        while(now!=null){
            list.add(now.val);
            now=now.next;
        }
        //双指针
        int front = 0;
        int last =list.size()-1;
        while (front<last){
            if(!list.get(front).equals(list.get(last))){
                return false;
            }else{
                front++;
                last--;
            }

        }
        return true;
    }
}
