package com.suave.bulider.demo01;

/**
 * 具体的建造者：工人
 * @author Suave
 * @date 2020/11/13 17:35
 */
public class Worker extends Builder {

    private Product product;

    /**
     * 构造方法，创建产品
     */
    public Worker(){
        product = new Product();
    }

    @Override
    void buildA() {
        product.setBuildA("地基");
        System.out.println("地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋工程");
        System.out.println("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
