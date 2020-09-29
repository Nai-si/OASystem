package com.oa.dao;

import com.oa.entity.Depart;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 9:54
 * @Description:
 */
public interface DepartDao {

    /**
     * 查询所有部门
     * @return
     */
    List<Depart> selectAll();

}
