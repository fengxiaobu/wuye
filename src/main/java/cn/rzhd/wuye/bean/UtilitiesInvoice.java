package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class UtilitiesInvoice implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long utilitiesInvoiceId;

    private Integer invoiceType;

    private String invoiceCompany;

    private BigDecimal basicWaterFee;

    private BigDecimal basicWaterInvoiceSum;

    private Date carteTime;

    private Date updateTime;

    private Long utilitiesDetailsId;

    private String status;

    private BigDecimal basicElectricFee;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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