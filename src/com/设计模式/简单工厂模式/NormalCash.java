package com.设计模式.简单工厂模式;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/07/24/23:27
 * @Description:这是一个正常收费的类，来集成我的超类
 */
public class NormalCash extends CacheSuper{

    //因为是正常收费所以直接返回
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
