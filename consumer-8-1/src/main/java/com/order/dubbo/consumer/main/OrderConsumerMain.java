package com.order.dubbo.consumer.main;

import com.order.dubbo.consumer.service.impl.UserServiceClientImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * ��������:
 * ��Ŀ����:order-dubbo
 * ��������:2020/5/28
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
        System.out.println("�ͻ����Ѿ���ɵ���-------------------------");
    }
}
