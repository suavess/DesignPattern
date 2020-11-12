package com.suave.single;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式单例模式
 * 在调用方法时才会创建
 * 多线程下可能会多次实例化，有线程安全问题
 *
 * @author Suave
 * @date 2020/11/12 10:26
 */
public class Lazy {

    /**
     * 无参构造
     */
    private Lazy() {
        System.out.println(Thread.currentThread().getName() + "====创建了实例");
    }

    /**
     * 1.开辟内存空间
     * 2.初始化对象
     * 3.将对象指向内存空间
     * 当A线程执行顺序为132时，B线程进入，此时会返回null
     * 需要volatile关键字防止指令重排
     */
    private volatile static Lazy lazy;

    /**
     * 双重校验锁，保证线程安全及性能
     */
    public static Lazy getInstance() {
        if (lazy == null) {
            synchronized (Lazy.class){
                if (lazy == null){
                    lazy = new Lazy();
                }
            }
        }
        return lazy;
    }

}
