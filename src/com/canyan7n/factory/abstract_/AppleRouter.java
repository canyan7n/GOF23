package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :AppleRouter
 * @date ：2023/4/24 18:40
 * @description：TODO
 */
public class AppleRouter implements Router{
    public void start() {
        System.out.println("苹果路由器启动");
    }

    @Override
    public void stop() {
        System.out.println("苹果路由器关闭");
    }

    @Override
    public void router() {
        System.out.println("苹果路由器工作");
    }
}
