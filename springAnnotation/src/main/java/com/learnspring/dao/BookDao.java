package com.learnspring.dao;

import com.learnspring.domain.Book;
import org.springframework.stereotype.Repository;


@Repository
public interface BookDao {

    public void save(Book book);

    public void select(Book book);

    public void delete(Book book);

    public void update(Book book);
}
