package com.canyan7n.single;

import com.canyan7n.single.doublelock.DSingleObjectThreadSafe;
import com.canyan7n.single.hungry.HSingleObjectThreadSafe;
import com.canyan7n.single.lazy.LSingleObjectThreadSafe;
import com.canyan7n.single.lazy.LSingleObjectThreadUnsafe;
import com.canyan7n.single.static_innerclass.CSingleObjectThreadSafe;

/**
 * @projectName: GOF23
 * @package: com.canyan7n.single
 * @className: Test
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/3 11:10
 * @version: 1.0
 */

public class Test extends Thread{
    @Override
    public void run() {
        testLazy();
    }

    public static void main(String[] args) {
        //testHungry();
        //testLazy();
        //testDoubleLock();
        //testStaticInnerClass();
        Thread t1 = new Test();
        Thread t2 = new Test();
        t1.start();
        t2.start();
    }
    /**
     * desc 饿汉式
     * date 2023/7/3
     * @author macheng
     **/
    public static void testHungry(){
        HSingleObjectThreadSafe instance = HSingleObjectThreadSafe.getInstance();
    }
    /**
     * desc 懒汉式
     * date 2023/7/3
     * @author macheng
     **/
    public static void testLazy() {
        LSingleObjectThreadSafe safe = LSingleObjectThreadSafe.getInstance();
        LSingleObjectThreadUnsafe unsafe = LSingleObjectThreadUnsafe.getInstance();
    }
    /**
     * desc 双检锁
     * date 2023/7/3
     * @author macheng
     **/
    public static void testDoubleLock() {
        DSingleObjectThreadSafe instance = DSingleObjectThreadSafe.getInstance();
    }
    /**
     * desc 静态内部类
     * date 2023/7/3
     * @author macheng
     **/
    private static void testStaticInnerClass() {
        CSingleObjectThreadSafe instance = CSingleObjectThreadSafe.getInstance();
    }
}
