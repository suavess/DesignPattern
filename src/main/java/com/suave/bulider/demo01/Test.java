package com.suave.bulider.demo01;

/**
 * 将复杂对象的构建与表示分离
 * @author Suave
 * @date 2020/11/16 11:14
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build.toString());
    }
}
