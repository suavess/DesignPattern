package com.suave.factory.simple;

/**
 * 工厂类 简单工程模式（静态工厂模式）
 * @author Suave
 * @date 2020/11/13 09:18
 */
public class CarFactory {
    // 方法一 新增Car实现类时需要修改原有代码逻辑，违反开闭原则
    public static Car getCar(String name){
        if ("WuLing".equals(name)){
            return new WuLing();
        } else if ("Tesla".equals(name)){
            return new Tesla();
        } else {
            return null;
        }
    }

    // 方法二 新增Car实现类需要新增方法
    public static Car getWuLing(){
        return new WuLing();
    }
    public static Car getTesla(){
        return new WuLing();
    }
}
