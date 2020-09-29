package com.oa.service.impl;

import com.oa.dao.CourseDao;
import com.oa.entity.Course;
import com.oa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 11:37
 * @Description:
 */
@Service
public class CourseSerivceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    @Override
    public List<Course> selectAll() {
        return courseDao.selectAll();
    }

    @Override
    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    @Override
    public void deleteCourse(Integer id) {
        courseDao.deleteCourse(id);
    }
}
