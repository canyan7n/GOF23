package com.canyan7n.factory.simple;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :CarFactory
 * @date ：2023/4/24 18:08
 * @description：TODO
 */
public class CarFactory {
    public static Car getWulin(){
        return new Wulin();
    }

    public static Car getTesla(){
        return new Tesla();
    }
}
