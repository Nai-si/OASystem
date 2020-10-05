package com.oa.dao;

import com.oa.entity.Exercises;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 17:12
 * @Description:
 */
public interface ExercisesDao {
    List<Exercises> select();

    void add(Exercises exercises);

    void deleteById(Integer id);
}
