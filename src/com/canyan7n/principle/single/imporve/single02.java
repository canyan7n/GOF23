package com.canyan7n.principle.single.imporve;

import com.canyan7n.principle.single.Vichal;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :single01
 * @date ：2023/4/25 19:00
 * @description：TODO
 */
public class single02 {

    public static void main(String[] args) {

        RoadVehicle car = new RoadVehicle();
        WaterVehicle boat = new WaterVehicle();
        AirVehicle air = new AirVehicle();
        car.run();
        boat.run();
        air.run();
    }
}
