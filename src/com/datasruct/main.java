package com.datasruct;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/23/14:25
 * @Description:测试数据结构的类
 */
public class main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        System.out.println(list.isEmpty());
        list.addHeader(1);
        list.addTail(2);
        list.printList();
    }
}
