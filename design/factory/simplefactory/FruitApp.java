package com.atguigu.arithmetic.design.factory.simplefactory;

/**
 * @Author dushuo
 * @Date 2022/7/14 17:12
 * @Version 1.0
 */

/**
 * 工厂模式： 工厂模式，顾名思义，就是用来生产对象的，在Java中，万物皆对象
 * 如果在程序中使用new的方式创建对象，那么程序代码和对象是强耦合在一起的，如果对象变了，程序中都要跟着变
 * 所以就有了工厂模式，我们只需要获得工厂，就可以拿到对象，实现了解耦
 *
 * 下面是一个简单的工厂模式
 * 简单工厂每次有了新的对象就需要更改工厂，违反了开闭原则
 * 只适用于对象少，不需要更改需求的业务
 */
public class FruitApp {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit apple = fruitFactory.getFruit("apple");
        apple.whoAmI();
        Fruit pear = fruitFactory.getFruit("pear");
        pear.whoAmI();
    }
}
