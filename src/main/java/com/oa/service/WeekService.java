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

}
