package com.oa.dao;

import com.oa.entity.Grade;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/26 22:21
 * @Description:
 */
public interface GradeDao {

    /**
     * 新增班级
     * @param grade
     */
    void insertGrade(Grade grade);

}
