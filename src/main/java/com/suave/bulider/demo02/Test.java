package com.suave.bulider.demo02;

/**
 * @author Suave
 * @date 2020/11/16 11:52
 */
public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker.buildA("全家桶").getProduct();
        System.out.println(product.toString());
    }
}
