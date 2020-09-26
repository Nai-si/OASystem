package com.oa.controller;

import com.oa.common.JsonResult;
import com.oa.entity.Grade;
import com.oa.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/26 22:21
 * @Description:
 */
@Controller
@RequestMapping("/grade")
@ResponseBody
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping("insertGrade")
    public JsonResult insertGrade(Grade grade){
        gradeService.insertGrade(grade);
        return new JsonResult(1,"添加班级成功！");
    }

}
