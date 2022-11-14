package com.example.penguindexapp.RecyclerView;

import android.telephony.SmsManager;

import java.util.ArrayList;

public class QuestionBank {

    private  static QuestionBank instance;
    private ArrayList<Question> questions;

    private QuestionBank(){
        questions = new ArrayList<>();
        questions.add(new Question("1. Would you consider yourself to be a determined person?"));
        questions.add(new Question("2. Would you consider yourself to be a team player?"));
        questions.add(new Question("3. Are you likeable?"));
        questions.add(new Question("4. You like to spend your time alone"));
        questions.add(new Question("5. Would you consider yourself to be a determined person?"));

    }


    public static QuestionBank getInstance(){
        if(instance == null){
            instance = new QuestionBank();
        }
        return instance;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
}
