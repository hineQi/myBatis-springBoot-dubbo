package tk.mybatis.springboot.dubbotest.provider.impl;

import tk.mybatis.springboot.dubbotest.provider.DemoService;

/**
 * Created by Administrator on 2017/2/21.
 */

public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
