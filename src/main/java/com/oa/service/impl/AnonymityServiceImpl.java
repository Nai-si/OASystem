package com.oa.service.impl;

import com.github.pagehelper.PageHelper;
import com.oa.dao.AnonymityDao;
import com.oa.entity.Anonymity;
import com.oa.service.AnonymityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/30 14:18
 * @Description:
 */
@Service
public class AnonymityServiceImpl implements AnonymityService {

    @Autowired
    private AnonymityDao anonymityDao;


    @Override
    public List<Anonymity> selectAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return anonymityDao.selectAll();
    }
}
