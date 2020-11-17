package com.suave.bulider.demo02;

/**
 * 抽象的建造者方法
 * 定义ABCD四个步骤
 *
 * @author Suave
 * @date 2020/11/13 15:30
 */
public abstract class Builder {

    // 汉堡
    abstract Builder buildA(String msg);

    // 可乐
    abstract Builder buildB(String msg);

    // 薯条
    abstract Builder buildC(String msg);

    // 甜点
    abstract Builder buildD(String msg);

    abstract Product getProduct();

}
