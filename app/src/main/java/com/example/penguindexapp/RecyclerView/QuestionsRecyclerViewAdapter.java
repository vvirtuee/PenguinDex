package com.example.penguindexapp.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.penguindexapp.R;

import java.util.ArrayList;

public class QuestionsRecyclerViewAdapter extends RecyclerView.Adapter<QuestionsRecyclerViewAdapter.CustomViewHolder> {
    ArrayList<Question> terms;

    public QuestionsRecyclerViewAdapter(ArrayList<Question> terms) {
        this.terms = terms;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.recycle_row, null);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        Question term = terms.get(position);
        holder.description.setText(term.getDefinition());
        holder.name.setText(term.getName());
    }

    @Override
    public int getItemCount() {
        return terms.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{
        protected TextView name;
        protected TextView description;

        public CustomViewHolder(View view){
            super(view);
            this.name = view.findViewById(R.id.name);
            this.description = view.findViewById(R.id.description);
        }
    }
}
