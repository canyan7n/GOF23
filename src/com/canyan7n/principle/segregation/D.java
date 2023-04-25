package com.canyan7n.principle.segregation;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :D
 * @date ：2023/4/25 19:37
 * @description：TODO
 */
public class D implements InterfaceA{
    @Override
    public void op1() {
        System.out.println("D 调用了 操作1");
    }

    @Override
    public void op2() {
        System.out.println("D 调用了 操作2");
    }

    @Override
    public void op3() {
        System.out.println("D 调用了 操作3");
    }

    @Override
    public void op4() {
        System.out.println("D 调用了 操作4");
    }

    @Override
    public void op5() {
        System.out.println("D 调用了 操作5");
    }
}
