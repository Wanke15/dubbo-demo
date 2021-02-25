package com.pupu.search.service;

import com.pupu.search.bean.UserAddress;

import java.util.List;

public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
