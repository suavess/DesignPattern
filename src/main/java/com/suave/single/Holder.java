package com.suave.single;

/**
 * 静态内部类单例模式
 * @author Suave
 * @date 2020/11/12 15:44
 */
public class Holder {
    /**
     * 私有构造方法
     */
    private Holder(){
    }

    public static Holder getInstance(){
        return InnerClass.HOLDER;
    }

    /**
     * 静态内部类
     */
    private static class InnerClass{
        private static final Holder HOLDER = new Holder();
    }
}
