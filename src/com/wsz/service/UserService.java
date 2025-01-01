package com.wsz.service;

import com.wsz.spring.*;

@Component("userService")
public class UserService implements UserInterface {
//public class UserService implements BeanNameAware, InitializingBean, UserInterface {
    @Autowired
    private OrderService orderService;

    @Override
    public void test() {
        System.out.println("原始方法。。。");
    }

    private String beanName;

//    @Override
    public void setBeanName(String beanName) {
        System.out.println("执行Aware接口中的方法。。。。。");
        this.beanName = beanName;
    }

//    @Override
    public void afterPropertiesSet() {
        System.out.println("执行初始化方法。。。。。");
    }
}
