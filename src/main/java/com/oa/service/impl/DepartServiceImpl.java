package com.oa.service.impl;

import com.oa.dao.DepartDao;
import com.oa.entity.Depart;
import com.oa.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/9/29 9:57
 * @Description:
 */
@Service
public class DepartServiceImpl implements DepartService {
    @Autowired
    private DepartDao departDao;

    @Override
    public List<Depart> selectAll() {
        return departDao.selectAll();
    }
}
