package com.canyan7n.factory.method_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :CarFactory
 * @date ：2023/4/24 18:08
 * @description：TODO
 */
public class WulinFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Wulin();
    }
}
