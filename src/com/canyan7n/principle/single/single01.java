package com.canyan7n.principle.single;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :single01
 * @date ：2023/4/25 19:00
 * @description：TODO
 */
public class single01 {

    public static void main(String[] args) {
        Vichal car = new Vichal();
        Vichal boat = new Vichal();
        Vichal air = new Vichal();
        car.roadRun();
        boat.waterRun();
        air.airRun();
    }
}
