package com.designpattern.day01easyfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/07/24/23:40
 * @Description:定义收取现金的工厂类
 */
public class CashFactory {
    public static CacheSuper createCashFactory(String type) {
        //声明顶级父类
        CacheSuper cs = null;
        switch (type) {
            case "正常收费":
                cs = new NormalCash();
                break;
            case "满300减100":
                cs = new CashReturn(300d,100d);
                break;
            case "打8折" :
                cs = new CashRebate(0.8);
                break;
            default:
                cs = new NormalCash();
        }
        return cs;
    }
}
