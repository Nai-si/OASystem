package com.oa.service.impl;

import com.github.pagehelper.PageHelper;
import com.oa.dao.WeekDao;
import com.oa.entity.Week;
import com.oa.service.WeekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 18:56
 * @Description:
 */
@Service
public class WeekServiceImpl implements WeekService {

    @Autowired
    private WeekDao weekDao;

    @Override
    public void addWeek(Week week) {
        weekDao.addWeek(week);
    }

    @Override
    public List<Week> select(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return weekDao.select();
    }


}
