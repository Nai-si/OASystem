package com.oa.service.impl;

import com.oa.dao.GradeDao;
import com.oa.entity.Grade;
import com.oa.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/26 22:24
 * @Description:
 */
@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeDao gradeDao;

    /**
     * 新增班级
     * @param grade 前端传来的班级数据
     */
    @Override
    public void insertGrade(Grade grade) {
        if (grade == null) {
            throw new RuntimeException("输入班级信息错误");
        }
        gradeDao.insertGrade(grade);
    }
}
