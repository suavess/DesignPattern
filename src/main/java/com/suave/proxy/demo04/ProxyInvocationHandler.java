package com.suave.proxy.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用这个类动态生成代理类
 *
 * @author Suave
 * @date 2020/11/18 11:58
 */
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 得到代理类
     *
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 处理代理实例，返回结果
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName() + "=====执行开始");
        Object result = method.invoke(target, args);
        log(method.getName() + "=====执行结束");
        return result;
    }

    private void seeHouse() {
        System.out.println("中介带看房子~");
    }

    private void fare() {
        System.out.println("收中介费~");
    }

    private void log(String msg) {
        System.out.println(msg);
    }

}
