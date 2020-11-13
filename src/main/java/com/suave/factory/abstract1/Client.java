package com.suave.factory.abstract1;

/**
 * 抽象工厂模式
 * @author Suave
 * @date 2020/11/13 14:36
 */
public class Client {
    public static void main(String[] args) {
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        PhoneProduct xiaomiPhone = xiaomiFactory.phoneProduct();
        xiaomiPhone.callup();
        xiaomiPhone.sendSMS();
        RouterProduct routerProduct = xiaomiFactory.routerProduct();
        routerProduct.openWifi();
        routerProduct.setting();
    }
}
