package com.learnspring.service;

import com.learnspring.domain.Type;

import java.util.List;

public interface TypeService {
    public void show();

    public List<Type> getAll();

    int delete(Integer id);

    int update(Type type);
}
