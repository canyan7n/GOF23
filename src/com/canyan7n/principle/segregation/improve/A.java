package com.canyan7n.principle.segregation.improve;

import com.canyan7n.principle.segregation.InterfaceA;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :A
 * @date ：2023/4/25 19:33
 * @description：TODO
 */
public class A{
    public void depency(Interface1 interface1,Interface2 interface2){
        System.out.println("a依赖b");
        interface1.op1();
        interface2.op2();
        interface2.op3();
    }
}
