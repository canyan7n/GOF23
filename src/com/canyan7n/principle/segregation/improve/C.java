package com.canyan7n.principle.segregation.improve;

import com.canyan7n.principle.segregation.InterfaceA;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :C
 * @date ：2023/4/25 19:37
 * @description：TODO
 */
public class C {
    public void depency(Interface1 interface1,Interface3 interface3){
        System.out.println("C依赖D");
        interface1.op1();
        interface3.op4();
        interface3.op5();
    }
}
