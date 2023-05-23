package com.example.jishixingle.dao;

import com.example.jishixingle.model.Book;

import java.util.List;

public interface BookDAO {

    //查询全部信息
    public List<Book> selectBookAll();

    //查询分类信息
    public List<Book> selectBookClassification_id(int classification_id);

    //查询单本书的信息
    public Book selectBookOne(int book_id);

}
