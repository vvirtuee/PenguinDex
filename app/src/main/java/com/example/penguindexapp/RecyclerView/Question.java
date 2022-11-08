package com.example.penguindexapp.RecyclerView;

public class Question {
    private String name;
    private String definition;

    public Question(String name, String definition) {
        this.name = name;
        this.definition = definition;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}