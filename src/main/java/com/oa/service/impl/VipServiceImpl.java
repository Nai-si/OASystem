package com.oa.service.impl;

import com.github.pagehelper.PageHelper;
import com.oa.dao.VipDao;
import com.oa.entity.Vip;
import com.oa.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/30 9:22
 * @Description:
 */
@Service
public class VipServiceImpl implements VipService {

    @Autowired
    private VipDao vipDao;

    @Override
    public List<Vip> select(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return vipDao.select();
    }

    @Override
    public void add(Vip vip) {
        vipDao.add(vip);
    }
}
