package com.oa.controller;

import com.github.pagehelper.Page;
import com.oa.common.JsonResult;
import com.oa.entity.Grade;
import com.oa.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("insertGrade.do")
    public JsonResult insertGrade(Grade grade){
        gradeService.insertGrade(grade);
        return new JsonResult(1,"添加班级成功！");
    }

    @RequestMapping("selectGradeAll.do")
    public Map<String,Object> selectGradeAll(Integer page,Integer limit){
        List<Grade> list = gradeService.selectGradeAll(page, limit);
        long total = ((Page) list).getTotal();
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg", "");
        map.put("count",total);
        map.put("data", list);
        return map;

    }

}
