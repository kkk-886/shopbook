package com.example.jishixingle.daoimpl;

import com.example.jishixingle.dao.BookDAO;
import com.example.jishixingle.mapper.BookMapper;
import com.example.jishixingle.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookDAOImpl implements BookDAO {


    @Autowired
    BookMapper bookMapper;

    @Override
    public List<Book> selectBookAll() {
        return bookMapper.selectBookAll();
    }

    @Override
    public List<Book> selectBookClassification_id(int classification_id) {
        return bookMapper.selectBookClassification_id(classification_id);
    }

    @Override
    public Book selectBookOne(int book_id) {
        return bookMapper.selectBookOne(book_id);
    }
}
