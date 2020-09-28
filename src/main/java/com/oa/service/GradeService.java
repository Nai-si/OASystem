package com.oa.service;

import com.oa.entity.Grade;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/26 22:23
 * @Description:
 */
public interface GradeService {

    /**
     * 新增班级
     * @param grade
     */
    void insertGrade(Grade grade);

    /**
     * 展示班级列表（分页）
     * @param page
     * @param limit
     * @return
     */
    List<Grade> selectGradeAll(Integer page,Integer limit);

    /**
     * 添加学生信息时班级下拉框的展示
     * @return
     */
    List<Grade> selectGrade();

    /**
     * 修改班级信息
     * @param grade
     */
    void updateGradeInfo(Grade grade);

    /**
     * 删除班级信息
     * @param id
     */
    void deleteGradeById(int id);
}
