package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: WaterRatePayDetails
@Description: 描述：水费缴费详情
@author: zhongchaojie@rzhd.cn
@date: 2017年5月23日 下午1:43:28
@version: V1.0
 */
public class WaterRatePayDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 水费缴费详情ID
	 */
	private Long waterRatePayDetailsId;
	/**
	 * 房产ID
	 */
	private Long houseInfoId;
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
	 * 应缴金额
	 */
	private BigDecimal payable;
	/**
	 * 已缴金额
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
     * 开票状态
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
     * 开票单位
     */
    private String invoiceCompany;
    /**
     * 缴费日期
     */
    private Date payTime;
    /**
     * 吨数
     */
    private Integer tunnage;
    /**
     * 创建时间
     */
    private Date carteTime;
    /**
     * 修改时间
     */
    private Date updateTime;
	
	/**
	 * @return the clientName
	 */
	public String getClientName() {
		return clientName;
	}
	/*
	@param clientName the clientName to set
	*/
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	/**
	 * @return the costType
	 */
	public String getCostType() {
		return costType;
	}
	/*
	@param costType the costType to set
	*/
	public void setCostType(String costType) {
		this.costType = costType;
	}
	/**
	 * @return the payManner
	 */
	public String getPayManner() {
		return payManner;
	}
	/*
	@param payManner the payManner to set
	*/
	public void setPayManner(String payManner) {
		this.payManner = payManner;
	}
	/**
	 * @return the payMonth
	 */
	public Integer getPayMonth() {
		return payMonth;
	}
	/*
	@param payMonth the payMonth to set
	*/
	public void setPayMonth(Integer payMonth) {
		this.payMonth = payMonth;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/*
	@param startDate the startDate to set
	*/
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/*
	@param endDate the endDate to set
	*/
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the payable
	 */
	public BigDecimal getPayable() {
		return payable;
	}
	/*
	@param payable the payable to set
	*/
	public void setPayable(BigDecimal payable) {
		this.payable = payable;
	}
	/**
	 * @return the paidIn
	 */
	public BigDecimal getPaidIn() {
		return paidIn;
	}
	/*
	@param paidIn the paidIn to set
	*/
	public void setPaidIn(BigDecimal paidIn) {
		this.paidIn = paidIn;
	}
	/**
	 * @return the voucherNumber
	 */
	public String getVoucherNumber() {
		return voucherNumber;
	}
	/*
	@param voucherNumber the voucherNumber to set
	*/
	public void setVoucherNumber(String voucherNumber) {
		this.voucherNumber = voucherNumber;
	}
	/**
	 * @return the invoice
	 */
	public String getInvoice() {
		return invoice;
	}
	/*
	@param invoice the invoice to set
	*/
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	/*
	@param invoiceNumber the invoiceNumber to set
	*/
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	/**
	 * @return the invoiceNotes
	 */
	public String getInvoiceNotes() {
		return invoiceNotes;
	}
	/*
	@param invoiceNotes the invoiceNotes to set
	*/
	public void setInvoiceNotes(String invoiceNotes) {
		this.invoiceNotes = invoiceNotes;
	}
	/**
	 * @return the invoiceStatus
	 */
	public Integer getInvoiceStatus() {
		return invoiceStatus;
	}
	/*
	@param invoiceStatus the invoiceStatus to set
	*/
	public void setInvoiceStatus(Integer invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	/**
	 * @return the collectingCompany
	 */
	public String getCollectingCompany() {
		return collectingCompany;
	}
	/*
	@param collectingCompany the collectingCompany to set
	*/
	public void setCollectingCompany(String collectingCompany) {
		this.collectingCompany = collectingCompany;
	}
	/**
	 * @return the collectingAccount
	 */
	public String getCollectingAccount() {
		return collectingAccount;
	}
	/*
	@param collectingAccount the collectingAccount to set
	*/
	public void setCollectingAccount(String collectingAccount) {
		this.collectingAccount = collectingAccount;
	}
	/**
	 * @return the invoiceCompany
	 */
	public String getInvoiceCompany() {
		return invoiceCompany;
	}
	/*
	@param invoiceCompany the invoiceCompany to set
	*/
	public void setInvoiceCompany(String invoiceCompany) {
		this.invoiceCompany = invoiceCompany;
	}
	/**
	 * @return the payTime
	 */
	public Date getPayTime() {
		return payTime;
	}
	/*
	@param payTime the payTime to set
	*/
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	/**
	 * @return the tunnage
	 */
	public Integer getTunnage() {
		return tunnage;
	}
	/*
	@param tunnage the tunnage to set
	*/
	public void setTunnage(Integer tunnage) {
		this.tunnage = tunnage;
	}
	/**
	 * @return the carteTime
	 */
	public Date getCarteTime() {
		return carteTime;
	}
	/*
	@param carteTime the carteTime to set
	*/
	public void setCarteTime(Date carteTime) {
		this.carteTime = carteTime;
	}
	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/*
	@param updateTime the updateTime to set
	*/
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @return the waterRatePayDetailsId
	 */
	public Long getWaterRatePayDetailsId() {
		return waterRatePayDetailsId;
	}
	/*
	@param waterRatePayDetailsId the waterRatePayDetailsId to set
	*/
	public void setWaterRatePayDetailsId(Long waterRatePayDetailsId) {
		this.waterRatePayDetailsId = waterRatePayDetailsId;
	}
	/**
	 * @return the houseInfoId
	 */
	public Long getHouseInfoId() {
		return houseInfoId;
	}
	/*
	@param houseInfoId the houseInfoId to set
	*/
	public void setHouseInfoId(Long houseInfoId) {
		this.houseInfoId = houseInfoId;
	}
    
    
}
