package com.oa.controller;

import com.oa.common.JsonResult;
import com.oa.entity.Course;
import com.oa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

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
}
