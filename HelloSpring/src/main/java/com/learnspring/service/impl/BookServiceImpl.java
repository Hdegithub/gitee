package com.learnspring.service.impl;


import com.learnspring.dao.BookDao;
import com.learnspring.service.BookService;

public class BookServiceImpl implements BookService {
    // 成员变量，引用类型  默认是null
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public int save() {
        System.out.println("bookServiceImpl save...");
        return 0;

    }

}
