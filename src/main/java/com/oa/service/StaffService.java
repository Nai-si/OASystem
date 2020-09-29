package com.oa.service;

import com.oa.entity.Staff;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 9:05
 * @Description:
 */
public interface StaffService {

    /**
     * 查询所有员工信息并分页展示
     * @param page
     * @param limit
     * @return
     */
    List<Staff> selectStaffAll(Integer page , Integer limit);

    /**
     * 新增员工
     * @param staff
     */
    void insertStaff(Staff staff);

    /**
     * 删除员工
     * @param id
     */
    void del(int id);
}
