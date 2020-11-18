package com.suave.proxy.demo02;

/**
 * @author Suave
 * @date 2020/11/18 10:42
 */
public class UserServiceImpl implements UserService {
    @Override
    public void create() {
        System.out.println("增加了一个用户~");
    }

    @Override
    public void retrieve() {
        System.out.println("查询了一个用户~");
    }

    @Override
    public void update() {
        System.out.println("更新了一个用户~");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户~");
    }
}
