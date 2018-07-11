package com.rocky.mapper;

import com.rocky.model.busibean.SecOperator;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SecOperatorDao {

    /**
     * 根据id获得对象
     */
    SecOperator getById(Integer id);

    /**
     * 保存对象
     */
    Integer insert(SecOperator entity);

    /**
     * 更新对象
     */
    Integer update(SecOperator entity);

    /**
     * 根据主键id删除对象
     */
    Integer deleteById(Integer id);

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
    SecOperator queryByNameAndPassword(@Param("operatorName") String name, @Param("operatorPassword") String password);

}