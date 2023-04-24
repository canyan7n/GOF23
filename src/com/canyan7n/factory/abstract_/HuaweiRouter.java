package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :HuaweiRouter
 * @date ：2023/4/24 18:34
 * @description：TODO
 */
public class HuaweiRouter implements Router{
    @Override
    public void start() {
        System.out.println("华为路由器启动");
    }

    @Override
    public void stop() {
        System.out.println("华为路由器关闭");
    }

    @Override
    public void router() {
        System.out.println("华为路由器工作");
    }
}
