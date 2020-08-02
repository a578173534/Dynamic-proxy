package com.ggs.service.impl;

import com.ggs.service.HelloService;

public class HelloServiceImpl2 implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("========你好：" + name);
    }
}
