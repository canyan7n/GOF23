package com.canyan7n.factory.method_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :Client
 * @date ：2023/4/24 18:06
 * @description：TODO
 */
public class Client {

    public static void main(String[] args) {
        //传统方式
        System.out.println("===传统方式===");
        Wulin car1 = new Wulin();
        Tesla car2 = new Tesla();
        car1.name();
        car2.name();
        System.out.println("===工厂方法===");
        //工厂方法方式
        TeslaFactory teslaFactory = new TeslaFactory();
        Car tesla = teslaFactory.getCar();
        WulinFactory wulinFactory = new WulinFactory();
        Car wulin = wulinFactory.getCar();
        tesla.name();
        wulin.name();

        //扩展新产品，不需要修改修改，只需扩展一个新的对应产品的工厂
        MobaiFactory mobaiFactory = new MobaiFactory();
        Car mobai = mobaiFactory.getCar();
        mobai.name();
    }
}
