package com.oa.service;

import com.oa.entity.Exercises;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 17:21
 * @Description:
 */
public interface ExercisesService {

    List<Exercises> select(Integer page, Integer limit);

    void add(Exercises exercises);

    void deleteById(Integer id);
}
