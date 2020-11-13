package com.suave.factory.abstract1;

/**
 * @author Suave
 * @date 2020/11/13 11:51
 */
public class XiaomiRouter implements RouterProduct {
    @Override
    public void start() {
        System.out.println("小米路由器启动~~~");
    }

    @Override
    public void shutdown() {
        System.out.println("小米路由器关闭~~~");
    }

    @Override
    public void openWifi() {
        System.out.println("小米路由器打开wifi~~~");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置~~~");
    }
}
