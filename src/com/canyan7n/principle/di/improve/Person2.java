package com.canyan7n.principle.di.improve;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :Person
 * @date ：2023/4/25 19:48
 * @description：TODO
 */
public class Person2 {
    //依赖与抽象，属性
    //可以使用构造注入或者setter注入
    Device device;

    public Person2() {
    }

    //构造注入依赖
    public Person2(Device device) {
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    //setter注入依赖
    public void setDevice(Device device) {
        this.device = device;
    }

    public void play(Device device){
        device.play();
    }
}
