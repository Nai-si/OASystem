package com.oa.controller;

import com.oa.common.JsonResult;
import com.oa.entity.Question;
import com.oa.entity.User;
import com.oa.service.QuestionService;
import com.oa.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 17:55
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    /**
     * 新增问题
     * @param session
     * @param type
     * @param question
     * @param answer
     * @param star
     * @return
     */
    @RequestMapping("/addQuestion.do")
    public JsonResult addQuestion(HttpSession session, Integer type, String question, String answer, Integer star) {

        User user = (User)session.getAttribute(StrUtil.LOGIN_USER);
        String no = user.getNo();

        Question q1 = new Question();

        if(1 == type) {
            q1.setQtype("基础面试");
        }
        if(2 == type) {
            q1.setQtype("进阶面试");
        }
        if(3 == type) {
            q1.setQtype("核心算法");
        }
        if(4 == type) {
            q1.setQtype("底层原理");
        }

        q1.setU_no(no);
        q1.setFlag("资源");
        q1.setQuestion(question);
        q1.setAnswer(answer);
        q1.setStar(star);

        questionService.addQuestion(q1);

        return new JsonResult(1,"添加成功");
    }
}
