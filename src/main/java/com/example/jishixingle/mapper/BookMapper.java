package com.example.jishixingle.mapper;

import com.example.jishixingle.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    //查询全部信息
    @Select("select * from book")
    public List<Book> selectBookAll();

    //查询分类信息
    @Select("select * from book where classification_id = #{classification_id}")
    public List<Book> selectBookClassification_id(int classification_id);

    //查询单本书的信息
    @Select("select * from book where book_id = #{book_id}")
    public Book selectBookOne(int book_id);

}
