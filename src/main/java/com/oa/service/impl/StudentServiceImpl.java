package com.oa.service.impl;

import com.oa.dao.StudentDao;
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
}
