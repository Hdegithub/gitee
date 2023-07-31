package org.example.mapper;

import org.example.pojo.Good;

import java.util.List;

public interface GoodMapper {
    //查询所有
    List<Good> selectAllGoods();

    Good selectByid(Integer id);

    int insertGood(Good good);

    List<Good> selectByCondition(Integer id);

    List<Good> selectByConditionDynamic(Good good);

    List<Good> selectByOneCondition(Good good);

}
