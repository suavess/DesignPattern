package com.suave.proxy.demo03;

/**
 * @author Suave
 * @date 2020/11/18 14:00
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();
        // 代理角色
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        invocationHandler.setRent(host);
        Rent proxy = (Rent) invocationHandler.getProxy();
        proxy.rent();
    }
}
