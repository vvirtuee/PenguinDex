package com.example.penguindexapp.ListView;

public class DataType {
    private String name;
    private String description;
    private int image;

    public DataType(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //The toString() is what will show in the list
    public String toString(){
        return getName();
    }

    public void setImage(int image){this.image = image;}
    public int getImage(){return image;}
}
