package com.suave.prototype.demo02;

import java.util.Date;

/**
 * 客户端
 * 实现克隆
 *
 * @author Suave
 * @date 2020/11/17 16:08
 */
public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        String a = "Java";
        Video v1 = new Video(a, date);
        Video v2 = (Video) v1.clone();

        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("=============");
        // 浅克隆改变date对象时，v1 v2值也会发生改变
        date.setTime(234567890123L);
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
    }
}
