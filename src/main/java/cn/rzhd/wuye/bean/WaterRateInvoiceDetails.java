package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: WaterRateInvoiceDetails
@Description: 描述：水费开票详情
@author: zhongchaojie@rzhd.cn
@date: 2017年5月23日 下午2:05:39
@version: V1.0
 */
public class WaterRateInvoiceDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 水费缴费开票详情id
	 */
	private Long waterRateInvoiceDetailsId;
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
	private BigDecimal basicElectricCharge;
	/**
	 * 电费开票额度
	 */
	private BigDecimal electricChargeInvoiceSum;
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
	 * @return the invoiceType
	 */
	public Integer getInvoiceType() {
		return invoiceType;
	}
	/*
	@param invoiceType the invoiceType to set
	*/
	public void setInvoiceType(Integer invoiceType) {
		this.invoiceType = invoiceType;
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
	 * @return the basicElectricCharge
	 */
	public BigDecimal getBasicElectricCharge() {
		return basicElectricCharge;
	}
	/*
	@param basicElectricCharge the basicElectricCharge to set
	*/
	public void setBasicElectricCharge(BigDecimal basicElectricCharge) {
		this.basicElectricCharge = basicElectricCharge;
	}
	/**
	 * @return the electricChargeInvoiceSum
	 */
	public BigDecimal getElectricChargeInvoiceSum() {
		return electricChargeInvoiceSum;
	}
	/*
	@param electricChargeInvoiceSum the electricChargeInvoiceSum to set
	*/
	public void setElectricChargeInvoiceSum(BigDecimal electricChargeInvoiceSum) {
		this.electricChargeInvoiceSum = electricChargeInvoiceSum;
	}
	/**
	 * @return the basicPropertyFee
	 */
	public BigDecimal getBasicPropertyFee() {
		return basicPropertyFee;
	}
	/*
	@param basicPropertyFee the basicPropertyFee to set
	*/
	public void setBasicPropertyFee(BigDecimal basicPropertyFee) {
		this.basicPropertyFee = basicPropertyFee;
	}
	/**
	 * @return the propertyFeeInvoiceSum
	 */
	public BigDecimal getPropertyFeeInvoiceSum() {
		return propertyFeeInvoiceSum;
	}
	/*
	@param propertyFeeInvoiceSum the propertyFeeInvoiceSum to set
	*/
	public void setPropertyFeeInvoiceSum(BigDecimal propertyFeeInvoiceSum) {
		this.propertyFeeInvoiceSum = propertyFeeInvoiceSum;
	}
	/**
	 * @return the tripleAgreement
	 */
	public String getTripleAgreement() {
		return tripleAgreement;
	}
	/*
	@param tripleAgreement the tripleAgreement to set
	*/
	public void setTripleAgreement(String tripleAgreement) {
		this.tripleAgreement = tripleAgreement;
	}
	/**
	 * @return the agencyPayCredential
	 */
	public String getAgencyPayCredential() {
		return agencyPayCredential;
	}
	/*
	@param agencyPayCredential the agencyPayCredential to set
	*/
	public void setAgencyPayCredential(String agencyPayCredential) {
		this.agencyPayCredential = agencyPayCredential;
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
	 * @return the waterRateInvoiceDetailsId
	 */
	public Long getWaterRateInvoiceDetailsId() {
		return waterRateInvoiceDetailsId;
	}
	/*
	@param waterRateInvoiceDetailsId the waterRateInvoiceDetailsId to set
	*/
	public void setWaterRateInvoiceDetailsId(Long waterRateInvoiceDetailsId) {
		this.waterRateInvoiceDetailsId = waterRateInvoiceDetailsId;
	}
	
}
