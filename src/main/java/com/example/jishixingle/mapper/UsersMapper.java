package com.example.jishixingle.mapper;

import com.example.jishixingle.model.Users;
import org.apache.ibatis.annotations.*;


//依赖注入Mybatis操作类
@Mapper
public interface UsersMapper {

    //登录
    @Select("select * from users where uname=#{uname} and upass=#{upass}")
    public Users login(Users users);

    //新用户
    @Insert("insert into users(uname,upass,email,sex,iphone,shdz,mbwt,daan,byyx) " +
            "values(#{uname},#{upass},#{email},#{sex},#{iphone},#{shdz},#{mbwt},#{daan},#{byyx})")
    public boolean InsertUser(Users users);

    //修改用户信息
    @Update("update users set upass = #{upass} , sex = #{sex} , iphone = #{iphone} , shdz = #{shdz}" +
            " , mbwt = #{mbwt} , daan = #{daan} , byyx = #{byyx} where id = #{id}")
    boolean UpdateUser(Users users);


}
