package com.oa.service.impl;

import com.oa.dao.SkillDao;
import com.oa.entity.Skill;
import com.oa.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
