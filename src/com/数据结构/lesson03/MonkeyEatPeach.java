package com.数据结构.lesson03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/09/29/18:57
 * @Description:递归解决，将大的问题转化成更小的同一问题
 */
public class MonkeyEatPeach {
    /*
        1。猴子吃桃的问题
        2.过程：吃的方案x，x/2+1
        3.吃到底的情况，最后就是只剩下一个桃子
     */
    public int eatPeach(int days) {
        //递归终止的条件
        if(days==1){
            return 1;
        }
        //递归操作
        return (eatPeach(days-1)+1)*2;
    }

    public int sumDG(int[] arr,int l){
        if(l==arr.length){
            return 0;
        }
        return arr[l]+sumDG(arr,l+1);
    }

    public static void main(String[] args) {
        MonkeyEatPeach monkeyEatPeach = new MonkeyEatPeach();
        int i = monkeyEatPeach.eatPeach(4);
        System.out.println(i);
    }
}
