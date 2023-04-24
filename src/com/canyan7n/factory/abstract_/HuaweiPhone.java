package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :HuaweiPhone
 * @date ：2023/4/24 18:27
 * @description：TODO
 */
public class HuaweiPhone implements Phone{
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void stop() {
        System.out.println("华为手机关机");
    }

    @Override
    public void sendMsg() {
        System.out.println("华为手机发短信");
    }
}
