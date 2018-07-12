package com.rocky;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.rocky.model.busibean.CmCustomer;
import com.rocky.service.CmCustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerTests {

    @Autowired
    private CmCustomerService customerService;

    private Logger logger = LoggerFactory.getLogger(CustomerTests.class);

    @Before
    public void testInsert() {
        Random random = new Random();
        CmCustomer customer = new CmCustomer();
        customer.setCustName("shitian" + random.nextInt(100));
        customer.setState(1);
        customerService.insert(customer);

        Assert.assertNotNull(customer.getCustId());
        logger.debug(JSON.toJSONString(customer));
    }

    @Test
    public void testFindById() {
        CmCustomer customer = customerService.getById(11);
        Assert.assertNotNull(customer);
        logger.debug(JSON.toJSONString(customer));
    }

    @Test
    public void testUpdate() {
        CmCustomer customer = customerService.getById(1);
        customer.setIdenType(1);
        customer.setIdenNumber("978w443w41");
        customerService.update(customer);
    }

    @Test
    @Transactional
    public void testDeleteById() {
        customerService.deleteById(11);
    }

    @Test
    public void testQueryAll() {
        Map<String,Object> key = new HashMap<>();
        key.put("state",1);
        List<CmCustomer> result = customerService.queryList(key);
        logger.debug(JSONArray.toJSONString(result));
    }

    @Test
    public void testQueryListByPage(){
        Map<String,Object> key = new HashMap<>();
        key.put("state",1);
        //起始页为1
        List<CmCustomer> result = customerService.queryListByPage(key,2,2);
        logger.debug(JSONArray.toJSONString(result));
    }


}
