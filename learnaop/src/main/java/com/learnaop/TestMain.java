package com.learnaop;

import com.learnaop.config.SpringConfig;
import com.learnaop.dao.BookDao;
import com.learnaop.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookDao bean = ctx.getBean(BookDao.class);
//        bean.save();
        AccountService accountService = ctx.getBean(AccountService.class);
        accountService.transfer("Jerry", "Tom", 100D);
    }
}
