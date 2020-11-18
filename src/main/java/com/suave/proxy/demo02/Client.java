package com.suave.proxy.demo02;

/**
 * @author Suave
 * @date 2020/11/18 10:44
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserServiceProxy(userService);
        userServiceProxy.create();
    }
}
