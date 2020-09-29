package com.oa.service.impl;

import com.github.pagehelper.PageHelper;
import com.oa.dao.StaffDao;
import com.oa.entity.Staff;
import com.oa.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 9:06
 * @Description:
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDao staffDao;

    /**
     * 员工列表分页展示
     * @param page
     * @param limit
     * @return
     */
    @Override
    public List<Staff> selectStaffAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return staffDao.selectStaffAll();
    }
}
