package com.rocky.mapper;

import com.rocky.model.busibean.CmCustomer;

import java.util.List;
import java.util.Map;

public interface CmCustomerDao {

    /**
     * 根据id获得对象
     */
    CmCustomer getById(Integer id);

    /**
     * 保存对象
     */
    Integer insert(CmCustomer entity);

    /**
     * 更新对象
     */
    Integer update(CmCustomer entity);

    /**
     * 根据主键id删除对象
     */
    Integer deleteById(Integer id);

    /**
     * 查询数据列表
     */
    List<CmCustomer> queryList(Map map);

    /**
     *
     * @param map
     * @param startPage
     * @param pageSize
     * @return
     */
    List<CmCustomer> queryListByPage(Map map,int startPage,int pageSize);

}