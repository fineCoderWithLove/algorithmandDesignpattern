package com.设计模式.代理模式;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/10/01/21:47
 * @Description:被代理的对象
 */
public class BigStar implements Star{
    private String name;

    public BigStar(String name) {
        this.name = name;
    }

    public String sing(String name){
        System.out.println(this.name+"正在唱"+name);
        return "谢谢";

    }

    public void dance(){
        System.out.println(this.name+"正在跳舞iu");
    }
}
