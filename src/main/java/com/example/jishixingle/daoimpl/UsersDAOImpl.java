package com.example.jishixingle.daoimpl;

import com.example.jishixingle.dao.UsersDAO;
import com.example.jishixingle.mapper.UsersMapper;
import com.example.jishixingle.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersDAOImpl implements UsersDAO {

    //注入mapper类
    @Autowired
    private UsersMapper usersMapper;

    //用户登录
    @Override
    public Users userslogin(Users users) {
        return usersMapper.login(users);
    }

    @Override
    public boolean InsertUser(Users users) {
        return usersMapper.InsertUser(users);
    }

    @Override
    public boolean UpdateUser(Users users) {
        return usersMapper.UpdateUser(users);
    }

}
