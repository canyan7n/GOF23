package com.canyan7n.principle.segregation;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :A
 * @date ：2023/4/25 19:33
 * @description：TODO
 */
public class A{
    public void depency(InterfaceA interfaceA){
        System.out.println("a依赖b");
        interfaceA.op1();
        interfaceA.op2();
        interfaceA.op3();
    }

}
