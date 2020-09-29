package com.oa.service;

import com.oa.entity.Course;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 11:37
 * @Description:
 */
public interface CourseService {

    /**
     * 新增学科
     * @param course
     */
    void addCourse(Course course);

    /**
     * 查询所有学科信息
     * @return
     */
    List<Course> selectAll();

    /**
     * 修改学科信息
     * @param course
     */
    void updateCourse(Course course);

}
