package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :XiaomiFactory
 * @date ：2023/4/24 18:30
 * @description：TODO
 */
public class XiaomiFactory implements ProductFactory{
    @Override
    public Phone getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public Router getRouter() {
        return new XiaomuRouter();
    }
}
