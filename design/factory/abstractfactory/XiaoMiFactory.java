package com.atguigu.arithmetic.design.factory.abstractfactory;

/**
 * @Author dushuo
 * @Date 2022/7/14 17:54
 * @Version 1.0
 */
public class XiaoMiFactory implements PhoneFactory{
    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu888();
    }

    @Override
    public Screen getScreen() {
        return new Screen.Screen5();
    }
}
