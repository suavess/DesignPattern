package com.suave.adapter;

/**
 * 客户端类:没有网线接口，但是想上网，找适配器
 * @author Suave
 * @date 2020/11/17 19:31
 */
public class Computer {
    /**
     * 上网的具体实现，找转接头
     */
    public void net(NetToUsb netToUsb){
        netToUsb.handleRequest();
    }

    public static void main(String[] args) {
        // 电脑
        Computer computer = new Computer();
        // 网线
        Adapt adapt = new Adapt();
        // 类适配器
//        Adapter adapter = new Adapter();
        Adapter2 adapter2 = new Adapter2(adapt);
        computer.net(adapter2);


    }
}
