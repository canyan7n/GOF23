package com.canyan7n.factory.simple;

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
        System.out.println("===静态工厂===");
        //静态工厂方式
        Car wulin = CarFactory.getWulin();
        Car tesla = CarFactory.getTesla();
        wulin.name();
        tesla.name();

        Car mobai = CarFactory.getMobai();
        mobai.name();
    }
}
