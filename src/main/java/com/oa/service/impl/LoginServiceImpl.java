package com.oa.service.impl;

import com.oa.dao.LoginDao;
import com.oa.entity.User;
import com.oa.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/25 16:10
 * @Description:
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public User login (String no, String password) {
        User user = loginDao.login (no);
        if(user==null){
            throw new RuntimeException ("账号错误");
        }
        if(!user.getPassword().equals(password)){
            throw new RuntimeException ("密码错误");
        }
        return user;
    }

}
