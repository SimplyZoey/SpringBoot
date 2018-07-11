package com.rocky.model.busibean;

import java.util.Date;
import java.io.Serializable;

/**
 * @ClassName: CmCustomer
 * @Description: 映射cm_customer表
 * @author: shitian
 */
public class CmCustomer implements Serializable {


    /**
     * 客户主键
     */
    private Integer custId;


    /**
     * 客户名称
     */
    private String custName;


    /**
     * 证件类型
     */
    private Integer idenType;


    /**
     * 证件号码
     */
    private String idenNumber;


    /**
     * 证件有效期
     */
    private Date effectiveTime;


    /**
     * 证件失效期
     */
    private Date expireTime;


    /**
     * 创建时间
     */
    private Date createTime;


    /**
     * 修改时间
     */
    private Date modifyTime;


    /**
     * 创建的操作员
     */
    private Integer createOperator;


    /**
     * 修改的操作员
     */
    private Integer modifyOperator;


    /**
     * 备注
     */
    private String remarks;


    /**
     * 状态
     */
    private Integer state;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Integer getIdenType() {
        return idenType;
    }

    public void setIdenType(Integer idenType) {
        this.idenType = idenType;
    }

    public String getIdenNumber() {
        return idenNumber;
    }

    public void setIdenNumber(String idenNumber) {
        this.idenNumber = idenNumber;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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