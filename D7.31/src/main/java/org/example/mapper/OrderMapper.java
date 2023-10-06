package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.pojo.Order;

public interface OrderMapper {
    int addOrder(Order order);

    int updateOrder(Order order);
}
