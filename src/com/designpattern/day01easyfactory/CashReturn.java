package com.designpattern.day01easyfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/07/24/23:33
 * @Description:满多少前就返现的类
 */
public class CashReturn extends CacheSuper {
    private double moneyCondition = 0.0d;
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition) {
            result = money-(money/moneyCondition)*moneyReturn;
        }
        return result;
    }
}
