package com.suave.single;

/**
 * 饿汉式单例模式
 * 类加载时会直接创建类对象
 * 可能会浪费内存空间
 * @author Suave
 * @date 2020/11/12 10:19
 */
public class Hungry {

    private byte[] a = new byte[1024*1024];
    private byte[] b = new byte[1024*1024];
    private byte[] c = new byte[1024*1024];
    private byte[] d = new byte[1024*1024];

    /**
     * 无参构造
     */
    private Hungry() {

    }

    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance() {
        return HUNGRY;
    }
}
