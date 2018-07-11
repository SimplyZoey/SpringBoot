package com.rocky.service;

import com.rocky.model.busibean.SecOperator;

public interface SecOperatorService {
    /**
     * 
     * @Description: 根据ID获取记录
     * @param id
     * @return
     */
    SecOperator getById(Integer id);

    /**
     * 
     * @Description: 保存记录并返回主键
     * @param entity
     * @return
     */
    int insert(SecOperator entity);

    /**
     * 
     * @Description: 更新记录（主键不为空）
     * @param entity
     * @return
     */
    int update(SecOperator entity);

    /**
     * 
     * @Description: 根据ID删除记录（物理）
     * @param id
     * @return
     */
    int deleteById(Integer id);

}