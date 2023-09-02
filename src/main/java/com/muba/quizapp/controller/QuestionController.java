package com.muba.quizapp.controller;


import com.muba.quizapp.Question;
import com.muba.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public  List<Question> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public String postAddQuestion(@RequestBody Question question) {
        return questionService.postAddQuestion(question);
    }

    @DeleteMapping("{id}")
    public String deleteQuestion(@PathVariable Integer id){
        return questionService.deleteQuestion(id);
    }

    @PutMapping("update/{id}")
    public String updateQuestion(@RequestBody Question question, @PathVariable Integer id){
        return questionService.putUpdateQuestion(question, id);
    }
}
