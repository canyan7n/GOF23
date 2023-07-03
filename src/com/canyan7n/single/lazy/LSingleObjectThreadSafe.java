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

public class LSingleObjectThreadSafe {
    private static LSingleObjectThreadSafe instance;

    private LSingleObjectThreadSafe() {
    }

    public static synchronized LSingleObjectThreadSafe getInstance(){
        if (instance == null){
            instance = new LSingleObjectThreadSafe();
        }
        System.out.println("懒汉式创建实例，线程安全");
        return instance;
    }
}
