package com.suave.factory.abstract1;

/**
 * 手机抽象接口
 * @author Suave
 * @date 2020/11/13 11:17
 */
public interface PhoneProduct {
    /**
     * 开机
     */
    void start();

    /**
     * 关机
     */
    void shutdown();

    /**
     * 打电话
     */
    void callup();

    /**
     * 发送短信
     */
    void sendSMS();
}
