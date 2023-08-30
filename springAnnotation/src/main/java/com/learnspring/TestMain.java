package com.learnspring;

import com.learnspring.config.MySpringConfig;
import com.learnspring.domain.Type;
import com.learnspring.service.TypeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MySpringConfig.class);
        TypeService bookService = (TypeService) ctx.getBean("bookService");
        //bookService.show();
        //要做的： 循环访问集合中的每一个对象，打印每一个对象的typeName
        //List<Book> all = bookService.getAll();
//        for (int i = 0; i < all.size(); i++) {
////            Book book = all.get(i);
////            System.out.println(book.getTypeId()+book.getTypeName());
////        }
//        for (Book book : all
//        ) {
//            System.out.println(book);
//        }
        //bookService.delete(3);
//        Type type =new Type();
//        type.setTypeId(1);
//        type.setTypeName("豆制品");
//        bookService.update(type);
    }
}
