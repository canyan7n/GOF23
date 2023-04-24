package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :AppleComputer
 * @date ：2023/4/24 18:47
 * @description：TODO
 */
public class HuaweiComputer implements Computer{
    @Override
    public void start() {
        System.out.println("华为电脑启动");
    }

    @Override
    public void stop() {
        System.out.println("华为电脑关闭");
    }

    @Override
    public void work() {
        System.out.println("华为电脑工作");
    }
}
