package com.数据结构;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/23/14:06
 * @Description:这是一个自定义的链表类
 */
public class LinkList {


    // 表示链表的每一个节点
    private class Node {
        int value;
        Node next; // 表示链表的下一个节点

        public Node() {

        }

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node header; // 链表的头
    private int size;  // 链表的大小

    //构造方法<======>其实就是构建一个空链表
    public LinkList() {
        this.header = null;
        this.size = 0;
    }

    /*
        1.判断链表是否为空
        2.添加的方法(头部和尾部的添加)
        3.添加任意位置的添加
        4.链表的toString方法
     */
    // 1.判断链表是否为空
    public boolean isEmpty() {
        return this.size == 0;
    }

    // 2.在链表的头部添加
    public void addHeader(int value) {
        // 创建一个node
        Node node = new Node(value);
        if (this.size == 0) {
            this.header = node;
            return;
        } else {
            node.next = this.header;
            this.header = node;
        }
        this.size++;
    }

    // 3.在链表的尾部添加
    public void addTail(int value) {
        // 创建一个node
        Node node = new Node(value);
        // 进行判空,size == 0的时候不就是相当于头插吗
        if (this.size == 0) {
            addHeader(value);  // 偷懒
            return;
        }
        //如果不为空就要遍历链表
        Node now = this.header;
        //遍历链表找出最后一个节点
        while (now.next != null) {
            now = now.next;
        }
        //尾部添加
        now.next = node;
        //更新size
        this.size++;
    }

    // TODO 在任意位置的添加
    public void addAnyIndex(int index, int value) {
        //新节点
        Node node = new Node(value);
        //在任意位置的添加实际上还是遍历链表
        int count = 1;
        Node now = this.header;
        while (count < index) {
            count++;
            now = now.next;
        }
        node.next = now.next;
        now.next = node;
        this.size++;
    }

    // 3.测试链表的toString方法
    public void printList() {
        Node current = header;
        while (current != null) {
            System.out.print(current.value + "<====");
            current = current.next;
        }
        System.out.println();
    }
}
