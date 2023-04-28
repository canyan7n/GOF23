package com.canyan7n.principle.ocp;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :Ocp01
 * @date ：2023/4/28 23:19
 * @description：TODO
 */
public class Ocp01 {
    public static void main(String[] args) {
        // IPadFactory padFactory = new IPadFactory();
        // Pad ipad = padFactory.getiPad();
        // ipad.name();
        // Pad matePad = padFactory.getMatePad();
        // matePad.name();
        IPadFactory iPadFactory = new IPadFactory();
        Pad ipad = iPadFactory.getPad();
        ipad.name();

        MatePadFactory matePadFactory = new MatePadFactory();
        Pad matepad = matePadFactory.getPad();
        matepad.name();

        MiPadFactory miPadFactory = new MiPadFactory();
        Pad mipad = miPadFactory.getPad();
        mipad.name();
    }
}
