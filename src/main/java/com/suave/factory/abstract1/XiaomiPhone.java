package com.suave.factory.abstract1;

/**
 * @author Suave
 * @date 2020/11/13 11:24
 */
public class XiaomiPhone implements PhoneProduct {
    /**
     * 开机
     */
    @Override
    public void start() {
        System.out.println("小米手机开机~~~");
    }

    /**
     * 关机
     */
    @Override
    public void shutdown() {
        System.out.println("小米手机关机~~~");
    }

    /**
     * 打电话
     */
    @Override
    public void callup() {
        System.out.println("小米手机打电话~~~");
    }

    /**
     * 发送短信
     */
    @Override
    public void sendSMS() {
        System.out.println("小米手机发短信~~~");
    }
}
