package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: HouseInfo
@Description: 描述：房产信息
@author: zhongchaojie@rzhd.cn
@date: 2017年5月23日 下午4:26:31
@version: V1.0
 */
public class HouseInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 房产信息id
	 */
	private Long houseInfoId;
	/**
	 * erp房产id
	 */
	private String erpHouseId;
	/**
	 * 项目id
	 */
	private Long projectInfoId;
	/**
	 * 房产
	 */
	private String houseProperty;
	/**
	 * 入驻状态(0-是，1-否)
	 */
	private Integer enterStatus;
	/**
	 * 房产星级
	 */
	private Integer starLevel;
	/**
	 * 状态
	 */
	private Integer status;
	/**
	 * 创建时间
	 */
	private Date creationTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * ERP客户主键
	 */
	private String customerId;
	/**
	 * @return the erpHouseId
	 */
	public String getErpHouseId() {
		return erpHouseId;
	}
	/*
	@param erpHouseId the erpHouseId to set
	*/
	public void setErpHouseId(String erpHouseId) {
		this.erpHouseId = erpHouseId;
	}
	
	/**
	 * @return the houseProperty
	 */
	public String getHouseProperty() {
		return houseProperty;
	}
	/*
	@param houseProperty the houseProperty to set
	*/
	public void setHouseProperty(String houseProperty) {
		this.houseProperty = houseProperty;
	}
	/**
	 * @return the enterStatus
	 */
	public Integer getEnterStatus() {
		return enterStatus;
	}
	/*
	@param enterStatus the enterStatus to set
	*/
	public void setEnterStatus(Integer enterStatus) {
		this.enterStatus = enterStatus;
	}
	/**
	 * @return the starLevel
	 */
	public Integer getStarLevel() {
		return starLevel;
	}
	/*
	@param starLevel the starLevel to set
	*/
	public void setStarLevel(Integer starLevel) {
		this.starLevel = starLevel;
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

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
}
