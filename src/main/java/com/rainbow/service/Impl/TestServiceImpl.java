package com.rainbow.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.rainbow.service.TestService;

/**
 * Created by lailai on 2017/11/28.
 */
//@Service(version = "1.0.0")
public class TestServiceImpl implements TestService{
    @Override
    public String sayHello(String name) {
        return "hello "+name+"!,欢迎来到dubbo世界";
    }
}
