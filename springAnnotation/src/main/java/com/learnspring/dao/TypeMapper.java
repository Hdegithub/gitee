package com.learnspring.dao;

import com.learnspring.domain.Type;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TypeMapper {

    int save(Type type);

    List<Type> selectAll();

    int delete(Integer id);

    //更新   参数(TYpe)
    int update(Type type);
}
