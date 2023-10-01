package com.设计模式.代理模式;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/10/01/22:00
 * @Description:这是一个代理模式
 */
public class Test {
    public static void main(String[] args) {
        BigStar cxk = new BigStar("蔡徐坤");
        //创建待理对象
        Star proxy = ProxyUtil.createProxy(cxk);

        System.out.println(proxy.sing("只因你太美"));

        proxy.dance();
    }
}
