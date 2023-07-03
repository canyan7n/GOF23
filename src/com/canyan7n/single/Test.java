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

public class Test{
    public static void main(String[] args) {
        testHungry();
        testLazy();
        testDoubleLock();
        testStaticInnerClass();
    }
    public static void testHungry(){
        HSingleObjectThreadSafe instance = HSingleObjectThreadSafe.getInstance();
    }
    public static void testLazy(){
        LSingleObjectThreadSafe safe = LSingleObjectThreadSafe.getInstance();
        LSingleObjectThreadUnsafe unsafe = LSingleObjectThreadUnsafe.getInstance();
    }
    public static void testDoubleLock() {
        DSingleObjectThreadSafe instance = DSingleObjectThreadSafe.getInstance();
    }
    private static void testStaticInnerClass() {
        CSingleObjectThreadSafe instance = CSingleObjectThreadSafe.getInstance();
    }
}
