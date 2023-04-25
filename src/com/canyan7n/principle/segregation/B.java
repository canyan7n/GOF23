package com.canyan7n.principle.segregation;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :B
 * @date ：2023/4/25 19:33
 * @description：TODO
 */
public class B implements InterfaceA{
    @Override
    public void op1() {
        System.out.println("B 调用了 操作1");
    }

    @Override
    public void op2() {
        System.out.println("B 调用了 操作2");
    }

    @Override
    public void op3() {
        System.out.println("B 调用了 操作3");
    }

    @Override
    public void op4() {
        System.out.println("B 调用了 操作4");
    }

    @Override
    public void op5() {
        System.out.println("B 调用了 操作5");
    }
}
