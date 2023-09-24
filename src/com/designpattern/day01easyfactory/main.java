package com.designpattern.day01easyfactory;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Coderfine
 * @Date: 2023/07/24/23:22
 * @Description:定义启动类
 * @Recommand:定义一个商场收银软件，营业员根据客户所购买的商品的数目和单价来计算出费用,
 */
public class main {
    public static void main(String[] args) {
        int num = 6;
        int price = 100;
        double total = 0;
        meau();
        String type = "";
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                type = "正常收费";
                break;
            case 2:
                type = "满300减100";
                break;
            case 3:
                type = "打8折";
                break;
        }
        //返回一个超类
        CacheSuper cacheSuper = CashFactory.createCashFactory(type);
        //超类实现方法
        total = cacheSuper.acceptCash((double) price * num);
        System.out.println(total);

    }

    public static void meau() {
        System.out.println("1.正常收费");
        System.out.println("2.满300减100");
        System.out.println("3.打8折");
    }
}
