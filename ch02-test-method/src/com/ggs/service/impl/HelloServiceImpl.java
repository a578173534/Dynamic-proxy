package com.ggs.service.impl;

import com.ggs.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("你好：" + name);
    }
}
