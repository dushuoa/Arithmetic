package com.atguigu.arithmetic.design.factory.abstractfactory;

/**
 * @Author dushuo
 * @Date 2022/7/14 18:06
 * @Version 1.0
 */
public class HuaWeiFactory implements PhoneFactory{
    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu999();
    }

    @Override
    public Screen getScreen() {
        return new Screen.Screen7();
    }
}
