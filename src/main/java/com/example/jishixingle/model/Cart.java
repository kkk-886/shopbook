package com.example.jishixingle.model;

import java.util.Date;

public class Cart {

    int cart_id;
    String cart_name;
    double cart_scj;
    double cart_yhj;
    int num;
    double cart_num;
    String shdz;
    String shr;
    String iphone;
    int book_id;
    int id;

    public Cart() {
    }

    public Cart(int cart_id, String cart_name, double cart_scj, double cart_yhj, int num, double cart_num, String shdz, String shr, String iphone, int book_id, int id) {
        this.cart_id = cart_id;
        this.cart_name = cart_name;
        this.cart_scj = cart_scj;
        this.cart_yhj = cart_yhj;
        this.num = num;
        this.cart_num = cart_num;
        this.shdz = shdz;
        this.shr = shr;
        this.iphone = iphone;
        this.book_id = book_id;
        this.id = id;
    }

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public String getCart_name() {
        return cart_name;
    }

    public void setCart_name(String cart_name) {
        this.cart_name = cart_name;
    }

    public double getCart_scj() {
        return cart_scj;
    }

    public void setCart_scj(double cart_scj) {
        this.cart_scj = cart_scj;
    }

    public double getCart_yhj() {
        return cart_yhj;
    }

    public void setCart_yhj(double cart_yhj) {
        this.cart_yhj = cart_yhj;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getCart_num() {
        return cart_num;
    }

    public void setCart_num(double cart_num) {
        this.cart_num = cart_num;
    }

    public String getShdz() {
        return shdz;
    }

    public void setShdz(String shdz) {
        this.shdz = shdz;
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
