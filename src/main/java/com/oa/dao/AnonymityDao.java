package com.oa.dao;

import com.oa.entity.Anonymity;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/30 14:08
 * @Description:
 */
public interface AnonymityDao {

    /**
     * 查询匿名投诉
     * @return
     */
    List<Anonymity> selectAll();

}
