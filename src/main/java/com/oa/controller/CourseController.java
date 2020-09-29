package com.oa.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.oa.common.JsonResult;
import com.oa.entity.Course;
import com.oa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 13:25
 * @Description:
 */
@Controller
@ResponseBody
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/addCourse")
    public JsonResult addCourse(String name, Date createtime ,Integer week,Integer type){
        Course course = new Course();
        course.setName(name);
        course.setCreatetime(createtime);
        course.setWeek(week);
        course.setType(type);
        courseService.addCourse(course);
        return new JsonResult(1,"新增成功");

    }

    @RequestMapping("/selectAll")
    public Map<String, Object> selectAll(Integer page,Integer limit){
        Map<String, Object> map = new HashMap<>();
        PageHelper.startPage(page, limit);

        List<Course> list = courseService.selectAll();
        long total = ((Page) list).getTotal();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }

    /**
     * 修改学科信息
     * @param id
     * @param name
     * @param createtime
     * @param week
     * @param type
     * @return
     */
    @RequestMapping("/updateCourse.do")
    public JsonResult update(Integer id , String name, Date createtime,Integer week, Integer type){
        Course course = new Course();
        course.setId(id);
        course.setName(name);
        course.setCreatetime(createtime);
        course.setWeek(week);
        course.setType(type);
        courseService.updateCourse(course);
        return new JsonResult(1,"修改成功");

    }

    @RequestMapping("/deleteCourse.do")
    public JsonResult delete(Integer id){
        courseService.deleteCourse(id);
        return new JsonResult(1,"删除成功");
    }
}
