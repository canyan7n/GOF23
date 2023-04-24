package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :AplePhone
 * @date ：2023/4/24 18:39
 * @description：TODO
 */
public class AplePhone implements Phone{
    @Override
    public void start() {
        System.out.println("苹果手机开机");
    }

    @Override
    public void stop() {
        System.out.println("苹果手机关机");
    }

    @Override
    public void sendMsg() {
        System.out.println("苹果手机发短信");
    }
}
