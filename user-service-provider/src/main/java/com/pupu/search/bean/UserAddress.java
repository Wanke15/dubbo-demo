package com.pupu.search.bean;

import java.io.Serializable;

public class UserAddress implements Serializable{
    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee; // 收货人
    private String phoneNum;
    private Boolean isDefault; // 是否为默认地址

    public UserAddress() {
        super();
    }

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum, Boolean isDefault) {
        id = id;
        userAddress = userAddress;
        userId = userId;
        consignee = consignee;
        phoneNum = phoneNum;
        isDefault = isDefault;
    }
}
