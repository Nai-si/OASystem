package com.oa.dao;

import com.oa.entity.Week;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 16:37
 * @Description:
 */
public interface WeekDao {

    /**
     * 添加周报
     * @param week
     */
    void addWeek(Week week);

    /**
     * 周报列表展示
     * @return
     */
    List<Week> select();

    /**
     * 修改周报内容
     * @param week
     */
    void update(Week week);

}
