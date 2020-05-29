package com.order.dubbo.consumer.main;

import com.order.dubbo.consumer.service.impl.UserServiceClientImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 功能描述:
 * 项目名称:order-dubbo
 * 创建日期:2020/5/28
 *
 * @author Lenovo
 */
public class OrderConsumerMain {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        UserServiceClientImpl userServiceClient = (UserServiceClientImpl) applicationContext.getBean("userServiceClient");
        userServiceClient.printUserInfo("1");
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);
        System.out.println("客户端已经完成调用-------------------------");
    }
}
