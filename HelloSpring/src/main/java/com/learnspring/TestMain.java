package com.learnspring;

import com.learnspring.service.BookService;
import com.learnspring.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Teacher myTeacher = (Teacher) ctx.getBean("myTeacher");
//        myTeacher.sayHello();
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
