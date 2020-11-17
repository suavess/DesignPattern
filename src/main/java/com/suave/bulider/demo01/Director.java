package com.suave.bulider.demo01;

/**
 * 指挥者
 * 负责构建工程，控制构建过程
 * @author Suave
 * @date 2020/11/16 11:09
 */
public class Director {
    public Product build(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }
}
