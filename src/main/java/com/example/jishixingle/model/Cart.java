package com.example.jishixingle.model;

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
    int cart_order_number;
    String cart_date;
    int cart_static_id;
    String cart_static;

    public Cart() {
    }

    public Cart(int cart_id, String cart_name, double cart_scj, double cart_yhj, int num, double cart_num, String shdz, String shr, String iphone, int book_id, int id, int cart_order_number, String cart_date, int cart_static_id, String cart_static) {
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
        this.cart_order_number = cart_order_number;
        this.cart_date = cart_date;
        this.cart_static_id = cart_static_id;
        this.cart_static = cart_static;
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

    public int getCart_order_number() {
        return cart_order_number;
    }

    public void setCart_order_number(int cart_order_number) {
        this.cart_order_number = cart_order_number;
    }

    public String getCart_date() {
        return cart_date;
    }

    public void setCart_date(String cart_date) {
        this.cart_date = cart_date;
    }

    public int getCart_static_id() {
        return cart_static_id;
    }

    public void setCart_static_id(int cart_static_id) {
        this.cart_static_id = cart_static_id;
    }

    public String getCart_static() {
        return cart_static;
    }

    public void setCart_static(String cart_static) {
        this.cart_static = cart_static;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
