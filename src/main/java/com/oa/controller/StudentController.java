package com.oa.controller;

import com.oa.common.JsonResult;
import com.oa.entity.Student;
import com.oa.entity.User;
import com.oa.service.StudentService;
import com.oa.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/27 8:24
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 查询当前登录的学生信息
     * @param session
     * @return
     */
    @RequestMapping("/queryStudent.do")
    public JsonResult queryStudent(HttpSession session){
        User user = (User) session.getAttribute(StrUtil.LOGIN_USER);
        return new JsonResult(1,studentService.selectStudentByNo(user.getNo()));
    }

    /**
     * 添加学生
     * @param student
     * @return
     */
    @RequestMapping("/insertStudent.do")
    public JsonResult insert(Student student){
        studentService.insertStudent(student);
        return new JsonResult(1,"添加学生成功");
    }

}
