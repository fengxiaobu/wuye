package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: ElectricChargeInvoiceDeta
@Description: 描述：水费缴费开票情况
@author: an-wei.xie@rzhd.cn
@date: 2017年5月23日 下午2:15:11
@version: V1.0
 */
public class ElectricFeeInvoiceDeta implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * 主键
     */
    private Long electricChargeInvoiceDeta;
    
    /**
     * 开票类型(0-业主，1-代付)
     */
    private Integer invoiceType;
    
    /**
     * 开票公司
     */
    private String invoiceCompany;
    
    /**
     * 基本电费
     */
    private BigDecimal basicElectricFee;
    
    /**
     * 电费开票额度
     */
    private BigDecimal electricFeeInvoiceSum;
    
    /**
     * 基本物业费
     */
    private BigDecimal basicPropertyFee;
    
    /**
     * 物业费开票额度
     */
    private BigDecimal propertyFeeInvoiceSum;
    
    /**
     * 三方协议
     */
    private String tripleAgreement;
    
    /**
     * 代付证明
     */
    private String agencyPayCredential;
    
    /**
     * 创建时间 
     */
    private Date carteTime;
    
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 电费缴费记录ID
     */
    private Long electricFeePayDetailsId;

    public Long getElectricChargeInvoiceDeta() {
        return electricChargeInvoiceDeta;
    }

    public void setElectricChargeInvoiceDeta(Long electricChargeInvoiceDeta) {
        this.electricChargeInvoiceDeta = electricChargeInvoiceDeta;
    }

    public Integer getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Integer invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceCompany() {
        return invoiceCompany;
    }

    public void setInvoiceCompany(String invoiceCompany) {
        this.invoiceCompany = invoiceCompany;
    }

    public BigDecimal getBasicElectricFee() {
        return basicElectricFee;
    }

    public void setBasicElectricFee(BigDecimal basicElectricFee) {
        this.basicElectricFee = basicElectricFee;
    }

    public BigDecimal getElectricFeeInvoiceSum() {
        return electricFeeInvoiceSum;
    }

    public void setElectricFeeInvoiceSum(BigDecimal electricFeeInvoiceSum) {
        this.electricFeeInvoiceSum = electricFeeInvoiceSum;
    }

    public BigDecimal getBasicPropertyFee() {
        return basicPropertyFee;
    }

    public void setBasicPropertyFee(BigDecimal basicPropertyFee) {
        this.basicPropertyFee = basicPropertyFee;
    }

    public BigDecimal getPropertyFeeInvoiceSum() {
        return propertyFeeInvoiceSum;
    }

    public void setPropertyFeeInvoiceSum(BigDecimal propertyFeeInvoiceSum) {
        this.propertyFeeInvoiceSum = propertyFeeInvoiceSum;
    }

    public String getTripleAgreement() {
        return tripleAgreement;
    }

    public void setTripleAgreement(String tripleAgreement) {
        this.tripleAgreement = tripleAgreement;
    }

    public String getAgencyPayCredential() {
        return agencyPayCredential;
    }

    public void setAgencyPayCredential(String agencyPayCredential) {
        this.agencyPayCredential = agencyPayCredential;
    }

    public Date getCarteTime() {
        return carteTime;
    }

    public void setCarteTime(Date carteTime) {
        this.carteTime = carteTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getElectricFeePayDetailsId() {
        return electricFeePayDetailsId;
    }

    public void setElectricFeePayDetailsId(Long electricFeePayDetailsId) {
        this.electricFeePayDetailsId = electricFeePayDetailsId;
    }
}
