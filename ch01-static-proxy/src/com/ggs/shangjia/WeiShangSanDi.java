package com.ggs.shangjia;

import com.ggs.factory.UsbSanFactory;
import com.ggs.service.UsbSell;

public class WeiShangSanDi implements UsbSell {
    //代理的是 闪迪，定义目标厂家类
    private UsbSell factory = new UsbSanFactory();

    @Override
    public float sell(int amount) {
        //调用目标方法
        float price = factory.sell(amount);
        //只增加1元
        price = price + 1 * amount;
        return price;
    }
}
