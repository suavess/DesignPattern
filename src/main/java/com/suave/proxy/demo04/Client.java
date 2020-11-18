package com.suave.proxy.demo04;

import com.suave.proxy.demo02.UserService;
import com.suave.proxy.demo02.UserServiceImpl;

/**
 * @author Suave
 * @date 2020/11/18 14:38
 */
public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler();
        invocationHandler.setTarget(userService);
        UserService proxy = (UserService) invocationHandler.getProxy();
        proxy.create();
        proxy.retrieve();
        proxy.update();
        proxy.delete();
    }
}
