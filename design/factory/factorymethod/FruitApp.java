package com.atguigu.arithmetic.design.factory.factorymethod;

/**
 * @Author dushuo
 * @Date 2022/7/14 17:44
 * @Version 1.0
 */

/**
 * 工厂方法: 这种方法虽然遵守了开闭原则，但是需要创建很多的工厂
 */
public class FruitApp {
    public static void main(String[] args) {
        AppliFactory appliFactory = new AppliFactory();
        PearFactory pearFactory = new PearFactory();
        appliFactory.createFruit();
        pearFactory.createFruit();
    }
}
