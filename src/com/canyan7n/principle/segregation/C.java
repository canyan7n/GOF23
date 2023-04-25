package com.canyan7n.principle.segregation;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :C
 * @date ：2023/4/25 19:37
 * @description：TODO
 */
public class C {
    public void depency(InterfaceA interfaceA){
        System.out.println("C依赖D");
        interfaceA.op1();
        interfaceA.op4();
        interfaceA.op5();
    }
}
