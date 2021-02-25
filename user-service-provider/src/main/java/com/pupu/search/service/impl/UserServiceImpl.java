package com.pupu.search.service.impl;

import com.pupu.search.bean.UserAddress;
import com.pupu.search.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "福州", "1", "王老师", "123", Boolean.TRUE);
        UserAddress address2 = new UserAddress(2, "广州", "1", "王老师", "456", Boolean.FALSE);
        return Arrays.asList(address1, address2);
    }
}
