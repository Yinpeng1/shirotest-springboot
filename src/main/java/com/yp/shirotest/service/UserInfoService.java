package com.yp.shirotest.service;

import com.yp.shirotest.dao.UserInfo;

public interface UserInfoService {

    UserInfo findByUsername(String username);
}
