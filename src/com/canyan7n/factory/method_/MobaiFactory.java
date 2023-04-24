package com.canyan7n.factory.method_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MobaiFactory
 * @date ：2023/4/24 18:20
 * @description：TODO
 */
public class MobaiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Mobai();
    }
}
