package com.canyan7n.principle.ocp;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :PadFactory
 * @date ：2023/4/28 23:22
 * @description：TODO
 */
public class IPadFactory implements PadFactory{
    @Override
    public Pad getPad() {
        return new Ipad();
    }
}
