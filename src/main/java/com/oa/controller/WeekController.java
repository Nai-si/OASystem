package com.oa.controller;

import com.oa.common.JsonResult;
import com.oa.entity.User;
import com.oa.entity.Week;
import com.oa.service.WeekService;
import com.oa.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 16:34
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/week")
public class WeekController {

    @Autowired
    private WeekService weekService;

    @RequestMapping("/add.do")
    public JsonResult addWeek(String title , String content, HttpSession session){
        User user = (User) session.getAttribute(StrUtil.LOGIN_USER);
        Week week = new Week();
        week.setTitle(title);
        week.setContent(content);
        week.setStatus(1);
        week.setU_no(user.getNo());
        weekService.addWeek(week);
        return new JsonResult(1,"添加成功!");
    }

}