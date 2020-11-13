package com.suave.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 枚举单例模式
 *
 * @author Suave
 * @date 2020/11/12 16:39
 */
public enum Singleton {
    INSTANCE;

    public static Singleton getInstance() {
        return INSTANCE;
    }
}

class test{
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        Singleton instance1 = constructor.newInstance();
        Singleton instance2 = constructor.newInstance();
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
