package com.suave.factory.simple;

/**
 * @author Suave
 * @date 2020/11/13 09:15
 */
public class Consumer {
    public static void main(String[] args) {
        // 直接实例化
//        Car wuLing = new WuLing();
//        Car tesla = new Tesla();

        /**
         * 简单工厂模式创建
         */
        Car wuLing = CarFactory.getCar("WuLing");
        Car tesla = CarFactory.getCar("Tesla");

        wuLing.name();
        tesla.name();
    }
}
