package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 付款记录
 */
public class PayFeeRecords implements Serializable{

    private static final long serialVersionUID = 1L;
    /**
     * 付款记录ID
     */
    private String recordsId;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 房产编码
     */
    private String houseCode;
    /**
     * 客户名称
     */
    private String clientName;
    /**
     * 欠费金额
     */
    private BigDecimal arrears;
    /**
     * 缴费金额
     */
    private BigDecimal paidIn;
    /**
     * 单据号
     */
    private String voucherNumber;
    /**
     * 发票状态
     */
    private BigDecimal invoiceStatus;
    /**
     * 支付方式
     */
    private String payManner;
    /**
     * 收款公司
     */
    private String collectingCompany;
    /**
     * 收款账户
     */
    private String collectingAccount;
    /**
     * 发票
     */
    private String invoice;
    /**
     * 付款时间
     */
    private Date payTime;
    /**
     * 所属类型
     */
    private String feeType;

    public String getRecordsId() {
        return recordsId;
    }

    public void setRecordsId(String recordsId) {
        this.recordsId = recordsId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getHouseCode() {
        return houseCode;
    }

    public void setHouseCode(String houseCode) {
        this.houseCode = houseCode == null ? null : houseCode.trim();
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public BigDecimal getArrears() {
        return arrears;
    }

    public void setArrears(BigDecimal arrears) {
        this.arrears = arrears;
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

    public BigDecimal getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(BigDecimal invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getPayManner() {
        return payManner;
    }

    public void setPayManner(String payManner) {
        this.payManner = payManner == null ? null : payManner.trim();
    }

    public String getCollectingCompany() {
        return collectingCompany;
    }

    public void setCollectingCompany(String collectingCompany) {
        this.collectingCompany = collectingCompany == null ? null : collectingCompany.trim();
    }

    public String getCollectingAccount() {
        return collectingAccount;
    }

    public void setCollectingAccount(String collectingAccount) {
        this.collectingAccount = collectingAccount == null ? null : collectingAccount.trim();
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType == null ? null : feeType.trim();
    }
}