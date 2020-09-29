package com.oa.controller;

import com.oa.common.JsonResult;
import com.oa.entity.User;
import com.oa.service.UserService;
import com.oa.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 21:49
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询姓名并显示在页面上
     * @param session
     * @return
     */
    @RequestMapping("/query.do")
    public JsonResult query(HttpSession session){
        User user = (User) session.getAttribute(StrUtil.LOGIN_USER);
        String name = userService.selectNameByNo(user.getNo());
        return new JsonResult(1,name);
    }
}
