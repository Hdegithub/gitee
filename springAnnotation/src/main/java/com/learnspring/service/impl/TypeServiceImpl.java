package com.learnspring.service.impl;


import com.learnspring.dao.TypeMapper;
import com.learnspring.domain.Type;
import com.learnspring.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

//@Component("bookService")
@Service("bookService")
@Scope("singleton")
public class TypeServiceImpl implements TypeService {
    //声明依赖
    @Autowired
//    明确的指定 要依赖哪个bean
//    @Qualifier("bookMapper")
    private TypeMapper bookDao;

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
        Type type = new Type();
        type.setTypeId(3);
        type.setTypeName("玩具");
        bookDao.save(type);

    }

    @Override
    public List<Type> getAll() {
        return bookDao.selectAll();
    }

    @Override
    public int delete(Integer id) {
        int delete = bookDao.delete(id);
        return delete;
    }

    @Override
    public int update(Type type) {
        int update = bookDao.update(type);
        return update;
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
