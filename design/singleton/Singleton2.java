package com.atguigu.arithmetic.design.singleton;

/**
 * @Author dushuo
 * @Date 2022/6/30 21:47
 * @Version 1.0
 *
 * 懒汉式
 */
public class Singleton2 {

    private Singleton2() {
        System.out.println("懒汉式的单例模式");
    }

    //加上volatile是为了解决指令重排问题，防止其他线程使用报空指针问题
    private volatile static Singleton2 singleton2 = null;

    public Singleton2 getSingleton2(){
        //只有当该对象实例为空时才有资格去抢占锁
        if(singleton2 == null){
            //第一层锁，保证只有一个线程能进入本方法
            synchronized (Singleton2.class){
                /*
                * 第二层判断是为了防止在高并发的情况下，有多个线程同时进入了该方法
                * 第一个线程已经new过对象了，其他线程就不能new对象了
                * */
                if(singleton2 == null){
                    singleton2 = new Singleton2();
                    return singleton2;
                }
            }
        }
        return singleton2;
    }

}
