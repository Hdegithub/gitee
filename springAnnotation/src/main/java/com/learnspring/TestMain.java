package com.learnspring;

import com.learnspring.config.MySpringConfig;
import com.learnspring.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MySpringConfig.class);
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.show();
    }
}
