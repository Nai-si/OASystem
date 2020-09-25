package com.oa.service;

import com.oa.entity.User;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/25 16:10
 * @Description:
 */
public interface LoginService {
    public User login(String no , String password);
}
