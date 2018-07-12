package com.rocky.service.impl;

import com.github.pagehelper.PageHelper;
import com.rocky.mapper.CmCustomerDao;
import com.rocky.model.busibean.CmCustomer;
import com.rocky.service.CmCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class CmCustomerServiceImpl implements CmCustomerService {

    @Autowired
    private CmCustomerDao cmCustomerDao;

    @Override
    public CmCustomer getById(Integer id) {
        return cmCustomerDao.getById(id);
    }

    @Override
    public int insert(CmCustomer entity) {
        entity.setCreateTime(new Date());
        entity.setModifyTime(new Date());
        return cmCustomerDao.insert(entity);
    }

    @Override
    public int update(CmCustomer entity) {
        entity.setModifyTime(new Date());
        return cmCustomerDao.update(entity);
    }

    @Override
    public int deleteById(Integer id) {
        return cmCustomerDao.deleteById(id);
    }

    @Override
    public List<CmCustomer> queryList(Map map) {
        return cmCustomerDao.queryList(map);
    }

    @Override
    public List<CmCustomer> queryListByPage(Map map, int startPage, int pageSize) {
        PageHelper.startPage(startPage,pageSize);
        return queryList(map);
    }

}
