package com.oa.service.impl;

import com.github.pagehelper.PageHelper;
import com.oa.dao.QuestionDao;
import com.oa.entity.Question;
import com.oa.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: OASystem
 * @Author: Jsx
 * @Time: 2020/10/5 17:52
 * @Description:
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionDao questionDao;

    @Override
    public void addQuestion(Question question) {
        questionDao.addQuestion(question);
    }

    @Override
    public List<Question> findAll(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        return questionDao.findAll();
    }

    @Override
    public void updateById(Question question) {
        questionDao.updateById(question);
    }

    @Override
    public void deleteById(Integer id) {
        questionDao.deleteById(id);
    }
}
