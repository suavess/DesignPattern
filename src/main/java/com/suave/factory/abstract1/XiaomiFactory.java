package com.suave.factory.abstract1;

/**
 * @author Suave
 * @date 2020/11/13 14:27
 */
public class XiaomiFactory implements ProductFactory {
    @Override
    public PhoneProduct phoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public RouterProduct routerProduct() {
        return new XiaomiRouter();
    }
}
