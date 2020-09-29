package com.oa.dao;

import com.oa.entity.Staff;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 9:03
 * @Description:
 */
public interface StaffDao {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Staff> selectStaffAll();

    /**
     * 新增员工
     * @param staff
     */
    void insertStaff(Staff staff);
}
