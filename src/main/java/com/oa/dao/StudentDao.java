package com.oa.dao;

import com.oa.entity.Student;
import com.oa.vo.VoStudent;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/27 8:25
 * @Description:
 */
public interface StudentDao {

    VoStudent selectStudentByNo(String no);

    void insertStudent(Student student);

}
