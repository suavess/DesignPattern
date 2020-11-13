package com.suave.factory.method;

/**
 * 方法工厂模式
 * 优点是新建实现类时无需修改原有类的代码，直接扩展新类，满足了开闭原则
 * 但是逻辑复杂度 代码复杂度
 * @author Suave
 * @date 2020/11/13 09:15
 */
public class Consumer {
    public static void main(String[] args) {
        Car wuLing = new WuLingFactory().getCar();
        Car tesla = new TeslaFactory().getCar();

        wuLing.name();
        tesla.name();
    }
}
