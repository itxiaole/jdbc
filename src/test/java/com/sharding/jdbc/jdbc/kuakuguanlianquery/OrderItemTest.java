package com.sharding.jdbc.jdbc.kuakuguanlianquery;

import com.sharding.jdbc.jdbc.JdbcApplication;
import com.sharding.jdbc.jdbc.kuakuguanlianquery.TOrderItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {JdbcApplication.class})
public class OrderItemTest {

    @Autowired
    private TOrderItem orderItem;
@Test
    public void insert(){
    System.out.println(orderItem.insert());
}

}
