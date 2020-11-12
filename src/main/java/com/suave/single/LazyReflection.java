package com.suave.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射破坏懒汉式单例模式
 * 在调用方法时才会创建
 * 多线程下可能会多次实例化，有线程安全问题
 *
 * @author Suave
 * @date 2020/11/12 10:26
 */
public class LazyReflection {

    private static boolean flag = false;

    /**
     * 无参构造
     */
    private LazyReflection() {
        if (!flag) {
            flag = true;
        } else {
            throw new RuntimeException("请不要通过反射破坏单例");
        }
//        if (lazyReflection != null){
//            throw new RuntimeException("请不要通过反射破坏单例");
//        }
        System.out.println(Thread.currentThread().getName() + "====创建了实例");
    }

    /**
     * 1.开辟内存空间
     * 2.初始化对象
     * 3.将对象指向内存空间
     * 当A线程执行顺序为132时，B线程进入，此时会返回null
     * 需要volatile关键字防止指令重排
     */
    private volatile static LazyReflection lazyReflection;

    /**
     * 双重校验锁，保证线程安全及性能
     */
    public static LazyReflection getInstance() {
        if (lazyReflection == null) {
            synchronized (LazyReflection.class){
                if (lazyReflection == null){
                    lazyReflection = new LazyReflection();
                }
            }
        }
        return lazyReflection;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        LazyReflection instance1 = getInstance();
        Constructor<LazyReflection> constructor = LazyReflection.class.getDeclaredConstructor();
        LazyReflection instance1 = constructor.newInstance();
        LazyReflection instance2 = constructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }

}
