package com.canyan7n.principle.segregation.improve;

import com.canyan7n.principle.segregation.A;
import com.canyan7n.principle.segregation.B;
import com.canyan7n.principle.segregation.C;
import com.canyan7n.principle.segregation.D;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :Segregation1
 * @date ：2023/4/25 19:33
 * @description：TODO
 * a通过接口依赖b类，虽然a只需要有1 2 3 功能，但b缺需要实现接口中的所有方法
 * c通过接口依赖d类，虽然a只需要有1 4 5 功能，但d缺需要实现接口中的所有方法
 */
public class Segregation2 {
    public static void main(String[] args) {
        A a = new A();
        a.depency(new B());
        System.out.println("========");
        C c = new C();
        c.depency(new D());
    }
}
