package com.suave.proxy.demo02;

/**
 * @author Suave
 * @date 2020/11/18 10:46
 */
public class UserServiceProxy implements UserService {

    private UserService userService;

    public void setUserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void create() {
        log("create");
        userService.create();
    }

    @Override
    public void retrieve() {
        log("retrieve");
        userService.retrieve();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    public void log(String msg) {
        System.out.printf("使用了 %s 方法%n", msg);
    }
}
