package com.yp.shirotest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Long>{

     UserInfo findByUsername(String username);

     UserInfo save(UserInfo userInfo);
}
