package com.canyan7n.principle.ocp;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :MatePadFactory
 * @date ：2023/4/28 23:26
 * @description：TODO
 */
public class MatePadFactory implements PadFactory{
    @Override
    public Pad getPad() {
        return new MatePad();
    }
}
