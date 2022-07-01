package com.example.recyclerviewtest;

public class Model {
    int image;
    String MainText,SecondText;

    public Model(int image, String mainText, String secondText) {
        this.image = image;
        MainText = mainText;
        SecondText = secondText;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMainText() {
        return MainText;
    }

    public void setMainText(String mainText) {
        MainText = mainText;
    }

    public String getSecondText() {
        return SecondText;
    }

    public void setSecondText(String secondText) {
        SecondText = secondText;
    }
}
