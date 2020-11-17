package com.suave.bulider.demo01;

/**
 * 抽象的建造者方法
 * 定义ABCD四个步骤
 *
 * @author Suave
 * @date 2020/11/13 15:30
 */
public abstract class Builder {

    abstract void buildA();

    abstract void buildB();

    abstract void buildC();

    abstract void buildD();

    abstract Product getProduct();

}
