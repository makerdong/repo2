package com.itheima.ssm.service;


import com.itheima.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

/*
* UserDetailService:规范用户认证方法
* */
public interface IUserService extends UserDetailsService {
    List<UserInfo> findAll() throws Exception;
}
