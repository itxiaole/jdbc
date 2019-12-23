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
public interface TOrderItem {

    @Insert("insert t_order_item(`order_info`) value('测试产品信息')")
    int insert();
}