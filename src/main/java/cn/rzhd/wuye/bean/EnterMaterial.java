package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: EnterMaterial
@Description: 描述：入驻资料表
@author: zhongchaojie@rzhd.cn
@date: 2017年5月23日 下午4:42:48
@version: V1.0
 */
public class EnterMaterial implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 入驻资料表id
	 */
	private Long enterMaterialId;
	/**
	 * 房产id
	 */
	private Long houseInfoId;
	/**
	 * 资料名称
	 */
	private String materialName;
	/**
	 * 资料地址
	 */
	private String materialAddress;
	/**
	 * 基本信息
	 */
	private String basicInfo;
	/**
	 * 备注
	 */
	private String notes;
	/**
	 * 修改用户
	 */
	private Long userId;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	
	/**
	 * @return the materialName
	 */
	public String getMaterialName() {
		return materialName;
	}
	/*
	@param materialName the materialName to set
	*/
	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}
	/**
	 * @return the materialAddress
	 */
	public String getMaterialAddress() {
		return materialAddress;
	}
	/*
	@param materialAddress the materialAddress to set
	*/
	public void setMaterialAddress(String materialAddress) {
		this.materialAddress = materialAddress;
	}
	/**
	 * @return the basicInfo
	 */
	public String getBasicInfo() {
		return basicInfo;
	}
	/*
	@param basicInfo the basicInfo to set
	*/
	public void setBasicInfo(String basicInfo) {
		this.basicInfo = basicInfo;
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
	 * @return the enterMaterialId
	 */
	public Long getEnterMaterialId() {
		return enterMaterialId;
	}
	/*
	@param enterMaterialId the enterMaterialId to set
	*/
	public void setEnterMaterialId(Long enterMaterialId) {
		this.enterMaterialId = enterMaterialId;
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
	

}
