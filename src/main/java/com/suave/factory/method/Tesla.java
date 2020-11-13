package com.suave.factory.method;

/**
 * @author Suave
 * @date 2020/11/13 09:15
 */
public class Tesla implements Car {
    /**
     * 打印名称
     */
    @Override
    public void name() {
        System.out.println("Tesla");
    }
}
