package com.rocky.service.impl;

import com.rocky.busibean.SecOperator;
import com.rocky.dao.SecOperatorDao;
import com.rocky.service.SecOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SecOperatorServiceImpl implements SecOperatorService {

	@Autowired
    private SecOperatorDao secOperatorDao;
	
    @Override
    public SecOperator getById(Integer id) {
        return secOperatorMapper.getById(id);
    }

    @Override
    public int insert(SecOperator entity) {
        entity.setCreateTime(new Date());
        entity.setModifyTime(new Date());
        return secOperatorMapper.insert(entity);
    }

    @Override
    public int update(SecOperator entity) {
        entity.setModifyTime(new Date());

        return secOperatorMapper.update(entity);
    }

    @Override
    public int deleteById(Integer id) {
        return secOperatorMapper.deleteById(id);
    }


}
