package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UtilitiesInvoice implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * 水电发票主键
     */
    private Long utilitiesInvoiceId;
    /**
     * 开票类型(0--业主,1--代付)
     */
    private Integer invoiceType;
    /**
     * 开票公司
     */
    private String invoiceCompany;

    private BigDecimal basicWaterFee;
    /**
     * 水费发票金额
     */
    private BigDecimal basicWaterInvoiceSum;
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
    private Long utilitiesDetailsId;
    /**
     *
     */
    private BigDecimal basicElectricFee;
    /**
     * 电费开票金额
     */
    private BigDecimal basicElectricInvoiceSum;

    public Long getUtilitiesInvoiceId() {
        return utilitiesInvoiceId;
    }

    public void setUtilitiesInvoiceId(Long utilitiesInvoiceId) {
        this.utilitiesInvoiceId = utilitiesInvoiceId;
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

    public BigDecimal getBasicWaterFee() {
        return basicWaterFee;
    }

    public void setBasicWaterFee(BigDecimal basicWaterFee) {
        this.basicWaterFee = basicWaterFee;
    }

    public BigDecimal getBasicWaterInvoiceSum() {
        return basicWaterInvoiceSum;
    }

    public void setBasicWaterInvoiceSum(BigDecimal basicWaterInvoiceSum) {
        this.basicWaterInvoiceSum = basicWaterInvoiceSum;
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

    public Long getUtilitiesDetailsId() {
        return utilitiesDetailsId;
    }

    public void setUtilitiesDetailsId(Long utilitiesDetailsId) {
        this.utilitiesDetailsId = utilitiesDetailsId;
    }

    public BigDecimal getBasicElectricFee() {
        return basicElectricFee;
    }

    public void setBasicElectricFee(BigDecimal basicElectricFee) {
        this.basicElectricFee = basicElectricFee;
    }

    public BigDecimal getBasicElectricInvoiceSum() {
        return basicElectricInvoiceSum;
    }

    public void setBasicElectricInvoiceSum(BigDecimal basicElectricInvoiceSum) {
        this.basicElectricInvoiceSum = basicElectricInvoiceSum;
    }
}