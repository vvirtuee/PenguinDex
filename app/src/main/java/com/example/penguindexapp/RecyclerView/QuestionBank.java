package com.example.penguindexapp.RecyclerView;

import android.telephony.SmsManager;

import java.util.ArrayList;

public class QuestionBank {

    private  static QuestionBank instance;
    private ArrayList<Question> questions;

    private QuestionBank(){
        questions = new ArrayList<>();
        questions.add(new Question("1. Would you consider yourself to be a determined person?"));
        //lazy --- hardworking
        questions.add(new Question("2. Would you consider yourself to be a team player?"));
        //lazy --- hardworking
        questions.add(new Question("3. Are you likeable?"));
        //follower --- leader
        questions.add(new Question("4. You like to be alone more than with people."));
        //follower --- leader
        questions.add(new Question("5. You are very quick to come up with solutions to problems."));
        //follower --- leader
        questions.add(new Question("6. You respond to criticism well."));
        //lazy --- hardworking
        questions.add(new Question("7. You don't hesitate to speak your mind if necessary."));
        //follower --- leader
        questions.add(new Question("8. You would much rather spend your free time relaxing."));
        //lazy -1 --- hardworking 1
        questions.add(new Question("9. You believe putting yourself in front of responsibility."));
        //lazy -1 --- hardowrking 1
        questions.add(new Question("10. You prefer to be given instructions rather than give them yourself."));
        //follower --- leader

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
