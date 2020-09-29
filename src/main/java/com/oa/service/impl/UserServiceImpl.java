package com.oa.service.impl;

import com.oa.dao.UserDao;
import com.oa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 21:46
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String selectNameByNo(String no) {
        return userDao.selectNameByNo(no);
    }
}
