package com.muba.quizapp.service;


import com.muba.quizapp.Question;
import com.muba.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String postAddQuestion(Question question) {
        questionDao.save(question);
        return "success";
    }

    public String deleteQuestion(Integer id) {
        questionDao.deleteById(id);
        return "deleted";
    }

    public String putUpdateQuestion(Question question, Integer id) {
      return "";
    }
}
