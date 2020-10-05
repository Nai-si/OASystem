package com.oa.service.impl;

import com.github.pagehelper.PageHelper;
import com.oa.dao.SkillDao;
import com.oa.entity.Skill;
import com.oa.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 16:50
 * @Description:
 */
@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillDao skillDao;

    @Override
    public void add(Skill skill) {
        skillDao.add(skill);
    }

    @Override
    public List<Skill> selectAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return skillDao.selectAll();

    }


}
