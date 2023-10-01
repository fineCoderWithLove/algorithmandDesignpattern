package com.数据结构.lesson04Tree;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/30/10:19
 * @Description:二分搜索树,也是一个联系前序中序后序遍历的地方
 */
public class BinarySearchTree<T extends Comparable<T>> {
    //定义树的元素的节点
    public class Node {
        T val;
        //左孩子
        Node left;
        //右孩子
        Node right;

        public Node(T val) {
            this.val = val;
        }
    }

    //定义树中的属性
    private Node root; // 树根

    //统计数组中节点的个数
    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    //判断树是否为空
    public boolean isEmpty() {
        return this.size == 0;
    }

    //返回树的元素个数
    public int getSize() {
        return this.size;
    }

    //添加元素
    public void add(T val) {
        //更新
        this.root = add(this.root, val);
        this.size++;
    }


    //递归的方法

    /**
     * @param node 树的根节点
     * @param val  值
     */
    private Node add(Node node, T val) {
        //递归终止的条件
        if (node == null) {
            Node leafNode = new Node(val);
            return leafNode;
        }
        //递归
        if (node.val.compareTo(val) > 0) {
            //左边添加
            node.left = add(node.left, val);
        } else {
            //右边添加
            node.right = add(node.right, val);
        }
        return node;
    }

    //将树中的节点进行中序遍历（中序遍历就是深度优先搜索）
    public void middleTravel() {
        middleTravel(this.root);
    }

    private void middleTravel(Node node) {
        if (node == null) {
            return;
        }
        middleTravel(node.left);
        System.out.println(node.val);
        middleTravel(node.right);
    }

    //将树的节点前序遍历
    public void beforeTravel() {
        beforeTravel(this.root);
    }

    private void beforeTravel(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        beforeTravel(node.left);
        beforeTravel(node.right);
    }

    //将树的节点后序遍历
    public void AfterTravel() {
        AfterTravel(this.root);
    }

    private void AfterTravel(Node node) {
        if (node == null) {
            return;
        }
        AfterTravel(node.left);
        AfterTravel(node.right);
        System.out.println(node.val);
    }

    //树的层序遍历，BFS ，广度有限搜索 使用队列来实现
    public String levelTravel() {
        List<String> list = new ArrayList<>();
        // 1、 创建一个队列
        Queue<AbstractMap.SimpleEntry<Integer, Node>> queue = new LinkedList<>();
        // 2、将根结点入入队
        if (this.root != null) {
            queue.offer(new AbstractMap.SimpleEntry<>(1, this.root));
        }
        // 3、遍历队列
        while (!queue.isEmpty()) {
            AbstractMap.SimpleEntry<Integer, Node> temp = queue.poll();
            Node value = temp.getValue();
            int key = temp.getKey();
            //3-1  先将内容保存
            list.add(value.val.toString() + "------" + key);
            // 3-2  判断左子树是否为空，不为空就入队
            if (value.left != null) {
                queue.offer(new AbstractMap.SimpleEntry<>(key + 1, value.left));
            }
            // 3-3 判断右子树是否为空，不为空就入队
            if (value.right != null) {
                queue.offer(new AbstractMap.SimpleEntry<>(key + 1, value.right));
            }
        }

        return list.stream().collect(Collectors.joining(","));
    }

    //查找的方法
    public boolean contains(T val) {
        return contains(this.root, val);
    }

    /**
     * 从以node为根的二分搜索树中查找元素val
     *
     * @param node 当前头节点
     * @param val  查找的值
     * @return boolean
     */
    private boolean contains(Node node, T val) {
        //递归终止的条件
        if (node == null) {
            return false;
        }
        //递归
        if (node.val.compareTo(val) == 0) {
            return true;
        } else if (node.val.compareTo(val) > 0) {
            //左
            return contains(node.left, val);
        } else {
            return contains(node.right, val);
        }
    }
    //Pair对其实就是自定义的一个简陋版本的HashMap

    //从二分搜索树中找出最小的值
    public T getMinVal() {
        if (this.root == null) {
            return null;
        }
        Node curNode = this.root;
        while (curNode.left != null) {
            curNode = curNode.left;
        }
        return curNode.val;
    }

    //从二分搜索树中找出最大的值
    public T getMaxVal() {
        if (this.root == null) {
            return null;
        }
        Node curNode = this.root;
        while (curNode.right != null) {
            curNode = curNode.right;
        }
        return curNode.val;
    }

    //寻找最小值递归方法实现
    public Node getMinValDG(Node node) {
        if (node.left == null) {
            //说明找到了
            return node;
        }
        //没找到去左树找
        return getMinValDG(node.left);
    }

    //删除操作
    public void remove() {

    }

    /**
     * @param node 树的根节点
     * @param val  要删除的值
     * @return {@link Node}
     */
    private Node remove(Node node, T val) {
        if (node == null) {
            return null;
        }
        //递归的操作
        if (node.val.compareTo(val) == 0) {
            //TODO 执行删除的逻辑,四种删除节点的情况

            //左右子树都为空
            if (node.left == null && node.right == null) {
                return null;
            } else if (node.left != null && node.right == null) {
                return node.left;
            } else if (node.left == null && node.right != null) {
                return node.right;
            } else {
                //左右子树都不为空
                
            }
        } else if (node.val.compareTo(val) > 0) {
            //否则继续寻找节点
            node.left = remove(node.left, val);
        } else {
            node.right = remove(node.right, val);
        }
        return node;
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int val = random.nextInt(100);
            System.out.println(val);
            binarySearchTree.add(val);
        }
        System.out.println("-------中序遍历--------");
        binarySearchTree.middleTravel();
        System.out.println("--------前序遍历-------");
        binarySearchTree.beforeTravel();
        System.out.println("--------后序遍历-------");
        binarySearchTree.AfterTravel();
        System.out.println("--------层序遍历-------");
        System.out.println(binarySearchTree.levelTravel());
        System.out.println("--------查找-------");
        System.out.println(binarySearchTree.contains(33));
        System.out.println("--------最小值-------");
        System.out.println(binarySearchTree.getMinVal());
        System.out.println("--------最大值-------");
        System.out.println(binarySearchTree.getMaxVal());
    }


}
