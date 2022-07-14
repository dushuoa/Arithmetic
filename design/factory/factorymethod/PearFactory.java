package com.atguigu.arithmetic.design.factory.factorymethod;

/**
 * @Author dushuo
 * @Date 2022/7/14 17:44
 * @Version 1.0
 */
public class PearFactory implements FruitFactory{
    @Override
    public void createFruit() {
        System.out.println("pear...");
    }
}
