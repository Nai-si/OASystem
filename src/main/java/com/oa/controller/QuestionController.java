package com.oa.controller;

import com.github.pagehelper.Page;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/queryquestionbyno.do")
    public Map<String,Object> query(Integer page, Integer limit){
        List<Question> list = questionService.findAll(page, limit);
        long total = ((Page)list).getTotal();
        Map<String ,Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;

    }

    @RequestMapping("/questionupdate.do")
    public JsonResult updateQuestion(Integer id, Integer type, String question, String answer) {
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

        q1.setId(id);
        q1.setQuestion(question);
        q1.setAnswer(answer);

        questionService.updateById(q1);
        return new JsonResult(1,"修改成功");
    }

    @RequestMapping("/questiondelete.do")
    public JsonResult deleteQuestion(Integer id) {
        questionService.deleteById(id);
        return new JsonResult(1,"删除成功");
    }

    @RequestMapping("/addNote.do")
    public JsonResult addNote(String question ,String answer,HttpSession session){
        User user = (User) session.getAttribute(StrUtil.LOGIN_USER);

        Question question1 = new Question();
        question1.setU_no(user.getNo());
        question1.setFlag("笔记");
        question1.setQtype("笔记");
        question1.setQuestion(question);
        question1.setAnswer(answer);

        questionService.addNote(question1);
        return new JsonResult(1,"笔记添加成功！");
    }
}
