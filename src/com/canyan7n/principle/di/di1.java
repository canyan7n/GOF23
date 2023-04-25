package com.canyan7n.principle.di;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :di1
 * @date ：2023/4/25 19:46
 * @description：TODO
 * 人用手机玩，人依赖手机，依赖在具体上
 * 如果现在要用平板玩，扩展困难
 */
public class di1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.play(new Phone());
    }
}
