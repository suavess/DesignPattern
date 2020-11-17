package com.suave.adapter;

/**
 * 真正的适配器，需要连接USB和网线
 * 组合的方式实现
 * @author Suave
 * @date 2020/11/17 19:35
 */
public class Adapter2 implements NetToUsb{

    private Adapt adapt;

    /**
     * 构造适配器时，实例化需要适配的类
     */
    public Adapter2(Adapt adapt){
        this.adapt = adapt;
    }

    /**
     * 处理请求
     */
    @Override
    public void handleRequest() {
        adapt.request();
    }
}
