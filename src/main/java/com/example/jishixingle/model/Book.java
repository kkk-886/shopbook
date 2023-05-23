package com.example.jishixingle.model;

public class Book {

    int book_id ;
    String book_name ;
    String book_author ;
    double book_price;
    double book_yj;
    String book_img;
    String book_house;
    String book_introduction;
    int classification_id ;

    public Book() {
    }

    public Book(int book_id, String book_name, String book_author, double book_price, double book_yj, String book_img, String book_house, String book_introduction, int classification_id) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_price = book_price;
        this.book_yj = book_yj;
        this.book_img = book_img;
        this.book_house = book_house;
        this.book_introduction = book_introduction;
        this.classification_id = classification_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }

    public double getBook_yj() {
        return book_yj;
    }

    public void setBook_yj(double book_yj) {
        this.book_yj = book_yj;
    }

    public String getBook_img() {
        return book_img;
    }

    public void setBook_img(String book_img) {
        this.book_img = book_img;
    }

    public String getBook_house() {
        return book_house;
    }

    public void setBook_house(String book_house) {
        this.book_house = book_house;
    }

    public String getBook_introduction() {
        return book_introduction;
    }

    public void setBook_introduction(String book_introduction) {
        this.book_introduction = book_introduction;
    }

    public int getClassification_id() {
        return classification_id;
    }

    public void setClassification_id(int classification_id) {
        this.classification_id = classification_id;
    }
}
