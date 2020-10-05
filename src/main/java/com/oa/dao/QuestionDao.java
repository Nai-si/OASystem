package com.oa.dao;

import com.oa.entity.Question;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 17:51
 * @Description:
 */
public interface QuestionDao {

    void addQuestion(Question question);

    List<Question> findAll();

    void updateById(Question question);

}
