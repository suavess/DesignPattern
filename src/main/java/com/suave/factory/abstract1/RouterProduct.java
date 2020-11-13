package com.suave.factory.abstract1;

/**
 * 路由器产品接口
 * @author Suave
 * @date 2020/11/13 11:19
 */
public interface RouterProduct {
    /**
     * 启动
     */
    void start();

    /**
     * 关闭
     */
    void shutdown();

    /**
     * 打开wifi
     */
    void openWifi();

    /**
     * 设置
     */
    void setting();
}
