package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: EnterApply
@Description: 描述：入驻申请
@author: zhongchaojie@rzhd.cn
@date: 2017年5月23日 下午4:50:22
@version: V1.0
 */
public class EnterApply implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 入驻申请id
	 */
	private Long enterApplyId;
	/**
	 * 房产id
	 */
	private Long houseInfoId;
	/**
	 * 客户名称
	 */
	private String clientName;
	/**
	 * 申请时间
	 */
	private Date applyTime;
	/**
	 * 审核状态(0-未审核，1-已通过，2-未通过)
	 */
	private Integer auditStatus;
	/**
	 * 入驻通知书
	 */
	private String enterAdviceNote;
	/**
	 * 备注
	 */
	private String notes;
	/**
	 * 创建时间
	 */
	private Date creationTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	
	
	/**
	 * @return the enterApplyId
	 */
	public Long getEnterApplyId() {
		return enterApplyId;
	}
	/*
	@param enterApplyId the enterApplyId to set
	*/
	public void setEnterApplyId(Long enterApplyId) {
		this.enterApplyId = enterApplyId;
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
	 * @return the applyTime
	 */
	public Date getApplyTime() {
		return applyTime;
	}
	/*
	@param applyTime the applyTime to set
	*/
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	/**
	 * @return the auditStatus
	 */
	public Integer getAuditStatus() {
		return auditStatus;
	}
	/*
	@param auditStatus the auditStatus to set
	*/
	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
	}
	/**
	 * @return the enterAdviceNote
	 */
	public String getEnterAdviceNote() {
		return enterAdviceNote;
	}
	/*
	@param enterAdviceNote the enterAdviceNote to set
	*/
	public void setEnterAdviceNote(String enterAdviceNote) {
		this.enterAdviceNote = enterAdviceNote;
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

}
