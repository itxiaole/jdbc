package com.sharding.jdbc.jdbc.kuakuguanlianquery;

import com.sharding.jdbc.jdbc.JdbcApplication;
import com.sharding.jdbc.jdbc.kuakuguanlianquery.TOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {JdbcApplication.class})
public class OrderDaoTest {
    @Autowired
    private TOrder tOrder;

    @Test
    public void settOrder(){
        System.out.println(tOrder.selectOrderAndOrderItem());
    }

    @Test
    public void insert(){
        tOrder.insert(1l);;
    }

}
