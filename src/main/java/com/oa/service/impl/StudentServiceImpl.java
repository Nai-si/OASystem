package com.oa.service.impl;

import com.oa.dao.StudentDao;
import com.oa.entity.Student;
import com.oa.service.StudentService;
import com.oa.vo.VoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/27 8:32
 * @Description:
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public VoStudent selectStudentByNo(String no) {
        return studentDao.selectStudentByNo(no);
    }

    @Override
    public void insertStudent(Student student) {
        if (student == null) {
            throw new RuntimeException("信息为空");
        }
        studentDao.insertStudent(student);
    }
}
