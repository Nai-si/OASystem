package com.oa.controller;

import com.oa.common.JsonResult;
import com.oa.entity.User;
import com.oa.service.LoginService;
import com.oa.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/25 15:57
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("login.do")
    public JsonResult login(String no , String password, HttpSession session){
        User user = loginService.login(no, password);
        session.setAttribute(StrUtil.LOGIN_USER,user);
        return new JsonResult(1,user.getIdentity());
    }

}
