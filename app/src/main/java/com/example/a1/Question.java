package com.example.a1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Question {
    private int questionId;
    private boolean trueAnswer;

    public Question(int questionId, boolean trueAnswear){
        this.questionId = questionId;
        this.trueAnswer = trueAnswear;
    }
}
