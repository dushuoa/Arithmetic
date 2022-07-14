package com.atguigu.arithmetic.design.factory.abstractfactory;

/**
 * @Author dushuo
 * @Date 2022/7/14 17:49
 * @Version 1.0
 */
public interface Cpu {
    void run();

    class Cpu650 implements Cpu{
        @Override
        public void run() {
            System.out.println("650也很强");
        }
    }

    class Cpu888 implements Cpu{

        @Override
        public void run() {
            System.out.println("888更好");
        }
    }

    class Cpu999 implements Cpu{

        @Override
        public void run() {
            System.out.println("999是最强的");
        }
    }
}
