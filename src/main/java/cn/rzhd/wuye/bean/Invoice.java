package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hasee on 2017/7/7.
 */
public class Invoice implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 发票主键
     */
    private String invoiceId;
    /**
     * 开票类型(0--业主,1--代付)
     */
    private Integer invoiceType;
    /**
     * 开票公司
     */
    private String invoiceCompany;
    /**
     * 发票金额
     */
    private BigDecimal amount;
    /**
     * 记录创建时间
     */
    private Date carteTime;
    /**
     * 记录更新时间
     */
    private Date updateTime;
    /**
     * 关联缴费记录ID
     */
    private String recordsId;
    /**
     * 费用类型
     */
    private String feeType;
    /**
     * 三方协议
     */
    private String tripleAgreement;
    /**
     * 代付证明
     */
    private String agencyPayCredential;
    /**
     * 发票记录是否生效(Y--生效,N--未生效)
     */
    private String status = "N";

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public String getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(String recordsId) {
        this.recordsId = recordsId;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
