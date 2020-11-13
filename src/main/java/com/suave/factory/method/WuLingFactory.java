package com.suave.factory.method;

/**
 * @author Suave
 * @date 2020/11/13 10:07
 */
public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}