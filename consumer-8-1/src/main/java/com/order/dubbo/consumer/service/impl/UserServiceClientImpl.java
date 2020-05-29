package com.order.dubbo.consumer.service.impl;

import com.order.dubbo.bean.UserAddress;
import com.order.dubbo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ��������:
 * ��Ŀ����:order-dubbo
 * ��������:2020/5/28
 * @author Lenovo
 */
@Service("userServiceClient")
public class UserServiceClientImpl {
    @Resource
    private UserService userService;

    public void printUserInfo(String userId) {
        List<UserAddress> userAddressList = userService.optUserAddress(userId);
        if (userAddressList != null) {
            System.out.println("userAddressList = " + userAddressList.get(0).toString());
        }
    }
}
