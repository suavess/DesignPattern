package com.suave.proxy.demo01;

/**
 * 代理对象 中介
 * 中介要帮房东出租房子，需要实现出租接口
 *
 * @author Suave
 * @date 2020/11/18 09:39
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    public void seeHouse() {
        System.out.println("中介带看房子~");
    }

    public void fare() {
        System.out.println("收中介费~");
    }

    public void hetong() {
        System.out.println("签租赁合同~");
    }
}
