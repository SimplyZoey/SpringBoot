package com.rocky.service;

import com.rocky.model.busibean.CmCustomer;

import java.util.List;
import java.util.Map;

public interface CmCustomerService {
    /**
     *
     * @Description: 根据ID获取记录
     * @param id
     * @return
     */
    CmCustomer getById(Integer id);

    /**
     *
     * @Description: 保存记录并返回主键
     * @param entity
     * @return
     */
    int insert(CmCustomer entity);

    /**
     *
     * @Description: 更新记录（主键不为空）
     * @param entity
     * @return
     */
    int update(CmCustomer entity);

    /**
     *
     * @Description: 根据ID删除记录（物理）
     * @param id
     * @return
     */
    int deleteById(Integer id);

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