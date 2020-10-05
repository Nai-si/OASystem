package com.oa.service;

import com.oa.entity.Anonymity;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/30 14:18
 * @Description:
 */
public interface AnonymityService {

    /**
     * 查询匿名投诉
     * @return
     */
    List<Anonymity> selectAll(Integer page,Integer limit);

    /**
     * 添加匿名投诉
     * @param content
     * @param u_no
     */
    void add(String content,String u_no);

}
