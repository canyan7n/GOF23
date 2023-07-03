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

public class DSingleObject {
    private static DSingleObject instance;

    private DSingleObject() {
    }

    public static DSingleObject getInstance(){
        if (instance == null){
            synchronized(DSingleObject.class){
                instance = new DSingleObject();
            }
        }
        System.out.println("双检锁创建实例");
        return instance;
    }
}
