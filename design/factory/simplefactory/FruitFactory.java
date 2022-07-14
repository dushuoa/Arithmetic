package com.atguigu.arithmetic.design.factory.simplefactory;

/**
 * @Author dushuo
 * @Date 2022/7/14 17:11
 * @Version 1.0
 */
public class FruitFactory {

    public Fruit getFruit(String type){
        if("apple".equals(type)){
            return new Apple();
        }else {
            return new Pear();
        }
    }

}
