package com.rocky.model.busibean;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName: SecOperator
 * @Description: 映射sec_operator表
 * @author: shitian
 */
public class SecOperator implements Serializable {


    /**
     * 操作员主键
     */
    private Integer operatorId;


    /**
     * 名称
     */
    private String operatorName;


    /**
     * 密码
     */
    private String operatorPassword;


    /**
     * 操作员类型
     */
    private Integer operatorType;


    /**
     * 创建时间
     */
    private Date createTime;


    /**
     * 修改时间
     */
    private Date modifyTime;


    /**
     * 创建操作员
     */
    private Integer createOperator;


    /**
     * 修改操作员
     */
    private Integer modifyOperator;


    /**
     * 备注
     */
    private String remarks;


    /**
     * 是否生效
     */
    private Integer state;

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getOperatorPassword() {
        return operatorPassword;
    }

    public void setOperatorPassword(String operatorPassword) {
        this.operatorPassword = operatorPassword;
    }

    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(Integer createOperator) {
        this.createOperator = createOperator;
    }

    public Integer getModifyOperator() {
        return modifyOperator;
    }

    public void setModifyOperator(Integer modifyOperator) {
        this.modifyOperator = modifyOperator;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}