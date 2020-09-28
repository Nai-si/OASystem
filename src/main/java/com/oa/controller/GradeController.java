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

    /**
     * 用来展示添加学生信息时的班级下拉列表
     * @return
     */
    @RequestMapping("/selectGrade.do")
    public JsonResult selectGrade(){
        return new JsonResult(1,gradeService.selectGrade());
    }

    /**
     * 修改班级信息
     * @param grade
     * @return
     */
    @RequestMapping("/updateGrade.do")
    public JsonResult updateGrade(Grade grade){
        gradeService.updateGradeInfo(grade);
        return new JsonResult(1,"修改班级信息成功");
    }

    /**
     * 删除班级信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteGradeById.do")
    public JsonResult deleteGradeById(int id){
        gradeService.deleteGradeById(id);
        return new JsonResult(1,"删除班级成功");
    }

}
