package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :XiaomiPhone
 * @date ：2023/4/24 18:25
 * @description：TODO
 */
public class XiaomiPhone implements Phone{
    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void stop() {
        System.out.println("小米手机关机");
    }

    @Override
    public void sendMsg() {
        System.out.println("小米手机发短信");
    }
}
