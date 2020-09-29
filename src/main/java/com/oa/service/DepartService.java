package com.oa.service;

import com.oa.entity.Depart;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 9:56
 * @Description:
 */
public interface DepartService {

    /**
     * 查询所有部门
     * @return
     */
    List<Depart> selectAll();
}
