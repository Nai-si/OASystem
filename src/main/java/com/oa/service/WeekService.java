package com.oa.service;

import com.oa.entity.Week;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 18:55
 * @Description:
 */
public interface WeekService {

    /**
     * 添加周报
     * @param week
     */
    void addWeek(Week week);

    /**
     * 周报列表分页展示
     * @return
     */
    List<Week> select(Integer page ,Integer limit);

    /**
     * 修改周报
     * @param week
     */
    void update(Week week);

    /**
     * 查询周报内容
     * @param id
     * @return
     */
    Week selectById(Integer id);

    /**
     * 删除周报
     * @param id
     */
    void deleteById(Integer id);

}
