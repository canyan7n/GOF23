package com.canyan7n.factory.method_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TeslaFactory
 * @date ：2023/4/24 18:13
 * @description：TODO
 */
public class TeslaFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
