package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ElectricFeePayDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * 主键
     */
    private Long electricFeePayDetailsId;
    
    /**
     * 房产id
     */
    private String houseInfoId;
    
    /**
     * 客户名称
     */
    private String clientName;
    
    /**
     * 费用类型
     */
    private String costType;
    
    /**
     * 支付方式
     */
    private String payManner;
    
    /**
     * 缴费月份
     */
    private String payMonth;
    
    /**
     * 开始日期
     */
    private Date startDate;
    
    /**
     * 截止日期
     */
    private Date endDate;
    
    /**
     * 应缴
     */
    private BigDecimal payable;
    
    /**
     * 已缴
     */
    private BigDecimal paidIn;
    
    /**
     * 单据号
     */
    private String voucherNumber;
    
    /**
     * 发票
     */
    private String invoice;
    
    /**
     * 发票号
     */
    private String invoiceNumber;
    
    /**
     * 发票备注
     */
    private String invoiceNotes;
    
    /**
     * 开票状态(0-已开，1-未开,2-不开)
     */
    private Integer invoiceStatus;
    
    /**
     * 收款公司
     */
    private String collectingCompany;
    
    /**
     * 收款账户
     */
    private String collectingAccount;
    
    /**
     * 开票公司
     */
    private String invoiceCompany;
    
    /**
     * 缴费日期
     */
    private Date payTime;
    
    /**
     * 电表编号
     */
    private String ammeterNumber;
    
    /**
     * 倍率
     */
    private Integer multiplyingPower;
    
    /**
     * 电力度数
     */
    private Integer electricPower;
    
    private Date carteTime;
    
    private Date updateTime;

    public Long getElectricFeePayDetailsId() {
        return electricFeePayDetailsId;
    }

    public void setElectricFeePayDetailsId(Long electricFeePayDetailsId) {
        this.electricFeePayDetailsId = electricFeePayDetailsId;
    }

    public String getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(String houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public String getPayManner() {
        return payManner;
    }

    public void setPayManner(String payManner) {
        this.payManner = payManner;
    }

    public String getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(String payMonth) {
        this.payMonth = payMonth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getPayable() {
        return payable;
    }

    public void setPayable(BigDecimal payable) {
        this.payable = payable;
    }

    public BigDecimal getPaidIn() {
        return paidIn;
    }

    public void setPaidIn(BigDecimal paidIn) {
        this.paidIn = paidIn;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceNotes() {
        return invoiceNotes;
    }

    public void setInvoiceNotes(String invoiceNotes) {
        this.invoiceNotes = invoiceNotes;
    }

    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getCollectingCompany() {
        return collectingCompany;
    }

    public void setCollectingCompany(String collectingCompany) {
        this.collectingCompany = collectingCompany;
    }

    public String getCollectingAccount() {
        return collectingAccount;
    }

    public void setCollectingAccount(String collectingAccount) {
        this.collectingAccount = collectingAccount;
    }

    public String getInvoiceCompany() {
        return invoiceCompany;
    }

    public void setInvoiceCompany(String invoiceCompany) {
        this.invoiceCompany = invoiceCompany;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getAmmeterNumber() {
        return ammeterNumber;
    }

    public void setAmmeterNumber(String ammeterNumber) {
        this.ammeterNumber = ammeterNumber;
    }

    public Integer getMultiplyingPower() {
        return multiplyingPower;
    }

    public void setMultiplyingPower(Integer multiplyingPower) {
        this.multiplyingPower = multiplyingPower;
    }

    public Integer getElectricPower() {
        return electricPower;
    }

    public void setElectricPower(Integer electricPower) {
        this.electricPower = electricPower;
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
    
    

}
