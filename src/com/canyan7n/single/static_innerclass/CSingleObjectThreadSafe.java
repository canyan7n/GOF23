package com.canyan7n.single.static_innerclass;

/**
 * @projectName: GOF23
 * @package: com.canyan7n.single.static_innerclass
 * @className: CSingleObject
 * @author: 马成
 * @description: TODO
 * @date: 2023/7/3 15:59
 * @version: 1.0
 */

public class CSingleObjectThreadSafe {
    private static class CSingleObjectThreadSafeHolder{
        private static final CSingleObjectThreadSafe instance = new CSingleObjectThreadSafe();
    }
    public CSingleObjectThreadSafe() {
    }
    public static CSingleObjectThreadSafe getInstance(){
        System.out.println("5. 静态内部类创建实例");
        return CSingleObjectThreadSafeHolder.instance;
    }
}
