package com.canyan7n.factory.abstract_;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :Client
 * @date ：2023/4/24 18:23
 * @description：TODO
 */

/**
 * 模拟科技公司的产品固定，使用抽象工厂生产产品
 * 产品等级固定，扩展展品族
 * 如果要扩展产品等级，就要修改抽象工厂及其它的实现，违反开闭原则
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("===小米生产线===");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        Phone xioamiPhone = xiaomiFactory.getPhone();
        xioamiPhone.start();
        xioamiPhone.stop();
        xioamiPhone.sendMsg();
        Router xioamiRouter = xiaomiFactory.getRouter();
        xioamiRouter.start();
        xioamiRouter.stop();
        xioamiRouter.router();
        Computer xiaomiComputer = xiaomiFactory.getComputer();
        xiaomiComputer.start();
        xiaomiComputer.stop();
        xiaomiComputer.work();
        System.out.println("===华为生产线===");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        Phone huaweiPhoen = huaweiFactory.getPhone();
        huaweiPhoen.start();
        huaweiPhoen.stop();
        huaweiPhoen.sendMsg();
        Router huaweiRouter = huaweiFactory.getRouter();
        huaweiRouter.start();
        huaweiRouter.stop();
        huaweiRouter.router();
        Computer huaweiComputer = huaweiFactory.getComputer();
        huaweiComputer.start();
        huaweiComputer.stop();
        huaweiComputer.work();
        System.out.println("===苹果生产线===");
        AppleFactory appleFactory = new AppleFactory();
        Phone applePhone = appleFactory.getPhone();
        applePhone.start();
        applePhone.stop();
        applePhone.sendMsg();
        Router appleRouter = appleFactory.getRouter();
        appleRouter.start();
        appleRouter.stop();
        appleRouter.router();
        Computer appleComputer = appleFactory.getComputer();
        appleComputer.start();
        appleComputer.stop();
        appleComputer.work();
    }
}
