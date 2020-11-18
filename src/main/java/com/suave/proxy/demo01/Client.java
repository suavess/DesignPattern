package com.suave.proxy.demo01;

/**
 * 客户
 *
 * @author Suave
 * @date 2020/11/18 09:38
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Host());
        proxy.rent();
    }
}
