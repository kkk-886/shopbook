package com.example.jishixingle.model;


public class Users {

    int id ;
    String uname;
    String upass;
    String email;
    String sex;
    String iphone;
    String shdz;
    String mbwt;
    String daan;
    String byyx;

    public Users(){

    }

    public Users(int id, String uname, String upass, String email, String sex, String iphone, String shdz, String mbwt, String daan, String byyx) {
        this.id = id;
        this.uname = uname;
        this.upass = upass;
        this.email = email;
        this.sex = sex;
        this.iphone = iphone;
        this.shdz = shdz;
        this.mbwt = mbwt;
        this.daan = daan;
        this.byyx = byyx;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone;
    }

    public String getShdz() {
        return shdz;
    }

    public void setShdz(String shdz) {
        this.shdz = shdz;
    }

    public String getMbwt() {
        return mbwt;
    }

    public void setMbwt(String mbwt) {
        this.mbwt = mbwt;
    }

    public String getDaan() {
        return daan;
    }

    public void setDaan(String daan) {
        this.daan = daan;
    }

    public String getByyx() {
        return byyx;
    }

    public void setByyx(String byyx) {
        this.byyx = byyx;
    }
}
