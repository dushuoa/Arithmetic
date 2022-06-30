package com.atguigu.arithmetic.design.singleton;

/**
 * @Author dushuo
 * @Date 2022/6/30 16:44
 * @Version 1.0
 *
 * 饿汉式
 */
public class Singleton {

    private Singleton() {
        System.out.println("这是饿汉式的单例模式");
    }

    //自己创建了单例对象
    private final Singleton singleton = new Singleton();

    //返回这个单例对象
    public Singleton getSingleton(){
        return singleton;
    }



}
