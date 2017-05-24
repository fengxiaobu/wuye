package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: PerfectInformation
@Description: 描述：完善信息
@author: zhongchaojie@rzhd.cn
@date: 2017年5月23日 下午4:19:08
@version: V1.0
 */
public class PerfectInformation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 完善信息id
	 */
	private Long perfectInformationId;
	/**
	 * 房产id
	 */
	private Long houseInfoId;
	/**
	 * 企业类型(0-个人，1-企业)
	 */
	private Integer companyType;
	/**
	 * 用户id
	 */
	private Long userId;
	/**
	 * 房产属性id
	 */
	private Long housePropertyId;
	/**
	 * 入驻企业成立时间
	 */
	private Date companyEstablishTime;
	/**
	 * 注册资本金
	 */
	private BigDecimal signInFund;
	/**
	 * 所属行业
	 */
	private Long industryInvolvedId;
	/**
	 * 主营或主导产品
	 */
	private String mainProduct;
	/**
	 * 公司覆盖区域
	 */
	private Long companyCoverageId;
	/**
	 * 职工总人数
	 */
	private Long employeeNumber;
	/**
	 * 物业对接人
	 */
	private String propertyToAccess;
	/**
	 * 物业对接人联系方式
	 */
	private String propertyToAccessContact;
	/**
	 * 物业对接人紧急联系人
	 */
	private String emergencyContactPerson;
	/**
	 * 物业对接人紧急联系人联系方式
	 */
	private String emergencyContactNumber;
	/**
	 * 是否高新(0-是，1-不是)
	 */
	private Integer isHighNew;
	/**
	 * 高新类型(0-国家，1-省级，2-市级)
	 */
	private Integer highNewType;
	/**
	 * 发证时间
	 */
	private Date certificateTime;
	/**
	 * 专利类型
	 */
	private Long patentTypeId;
	/**
	 * 专利个数
	 */
	private Integer patentNumber;
	/**
	 * 是否上市(0-是，1-不是)
	 */
	private Integer isUpBazaar;
	/**
	 * 上市类型
	 */
	private Long upBazaarTypeId;
	/**
	 * 挂牌时间
	 */
	private Date hangBoardTime;
	/**
	 * 股票代码
	 */
	private String stockCode;
	/**
	 * 备注
	 */
	private String notes;
	/**
	 * 状态(0-正常，1-删除)
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date carteTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * @return the perfectInformationId
	 */
	public Long getPerfectInformationId() {
		return perfectInformationId;
	}
	/*
	@param perfectInformationId the perfectInformationId to set
	*/
	public void setPerfectInformationId(Long perfectInformationId) {
		this.perfectInformationId = perfectInformationId;
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
	/**
	 * @return the companyType
	 */
	public Integer getCompanyType() {
		return companyType;
	}
	/*
	@param companyType the companyType to set
	*/
	public void setCompanyType(Integer companyType) {
		this.companyType = companyType;
	}
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/*
	@param userId the userId to set
	*/
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the housePropertyId
	 */
	public Long getHousePropertyId() {
		return housePropertyId;
	}
	/*
	@param housePropertyId the housePropertyId to set
	*/
	public void setHousePropertyId(Long housePropertyId) {
		this.housePropertyId = housePropertyId;
	}
	/**
	 * @return the companyEstablishTime
	 */
	public Date getCompanyEstablishTime() {
		return companyEstablishTime;
	}
	/*
	@param companyEstablishTime the companyEstablishTime to set
	*/
	public void setCompanyEstablishTime(Date companyEstablishTime) {
		this.companyEstablishTime = companyEstablishTime;
	}
	/**
	 * @return the signInFund
	 */
	public BigDecimal getSignInFund() {
		return signInFund;
	}
	/*
	@param signInFund the signInFund to set
	*/
	public void setSignInFund(BigDecimal signInFund) {
		this.signInFund = signInFund;
	}
	/**
	 * @return the industryInvolvedId
	 */
	public Long getIndustryInvolvedId() {
		return industryInvolvedId;
	}
	/*
	@param industryInvolvedId the industryInvolvedId to set
	*/
	public void setIndustryInvolvedId(Long industryInvolvedId) {
		this.industryInvolvedId = industryInvolvedId;
	}
	/**
	 * @return the mainProduct
	 */
	public String getMainProduct() {
		return mainProduct;
	}
	/*
	@param mainProduct the mainProduct to set
	*/
	public void setMainProduct(String mainProduct) {
		this.mainProduct = mainProduct;
	}
	/**
	 * @return the companyCoverageId
	 */
	public Long getCompanyCoverageId() {
		return companyCoverageId;
	}
	/*
	@param companyCoverageId the companyCoverageId to set
	*/
	public void setCompanyCoverageId(Long companyCoverageId) {
		this.companyCoverageId = companyCoverageId;
	}
	/**
	 * @return the employeeNumber
	 */
	public Long getEmployeeNumber() {
		return employeeNumber;
	}
	/*
	@param employeeNumber the employeeNumber to set
	*/
	public void setEmployeeNumber(Long employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	/**
	 * @return the propertyToAccess
	 */
	public String getPropertyToAccess() {
		return propertyToAccess;
	}
	/*
	@param propertyToAccess the propertyToAccess to set
	*/
	public void setPropertyToAccess(String propertyToAccess) {
		this.propertyToAccess = propertyToAccess;
	}
	/**
	 * @return the propertyToAccessContact
	 */
	public String getPropertyToAccessContact() {
		return propertyToAccessContact;
	}
	/*
	@param propertyToAccessContact the propertyToAccessContact to set
	*/
	public void setPropertyToAccessContact(String propertyToAccessContact) {
		this.propertyToAccessContact = propertyToAccessContact;
	}
	/**
	 * @return the emergencyContactPerson
	 */
	public String getEmergencyContactPerson() {
		return emergencyContactPerson;
	}
	/*
	@param emergencyContactPerson the emergencyContactPerson to set
	*/
	public void setEmergencyContactPerson(String emergencyContactPerson) {
		this.emergencyContactPerson = emergencyContactPerson;
	}
	/**
	 * @return the emergencyContactNumber
	 */
	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}
	/*
	@param emergencyContactNumber the emergencyContactNumber to set
	*/
	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}
	/**
	 * @return the isHighNew
	 */
	public Integer getIsHighNew() {
		return isHighNew;
	}
	/*
	@param isHighNew the isHighNew to set
	*/
	public void setIsHighNew(Integer isHighNew) {
		this.isHighNew = isHighNew;
	}
	/**
	 * @return the highNewType
	 */
	public Integer getHighNewType() {
		return highNewType;
	}
	/*
	@param highNewType the highNewType to set
	*/
	public void setHighNewType(Integer highNewType) {
		this.highNewType = highNewType;
	}
	/**
	 * @return the certificateTime
	 */
	public Date getCertificateTime() {
		return certificateTime;
	}
	/*
	@param certificateTime the certificateTime to set
	*/
	public void setCertificateTime(Date certificateTime) {
		this.certificateTime = certificateTime;
	}
	/**
	 * @return the patentTypeId
	 */
	public Long getPatentTypeId() {
		return patentTypeId;
	}
	/*
	@param patentTypeId the patentTypeId to set
	*/
	public void setPatentTypeId(Long patentTypeId) {
		this.patentTypeId = patentTypeId;
	}
	/**
	 * @return the patentNumber
	 */
	public Integer getPatentNumber() {
		return patentNumber;
	}
	/*
	@param patentNumber the patentNumber to set
	*/
	public void setPatentNumber(Integer patentNumber) {
		this.patentNumber = patentNumber;
	}
	/**
	 * @return the isUpBazaar
	 */
	public Integer getIsUpBazaar() {
		return isUpBazaar;
	}
	/*
	@param isUpBazaar the isUpBazaar to set
	*/
	public void setIsUpBazaar(Integer isUpBazaar) {
		this.isUpBazaar = isUpBazaar;
	}
	/**
	 * @return the upBazaarTypeId
	 */
	public Long getUpBazaarTypeId() {
		return upBazaarTypeId;
	}
	/*
	@param upBazaarTypeId the upBazaarTypeId to set
	*/
	public void setUpBazaarTypeId(Long upBazaarTypeId) {
		this.upBazaarTypeId = upBazaarTypeId;
	}
	/**
	 * @return the hangBoardTime
	 */
	public Date getHangBoardTime() {
		return hangBoardTime;
	}
	/*
	@param hangBoardTime the hangBoardTime to set
	*/
	public void setHangBoardTime(Date hangBoardTime) {
		this.hangBoardTime = hangBoardTime;
	}
	/**
	 * @return the stockCode
	 */
	public String getStockCode() {
		return stockCode;
	}
	/*
	@param stockCode the stockCode to set
	*/
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	/**
	 * @return the notes
	 */
	public String getNotes() {
		return notes;
	}
	/*
	@param notes the notes to set
	*/
	public void setNotes(String notes) {
		this.notes = notes;
	}
	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}
	/*
	@param status the status to set
	*/
	public void setStatus(Integer status) {
		this.status = status;
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
	
	
}
