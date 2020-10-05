package com.oa.dao;

import com.oa.entity.Anonymity;
import org.apache.ibatis.annotations.Param;

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

    /**
     * 添加匿名投诉
     * @param content
     * @param u_no
     */
    void add(@Param("content") String content , @Param("u_no") String u_no);
}
