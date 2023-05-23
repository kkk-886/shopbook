package com.example.jishixingle.mapper;

import com.example.jishixingle.model.Classification;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClassificationMapper {

    //查询书本分类
    @Select("select * from classification")
    public List<Classification> selectClassificationAll();


}
