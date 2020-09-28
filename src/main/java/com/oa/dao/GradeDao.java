package com.oa.dao;

import com.oa.entity.Grade;

import java.util.List;

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

    /**
     * 展示班级列表
     * @return
     */
    List<Grade> selectGradeAll();

    /**
     * 修改班级信息
     * @param grade
     */
    void updateGradeInfo(Grade grade);
}
