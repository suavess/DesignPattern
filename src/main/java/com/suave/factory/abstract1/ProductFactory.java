package com.suave.factory.abstract1;

/**
 * 抽象产品工程
 *
 * @author Suave
 * @date 2020/11/13 12:01
 */
public interface ProductFactory {
    PhoneProduct phoneProduct();

    RouterProduct routerProduct();
}
