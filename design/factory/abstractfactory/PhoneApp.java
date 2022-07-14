package com.atguigu.arithmetic.design.factory.abstractfactory;

/**
 * @Author dushuo
 * @Date 2022/7/14 17:55
 * @Version 1.0
 */

//抽象工厂可以解决一系列的产品生产的需求，对于大批量，多系列的产品，
// 用抽象工厂可以更好的管理和扩展。
public class PhoneApp {
    public static void main(String[] args) {
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        HongMiFactory hongMiFactory = new HongMiFactory();

        Cpu xiaoMiCpu = xiaoMiFactory.getCpu();
        xiaoMiCpu.run();
        Cpu hongMiCpu = hongMiFactory.getCpu();
        hongMiCpu.run();

        Screen xiaoMiScreen = xiaoMiFactory.getScreen();
        Screen hongMiScreen = hongMiFactory.getScreen();
        xiaoMiScreen.size();
        hongMiScreen.size();
    }
}
