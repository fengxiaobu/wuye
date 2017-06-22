package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hasee on 2017/6/21.
 */
public class KfFeeInvoice implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 开票类型(0-业主，1-代付)
     */
    private Integer invoiceType;
    /**
     * 开票公司
     */
    private String invoiceCompany;
    /**
     * 基本开发费
     */
    private BigDecimal basicKfFee;
    /**
     * 开发费开票额度
     */
    private BigDecimal kfFeeInvoiceSum;
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
     * 开发缴费开票详情ID
     */
    private Long kfFeeInvoiceDetailsId;
    /**
     * 开发缴费记录ID
     */
    private Long kfFeePayDetailsId;
    /**
     * 费用类型
     */
    private String feeType;


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

    public BigDecimal getBasicKfFee() {
        return basicKfFee;
    }

    public void setBasicKfFee(BigDecimal basicKfFee) {
        this.basicKfFee = basicKfFee;
    }

    public BigDecimal getKfFeeInvoiceSum() {
        return kfFeeInvoiceSum;
    }

    public void setKfFeeInvoiceSum(BigDecimal kfFeeInvoiceSum) {
        this.kfFeeInvoiceSum = kfFeeInvoiceSum;
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

    public Long getKfFeeInvoiceDetailsId() {
        return kfFeeInvoiceDetailsId;
    }

    public void setKfFeeInvoiceDetailsId(Long kfFeeInvoiceDetailsId) {
        this.kfFeeInvoiceDetailsId = kfFeeInvoiceDetailsId;
    }

    public Long getKfFeePayDetailsId() {
        return kfFeePayDetailsId;
    }

    public void setKfFeePayDetailsId(Long kfFeePayDetailsId) {
        this.kfFeePayDetailsId = kfFeePayDetailsId;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }
}
