package com.learnspring.service.impl;


import com.learnspring.dao.BookDao;
import com.learnspring.domain.Book;
import com.learnspring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

//@Component("bookService")
@Service("bookService")
@Scope("singleton")
public class BookServiceImpl implements BookService {
    //声明依赖
    @Autowired
//    明确的指定 要依赖哪个bean
//    @Qualifier("bookMapper")
    private BookDao bookDao;

    @Autowired
    private DataSource dataSource;


//    public void setBookMapper(BookMapper bookMapper) {
//        this.bookMapper = bookMapper;
//    }

    @Override
    public void show() {
//        try(Connection connection = dataSource.getConnection();){
//            System.out.println(connection.getMetaData().getDatabaseProductName());
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
        System.out.println(" BookServiceImpl show");
//        bookMapper.test();
        Book book=new Book();
        book.setTypeId(2);
        book.setTypeName("玩具");
        bookDao.save(book);

    }
    //在构造器执行之后 执行此方法
//    @PostConstruct
//    public void doInit2(){
//        System.out.println("doInit333333");
//    }
//    //在对象被销毁之前 此方法被调用
//    @PreDestroy
//    public void myDestroy(){
//        System.out.println("myDestory");
//    }
}
