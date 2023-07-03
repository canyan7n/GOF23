package com.canyan7n.single.doublelock;

/**
 * @projectName: GOF23
 * @package: com.canyan7n.single.doublelock
 * @className: DSingleObject
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/3 14:24
 * @version: 1.0
 */

public class DSingleObjectThreadSafe {
    private static DSingleObjectThreadSafe instance;

    private DSingleObjectThreadSafe() {
    }

    public static DSingleObjectThreadSafe getInstance(){
        if (instance == null){
            synchronized(DSingleObjectThreadSafe.class){
                instance = new DSingleObjectThreadSafe();
            }
        }
        System.out.println("4. 双检锁创建实例");
        return instance;
    }
}
