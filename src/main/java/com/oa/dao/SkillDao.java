package com.oa.dao;

import com.oa.entity.Skill;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 16:49
 * @Description:
 */
public interface SkillDao {

    void add(Skill skill);

    List<Skill> selectAll();
}
