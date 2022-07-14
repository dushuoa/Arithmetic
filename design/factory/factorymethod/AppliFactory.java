package com.atguigu.arithmetic.design.factory.factorymethod;

/**
 * @Author dushuo
 * @Date 2022/7/14 17:43
 * @Version 1.0
 */
public class AppliFactory implements FruitFactory{
    @Override
    public void createFruit() {
        System.out.println("apple");
    }
}
