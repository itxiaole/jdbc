package com.sharding.jdbc.jdbc.kuakuguanlianquery;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface TOrder {


    @Insert("INSERT INTO t_order (`price`, `user_id`, `status`) VALUES (1, #{userId}, '1')")
    void insert(@Param("userId")Long userId);

    @Select("select count(1) from t_order a LEFT JOIN t_order_item b on a.order_id=b.order_id")
    int selectOrderAndOrderItem();
}