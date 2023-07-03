package com.canyan7n.single.hungry;



public class HSingleObjectThreadSafe {
    private static HSingleObjectThreadSafe instance = new HSingleObjectThreadSafe();
    private HSingleObjectThreadSafe() {
    }
    public static synchronized HSingleObjectThreadSafe getInstance(){
        System.out.println("1. 饿汉式创建实例");
        return instance;
    }
}
