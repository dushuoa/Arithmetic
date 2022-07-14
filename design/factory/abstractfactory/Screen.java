package com.atguigu.arithmetic.design.factory.abstractfactory;

/**
 * @Author dushuo
 * @Date 2022/7/14 17:51
 * @Version 1.0
 */
public interface Screen {
    void size();

    class Screen5 implements Screen{

        @Override
        public void size() {
            System.out.println("5寸......");
        }
    }
    class Screen6 implements Screen{

        @Override
        public void size() {
            System.out.println("6寸.....");
        }
    }

    class Screen7 implements Screen{

        @Override
        public void size() {
            System.out.println("7寸........");
        }
    }
}
