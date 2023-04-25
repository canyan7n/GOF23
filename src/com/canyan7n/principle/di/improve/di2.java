package com.canyan7n.principle.di.improve;

import com.canyan7n.principle.di.Person;
import com.canyan7n.principle.di.Phone;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :di1
 * @date ：2023/4/25 19:46
 * @description：TODO
 */
public class di2 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.play(new Phone2());
        person2.play(new Pad());
    }
}
