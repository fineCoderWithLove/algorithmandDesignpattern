package com.designpattern.day01easyfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/07/24/23:28
 * @Description:定义打折类
 */
public class CashRebate extends CacheSuper{

    private double Rebate = 1d;

    //初始化的时候传入打折力度
    public CashRebate (double Rebate){
        this.Rebate = Rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*this.Rebate;
    }
}
