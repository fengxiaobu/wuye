package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hasee on 2017/6/1.
 */
public class KfFeePayDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 开发缴费详情id
     */
    private Long kfFeePayDetailsId;
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
    private Integer payMonth;
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
     * 交费日期
     */
    private Date payTime;
    /**
     * 创建时间
     */
    private Date carteTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 客户主键
     */
    private String customerId;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getKfFeePayDetailsId() {
        return kfFeePayDetailsId;
    }

    public void setKfFeePayDetailsId(Long kfFeePayDetailsId) {
        this.kfFeePayDetailsId = kfFeePayDetailsId;
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

    public Integer getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(Integer payMonth) {
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "KfFeePayDetails{" +
                "kfFeePayDetailsId=" + kfFeePayDetailsId +
                ", houseInfoId=" + houseInfoId +
                ", clientName='" + clientName + '\'' +
                ", costType='" + costType + '\'' +
                ", payManner='" + payManner + '\'' +
                ", payMonth=" + payMonth +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", payable=" + payable +
                ", paidIn=" + paidIn +
                ", voucherNumber='" + voucherNumber + '\'' +
                ", invoice='" + invoice + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", invoiceNotes='" + invoiceNotes + '\'' +
                ", invoiceStatus=" + invoiceStatus +
                ", collectingCompany='" + collectingCompany + '\'' +
                ", collectingAccount='" + collectingAccount + '\'' +
                ", invoiceCompany='" + invoiceCompany + '\'' +
                ", payTime=" + payTime +
                ", carteTime=" + carteTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
