package com.oa.dao;

import com.oa.entity.Vip;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/30 9:13
 * @Description:
 */
public interface VipDao {

    /**
     * 查询vip申请
     * @return
     */
    List<Vip> select();
}
