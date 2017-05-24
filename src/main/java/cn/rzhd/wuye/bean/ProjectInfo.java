package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: ProjectInfo
@Description: 描述：项目信息
@author: zhongchaojie@rzhd.cn
@date: 2017年5月23日 下午4:05:35
@version: V1.0
*/
public class ProjectInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 项目信息id
	 */
	private Long projectInfoId;
	/**
	 * erp项目id
	 */
	private String erpProjectId;
	/**
	 * 项目名称
	 */
	private String projectName;
	/**
	 * 项目地址
	 */
	private String projectAddress;
	/**
	 * 开发收款公司
	 */
	private String developmentCollectingCompany;	
	/**
	 * 开发收款账户
	 */
	private String developmentCollectingAccount;
	/**
	 * 物业收款公司
	 */
	private String propertyCollectingCompany;
	/**
	 * 物业收款账户
	 */
	private String propertyCollectingAccount;
	/**
	 * 水费单价
	 */
	private BigDecimal waterPrice;
	/**
	 * 电费单价
	 */
	private BigDecimal electricityPrice;
	/**
	 * 客服电话
	 */
	private String servicePhone;
	/**
	 * 项目电话
	 */
	private String objectPhone;
	/**
	 * 创建时间
	 */
	private Date creationTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * 状态（0-正常，1-删除）
	 */
	private Integer status;
	/**
	 * @return the erpProjectId
	 */
	public String getErpProjectId() {
		return erpProjectId;
	}
	/*
	@param erpProjectId the erpProjectId to set
	*/
	public void setErpProjectId(String erpProjectId) {
		this.erpProjectId = erpProjectId;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/*
	@param projectName the projectName to set
	*/
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @return the projectAddress
	 */
	public String getProjectAddress() {
		return projectAddress;
	}
	/*
	@param projectAddress the projectAddress to set
	*/
	public void setProjectAddress(String projectAddress) {
		this.projectAddress = projectAddress;
	}
	/**
	 * @return the developmentCollectingCompany
	 */
	public String getDevelopmentCollectingCompany() {
		return developmentCollectingCompany;
	}
	/*
	@param developmentCollectingCompany the developmentCollectingCompany to set
	*/
	public void setDevelopmentCollectingCompany(String developmentCollectingCompany) {
		this.developmentCollectingCompany = developmentCollectingCompany;
	}
	/**
	 * @return the developmentCollectingAccount
	 */
	public String getDevelopmentCollectingAccount() {
		return developmentCollectingAccount;
	}
	/*
	@param developmentCollectingAccount the developmentCollectingAccount to set
	*/
	public void setDevelopmentCollectingAccount(String developmentCollectingAccount) {
		this.developmentCollectingAccount = developmentCollectingAccount;
	}
	/**
	 * @return the propertyCollectingCompany
	 */
	public String getPropertyCollectingCompany() {
		return propertyCollectingCompany;
	}
	/*
	@param propertyCollectingCompany the propertyCollectingCompany to set
	*/
	public void setPropertyCollectingCompany(String propertyCollectingCompany) {
		this.propertyCollectingCompany = propertyCollectingCompany;
	}
	/**
	 * @return the propertyCollectingAccount
	 */
	public String getPropertyCollectingAccount() {
		return propertyCollectingAccount;
	}
	/*
	@param propertyCollectingAccount the propertyCollectingAccount to set
	*/
	public void setPropertyCollectingAccount(String propertyCollectingAccount) {
		this.propertyCollectingAccount = propertyCollectingAccount;
	}
	/**
	 * @return the waterPrice
	 */
	public BigDecimal getWaterPrice() {
		return waterPrice;
	}
	/*
	@param waterPrice the waterPrice to set
	*/
	public void setWaterPrice(BigDecimal waterPrice) {
		this.waterPrice = waterPrice;
	}
	/**
	 * @return the electricityPrice
	 */
	public BigDecimal getElectricityPrice() {
		return electricityPrice;
	}
	/*
	@param electricityPrice the electricityPrice to set
	*/
	public void setElectricityPrice(BigDecimal electricityPrice) {
		this.electricityPrice = electricityPrice;
	}
	/**
	 * @return the servicePhone
	 */
	public String getServicePhone() {
		return servicePhone;
	}
	/*
	@param servicePhone the servicePhone to set
	*/
	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}
	/**
	 * @return the objectPhone
	 */
	public String getObjectPhone() {
		return objectPhone;
	}
	/*
	@param objectPhone the objectPhone to set
	*/
	public void setObjectPhone(String objectPhone) {
		this.objectPhone = objectPhone;
	}
	/**
	 * @return the creationTime
	 */
	public Date getCreationTime() {
		return creationTime;
	}
	/*
	@param creationTime the creationTime to set
	*/
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
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
	 * @return the projectInfoId
	 */
	public Long getProjectInfoId() {
		return projectInfoId;
	}
	/*
	@param projectInfoId the projectInfoId to set
	*/
	public void setProjectInfoId(Long projectInfoId) {
		this.projectInfoId = projectInfoId;
	}

}
