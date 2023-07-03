package com.canyan7n.single.lazy;

/**
 * @projectName: GOF23
 * @package: com.canyan7n.single.lazy
 * @className: SingleObjectThreadUnsage
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/3 11:05
 * @version: 1.0
 */

public class LSingleObjectThreadUnsafe {
    private static LSingleObjectThreadUnsafe instance;

    private LSingleObjectThreadUnsafe() {
    }

    public static LSingleObjectThreadUnsafe getInstance(){
        if (instance == null){
            instance = new LSingleObjectThreadUnsafe();
        }
        System.out.println("懒汉式创建实例，线程不安全");
        return instance;
    }
}
