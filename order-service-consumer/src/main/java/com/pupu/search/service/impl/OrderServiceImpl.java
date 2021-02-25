package com.pupu.search.service.impl;

import com.pupu.search.bean.UserAddress;
import com.pupu.search.service.OrderService;
import com.pupu.search.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    @Override
    public void initOrder(String userId) {
        List<UserAddress> addresses = userService.getUserAddressList(userId);
        System.out.println(addresses);
    }
}
