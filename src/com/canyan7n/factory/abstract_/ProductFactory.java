package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :ProductFactory
 * @date ：2023/4/24 18:28
 * @description：TODO
 */
//抽象工厂，只负责生成产品
public interface ProductFactory {
    //生成手机
    public Phone getPhone();
    //生成路由器
    public Router getRouter();
}
