package com.oa.service;

import com.oa.entity.Student;
import com.oa.vo.VoStudent;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/27 8:28
 * @Description:
 */
public interface StudentService {

    VoStudent selectStudentByNo(String no);

    void insertStudent(Student student);

}
