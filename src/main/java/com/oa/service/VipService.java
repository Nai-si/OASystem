package com.oa.service;

import com.oa.entity.Vip;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/30 9:20
 * @Description:
 */
public interface VipService {

    /**
     * vip申请分页展示
     * @param page
     * @param limit
     * @return
     */
    List<Vip> select(Integer page , Integer limit);

    /**
     * 添加vip申请
     * @param vip
     */
    void add(Vip vip);
}
