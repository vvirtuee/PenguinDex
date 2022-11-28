package com.example.penguindexapp.ListView;

public class DataType {
    private String creditsDescription;
    private String creditsSource;
    private int image;

    public DataType(String creditsDescription, String creditsSource, int image) {
        this.creditsDescription = creditsDescription;
        this.creditsSource = creditsSource;
        this.image = image;
    }

    public String getCreditsDescription() {
        return creditsDescription;
    }

    public void setCreditsDescription(String creditsDescription) {
        this.creditsDescription = creditsDescription;
    }

    public String getCreditsSource() {
        return creditsSource;
    }

    public void setCreditsSource(String creditsSource) {
        this.creditsSource = creditsSource;
    }
    //The toString() is what will show in the list
    public String toString(){
        return getCreditsDescription();
    }

    public void setImage(int image){this.image = image;}
    public int getImage(){return image;}
}
