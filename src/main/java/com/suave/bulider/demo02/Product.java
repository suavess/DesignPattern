package com.suave.bulider.demo02;

import lombok.Data;
import lombok.ToString;

/**
 * 产品：套餐
 * @author Suave
 * @date 2020/11/16 11:41
 */
@Data
@ToString
public class Product {
    private String BuildA = "汉堡";
    private String BuildB = "可乐";
    private String BuildC = "薯条";
    private String BuildD = "甜点";
}
