package com.oa.service;

import com.oa.entity.Question;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 17:52
 * @Description:
 */
public interface QuestionService {

    void addQuestion(Question question);

    List<Question> findAll(Integer page,Integer limit);

    void updateById(Question question);

    void deleteById(Integer id);

}
