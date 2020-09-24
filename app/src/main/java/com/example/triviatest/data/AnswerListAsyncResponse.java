package com.example.triviatest.data;

import com.example.triviatest.model.Question;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {
    void processFinish(ArrayList<Question> questionArrayList);
}
