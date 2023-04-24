package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :XiaomuRouter
 * @date ：2023/4/24 18:31
 * @description：TODO
 */
public class XiaomuRouter implements Router{
    @Override
    public void start() {
        System.out.println("小米路由器启动");
    }

    @Override
    public void stop() {
        System.out.println("小米路由器关机");
    }

    @Override
    public void router() {
        System.out.println("小米路由器工作");
    }
}
