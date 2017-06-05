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
	 * erp公司主键
	 */
	private String pkCorp;
	/**
	 * 项目编码
	 */
	private String vcode;
	/**
	 * 项目简称
	 */
	private String vshortname;
	/**
	 * 责任公司
	 */
	private String pkResponsecorp;
	/**
	 * 内部编码
	 */
	private String vincode;
	/**
	 * 装修管理费单价
	 */
	private BigDecimal decorateManage;
	/**
	 * 出入证押金(个)
	 */
	private BigDecimal passcardPledge;
	/**
	 * 出入证工本费(个)
	 */
	private BigDecimal passcardCost;
	/**
	 * 装修面积,小于此值或大于等于此值分别计算押金单价
	 */
	private BigDecimal decorateArea;
	/**
	 * 小于设置的装修面积的押金单价
	 */
	private BigDecimal lessPledge;
	/**
	 * 大于等于设置的装修面积的押金单价
	 */
	private BigDecimal morePledge;
	/**
	 * 项目信息id
	 */
	private String pkProject;

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

	public String getPkCorp() {
		return pkCorp;
	}

	public void setPkCorp(String pkCorp) {
		this.pkCorp = pkCorp;
	}

	public String getVcode() {
		return vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
	}

	public String getVshortname() {
		return vshortname;
	}

	public void setVshortname(String vshortname) {
		this.vshortname = vshortname;
	}

	public String getPkResponsecorp() {
		return pkResponsecorp;
	}

	public void setPkResponsecorp(String pkResponsecorp) {
		this.pkResponsecorp = pkResponsecorp;
	}

	public String getVincode() {
		return vincode;
	}

	public void setVincode(String vincode) {
		this.vincode = vincode;
	}

	public BigDecimal getDecorateManage() {
		return decorateManage;
	}

	public void setDecorateManage(BigDecimal decorateManage) {
		this.decorateManage = decorateManage;
	}

	public BigDecimal getPasscardPledge() {
		return passcardPledge;
	}

	public void setPasscardPledge(BigDecimal passcardPledge) {
		this.passcardPledge = passcardPledge;
	}

	public BigDecimal getPasscardCost() {
		return passcardCost;
	}

	public void setPasscardCost(BigDecimal passcardCost) {
		this.passcardCost = passcardCost;
	}

	public BigDecimal getDecorateArea() {
		return decorateArea;
	}

	public void setDecorateArea(BigDecimal decorateArea) {
		this.decorateArea = decorateArea;
	}

	public BigDecimal getLessPledge() {
		return lessPledge;
	}

	public void setLessPledge(BigDecimal lessPledge) {
		this.lessPledge = lessPledge;
	}

	public BigDecimal getMorePledge() {
		return morePledge;
	}

	public void setMorePledge(BigDecimal morePledge) {
		this.morePledge = morePledge;
	}

	public String getPkProject() {
		return pkProject;
	}

	public void setPkProject(String pkProject) {
		this.pkProject = pkProject;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectAddress() {
		return projectAddress;
	}

	public void setProjectAddress(String projectAddress) {
		this.projectAddress = projectAddress;
	}

	public String getDevelopmentCollectingCompany() {
		return developmentCollectingCompany;
	}

	public void setDevelopmentCollectingCompany(String developmentCollectingCompany) {
		this.developmentCollectingCompany = developmentCollectingCompany;
	}

	public String getDevelopmentCollectingAccount() {
		return developmentCollectingAccount;
	}

	public void setDevelopmentCollectingAccount(String developmentCollectingAccount) {
		this.developmentCollectingAccount = developmentCollectingAccount;
	}

	public String getPropertyCollectingCompany() {
		return propertyCollectingCompany;
	}

	public void setPropertyCollectingCompany(String propertyCollectingCompany) {
		this.propertyCollectingCompany = propertyCollectingCompany;
	}

	public String getPropertyCollectingAccount() {
		return propertyCollectingAccount;
	}

	public void setPropertyCollectingAccount(String propertyCollectingAccount) {
		this.propertyCollectingAccount = propertyCollectingAccount;
	}

	public BigDecimal getWaterPrice() {
		return waterPrice;
	}

	public void setWaterPrice(BigDecimal waterPrice) {
		this.waterPrice = waterPrice;
	}

	public BigDecimal getElectricityPrice() {
		return electricityPrice;
	}

	public void setElectricityPrice(BigDecimal electricityPrice) {
		this.electricityPrice = electricityPrice;
	}

	public String getServicePhone() {
		return servicePhone;
	}

	public void setServicePhone(String servicePhone) {
		this.servicePhone = servicePhone;
	}

	public String getObjectPhone() {
		return objectPhone;
	}

	public void setObjectPhone(String objectPhone) {
		this.objectPhone = objectPhone;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
