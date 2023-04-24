package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :AppleFactory
 * @date ：2023/4/24 18:41
 * @description：TODO
 */
public class AppleFactory implements ProductFactory{
    @Override
    public Phone getPhone() {
        return new AplePhone();
    }

    @Override
    public Router getRouter() {
        return new AppleRouter();
    }
}
