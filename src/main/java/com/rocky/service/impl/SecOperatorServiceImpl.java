package com.rocky.service.impl;

import com.rocky.model.busibean.SecOperator;
import com.rocky.mapper.SecOperatorDao;
import com.rocky.service.SecOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class SecOperatorServiceImpl implements SecOperatorService {

    @Autowired
    private SecOperatorDao secOperatorDao;

    @Override
    public SecOperator getById(Integer id) {
        return secOperatorDao.getById(id);
    }

    @Override
    public int insert(SecOperator entity) {
        entity.setCreateTime(new Date());
        entity.setModifyTime(new Date());
        return secOperatorDao.insert(entity);
    }

    @Override
    public int update(SecOperator entity) {
        entity.setModifyTime(new Date());

        return secOperatorDao.update(entity);
    }

    @Override
    public int deleteById(Integer id) {
        return secOperatorDao.deleteById(id);
    }

    @Override
    public List<SecOperator> queryList(Map map) {
        return secOperatorDao.queryList(map);
    }

    @Override
    public SecOperator queryByNameAndPassword(String name, String password) {
        return secOperatorDao.queryByNameAndPassword(name,password);
    }
}
