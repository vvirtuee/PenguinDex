package com.example.penguindexapp.RecyclerView;

import com.example.penguindexapp.RecyclerView.Question;
import com.example.penguindexapp.RecyclerView.QuestionBank;

public class sds {

    public static void main(String[] args) {
        /**
        if (QuestionBank.getInstance().getQuestions().get(0).isA1() == true &&
                QuestionBank.getInstance().getQuestions().get(1).isA3() == true) {

        }
         **/
        for(Question question : QuestionBank.getInstance().getQuestions()){
            System.out.println("question: " + question.getQuestion());
        }
    }
}
