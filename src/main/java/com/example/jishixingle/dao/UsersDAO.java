package com.example.jishixingle.dao;

import com.example.jishixingle.model.Users;

public interface UsersDAO {

    //用户登录
    public Users userslogin(Users users);

    //新用户
    public boolean InsertUser(Users users);

    //修改用户信息
    boolean UpdateUser(Users users);

}
