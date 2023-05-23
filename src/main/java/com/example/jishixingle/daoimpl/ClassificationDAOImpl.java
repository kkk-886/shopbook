package com.example.jishixingle.daoimpl;

import com.example.jishixingle.dao.ClassificationDAO;
import com.example.jishixingle.mapper.ClassificationMapper;
import com.example.jishixingle.model.Classification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassificationDAOImpl implements ClassificationDAO {

    @Autowired
    private ClassificationMapper classificationMapper;

    @Override
    public List<Classification> selectClassificationAll() {
        return classificationMapper.selectClassificationAll();
    }
}
