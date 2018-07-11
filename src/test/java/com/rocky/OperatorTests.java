package com.rocky;

import com.alibaba.fastjson.JSON;
import com.rocky.model.busibean.CmCustomer;
import com.rocky.model.busibean.SecOperator;
import com.rocky.service.CmCustomerService;
import com.rocky.service.SecOperatorService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OperatorTests {

    @Autowired
    private SecOperatorService operatorService;

    private Logger logger = LoggerFactory.getLogger(OperatorTests.class);

    @Before
    public void testInsert() {
        Random random = new Random();
        SecOperator operator = new SecOperator();
        operator.setOperatorName("shitian" + random.nextInt(1000));
        operator.setOperatorPassword("123456");
        operator.setState(1);
        operatorService.insert(operator);

        Assert.assertNotNull(operator.getOperatorId());
        logger.debug(JSON.toJSONString(operator));
    }

    @Test
    public void testFindById() {
        SecOperator operator = operatorService.getById(1);
        Assert.assertNotNull(operator);
        logger.debug(JSON.toJSONString(operator));
    }

    @Test
    public void TestQueryByNameAndPassword() {
        SecOperator operator = operatorService.queryByNameAndPassword("shitian", "123456");
        Assert.assertNotNull(operator);
        logger.debug(JSON.toJSONString(operator));
    }

    @Test
    public void testUpdate() {

    }

    @Test
    public void testDeleteById() {

    }

    @Test
    public void testQueryAll() {

    }


}
