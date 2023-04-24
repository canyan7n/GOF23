package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :HuaweiFactory
 * @date ：2023/4/24 18:35
 * @description：TODO
 */
public class HuaweiFactory implements ProductFactory{
    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Router getRouter() {
        return new HuaweiRouter();
    }
}
