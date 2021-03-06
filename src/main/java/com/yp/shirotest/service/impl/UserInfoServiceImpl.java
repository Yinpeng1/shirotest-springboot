package com.yp.shirotest.service.impl;

import com.yp.shirotest.dao.UserInfo;
import com.yp.shirotest.dao.UserInfoRepository;
import com.yp.shirotest.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoRepository userInfoRepository;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername");
        return userInfoRepository.findByUsername(username);
    }
}
