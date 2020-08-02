package com.ggs.shangjia;

import com.ggs.factory.UsbKingFactory;
import com.ggs.service.UsbSell;

public class WeiShang implements UsbSell {
    //代理的是 金士顿，定义目标厂家类
    private UsbSell factory = new UsbKingFactory();

    @Override
    public float sell(int amount) {
        //调用目标方法
        float price = factory.sell(amount);
        //只增加1元
        price = price + 1 * amount;
        return price;
    }
}
