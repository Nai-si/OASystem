package com.oa.service.impl;

import com.github.pagehelper.PageHelper;
import com.oa.dao.ExercisesDao;
import com.oa.entity.Exercises;
import com.oa.service.ExercisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 17:22
 * @Description:
 */
@Service
public class ExercisesServiceImpl implements ExercisesService {
    @Autowired
    private ExercisesDao exercisesDao;

    @Override
    public List<Exercises> select(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return exercisesDao.select();

    }

    @Override
    public void add(Exercises exercises) {
        exercisesDao.add(exercises);
    }

    @Override
    public void deleteById(Integer id) {
        if (id == null) {
            throw new RuntimeException("id为空");
        }
        exercisesDao.deleteById(id);
    }
}
