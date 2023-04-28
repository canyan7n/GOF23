package com.canyan7n.principle.ocp;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MiPadFactory
 * @date ：2023/4/28 23:33
 * @description：TODO
 */
public class MiPadFactory implements PadFactory{
    @Override
    public Pad getPad() {
        return new MiPad();
    }
}
