package com.atguigu.arithmetic.design.factory.abstractfactory;

/**
 * @Author dushuo
 * @Date 2022/7/14 17:53
 * @Version 1.0
 */
public interface PhoneFactory {

    Cpu getCpu();

    Screen getScreen();

}
