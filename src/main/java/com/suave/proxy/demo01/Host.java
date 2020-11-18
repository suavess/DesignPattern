package com.suave.proxy.demo01;

/**
 * 房东
 *
 * @author Suave
 * @date 2020/11/18 09:36
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东出租房子~");
    }
}
