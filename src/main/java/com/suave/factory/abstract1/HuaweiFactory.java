package com.suave.factory.abstract1;

/**
 * @author Suave
 * @date 2020/11/13 14:27
 */
public class HuaweiFactory implements ProductFactory {
    @Override
    public PhoneProduct phoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new HuaweiRouter();
    }
}
