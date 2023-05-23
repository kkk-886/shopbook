package com.example.jishixingle.dao;

import com.example.jishixingle.model.Classification;

import java.util.List;

public interface ClassificationDAO {

    //查询书本分类
    public List<Classification> selectClassificationAll();

}
