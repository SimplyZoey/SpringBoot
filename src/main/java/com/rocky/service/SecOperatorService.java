package com.rocky.service;

import com.rocky.model.busibean.SecOperator;

import java.util.List;
import java.util.Map;

public interface SecOperatorService {
    /**
     * @param id
     * @return
     * @Description: 根据ID获取记录
     */
    SecOperator getById(Integer id);

    /**
     * @param entity
     * @return
     * @Description: 保存记录并返回主键
     */
    int insert(SecOperator entity);

    /**
     * @param entity
     * @return
     * @Description: 更新记录（主键不为空）
     */
    int update(SecOperator entity);

    /**
     * @param id
     * @return
     * @Description: 根据ID删除记录（物理）
     */
    int deleteById(Integer id);

    /**
     * 查询数据列表
     */
    List<SecOperator> queryList(Map map);

    /**
     * 登录
     * @param name
     * @param password
     * @return
     */
    SecOperator queryByNameAndPassword(String name,String password);

}