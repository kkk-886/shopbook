package com.example.jishixingle.model;

public class Classification {

    int classification_id ;
    String classification_book ;


    public Classification() {
    }

    public Classification(int classification_id, String classification_book) {
        this.classification_id = classification_id;
        this.classification_book = classification_book;
    }

    public int getClassification_id() {
        return classification_id;
    }

    public void setClassification_id(int classification_id) {
        this.classification_id = classification_id;
    }

    public String getClassification_book() {
        return classification_book;
    }

    public void setClassification_book(String classification_book) {
        this.classification_book = classification_book;
    }
}
