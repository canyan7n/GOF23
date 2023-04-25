package com.canyan7n.principle.segregation.improve;

import com.canyan7n.principle.segregation.InterfaceA;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :D
 * @date ：2023/4/25 19:37
 * @description：TODO
 */
public class D implements Interface1,Interface3 {
    @Override
    public void op1() {
        System.out.println("D 调用了 操作1");
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
