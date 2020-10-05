package com.oa.controller;

import com.oa.common.JsonResult;
import com.oa.entity.Skill;
import com.oa.entity.User;
import com.oa.service.SkillService;
import com.oa.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 16:52
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/skill")
public class SkillController {

    @Autowired
    private SkillService skillService;

    @RequestMapping("/add.do")
    public JsonResult add(String content, HttpSession session){
        User user = (User) session.getAttribute(StrUtil.LOGIN_USER);
        Skill skill = new Skill();
        skill.setContent(content);
        skill.setU_no(user.getNo());
        skillService.add(skill);
        return new JsonResult(1,"添加成功");
    }

}
