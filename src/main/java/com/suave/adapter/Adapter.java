package com.suave.adapter;

/**
 * 真正的适配器，需要连接USB和网线
 * 类继承的方法实现，单继承，有局限性
 * @author Suave
 * @date 2020/11/17 19:35
 */
public class Adapter extends Adapt implements NetToUsb{
    /**
     * 处理请求
     */
    @Override
    public void handleRequest() {
        super.request();
    }
}
