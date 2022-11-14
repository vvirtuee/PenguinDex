package com.example.penguindexapp.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.penguindexapp.R;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class QuestionsRecyclerViewAdapter extends RecyclerView.Adapter<QuestionsRecyclerViewAdapter.CustomViewHolder> {
    ArrayList<Question> terms;

    RadioGroup radioGroup;

    public QuestionsRecyclerViewAdapter(ArrayList<Question> terms) {
        this.terms = terms;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.recycle_row, null);
        radioGroup = view.findViewById(R.id.radioGroupName);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Question term = terms.get(position);
        holder.question.setText(term.getQuestion());
        holder.rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                System.out.println("I clicked on: ");
                switch (checkedId){
                    case R.id.a1:
                        QuestionBank.getInstance().getQuestions().get(position).setA1(true);
                        QuestionBank.getInstance().getQuestions().get(position).setA2(false);
                        QuestionBank.getInstance().getQuestions().get(position).setA3(false);
                        break;
                    case R.id.b1:
                        QuestionBank.getInstance().getQuestions().get(position).setA2(true);
                        QuestionBank.getInstance().getQuestions().get(position).setA1(false);
                        QuestionBank.getInstance().getQuestions().get(position).setA3(false);
                        break;
                    case R.id.c1:
                        QuestionBank.getInstance().getQuestions().get(position).setA3(true);
                        QuestionBank.getInstance().getQuestions().get(position).setA1(false);
                        QuestionBank.getInstance().getQuestions().get(position).setA2(false);
                        break;
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return terms.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        protected TextView question;
        RadioGroup rg;

        public CustomViewHolder(View view){
            super(view);
            this.question = view.findViewById(R.id.question);
            rg = view.findViewById(R.id.radioGroupName);
        }
    }
}
