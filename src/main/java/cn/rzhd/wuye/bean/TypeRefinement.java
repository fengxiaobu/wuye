package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: TypeRefinement
@Description: 描述：数据字典明细
@author: zhongchaojie@rzhd.cn
@date: 2017年5月23日 下午2:18:54
@version: V1.0
 */
public class TypeRefinement implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 类型细化id
	 */
	private Long typeRefinementId;
	/**
	 * 类型区分id
	 */
	private Long typeDifferentiateId;
	/**
	 * 类型细化名称
	 */
	private String typeRefinementName;
	/**
	 * 备注
	 */
	private String note;
	
	/**
	 * 状态，0-启用，1-禁用
	 */
	private Integer status;
	
	private Date createTime;
	private Date updateTime;
	
	/**
	 * @return the typeRefinementName
	 */
	public String getTypeRefinementName() {
		return typeRefinementName;
	}
	/*
	@param typeRefinementName the typeRefinementName to set
	*/
	public void setTypeRefinementName(String typeRefinementName) {
		this.typeRefinementName = typeRefinementName;
	}
	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}
	/*
	@param note the note to set
	*/
	public void setNote(String note) {
		this.note = note;
	}
	/**
	 * @return the typeRefinementId
	 */
	public Long getTypeRefinementId() {
		return typeRefinementId;
	}
	/*
	@param typeRefinementId the typeRefinementId to set
	*/
	public void setTypeRefinementId(Long typeRefinementId) {
		this.typeRefinementId = typeRefinementId;
	}
	/**
	 * @return the typeDifferentiateId
	 */
	public Long getTypeDifferentiateId() {
		return typeDifferentiateId;
	}
	/*
	@param typeDifferentiateId the typeDifferentiateId to set
	*/
	public void setTypeDifferentiateId(Long typeDifferentiateId) {
		this.typeDifferentiateId = typeDifferentiateId;
	}
	public Integer getStatus() {
	    return status;
	}
	public void setStatus(Integer status) {
	    this.status = status;
	}
	public Date getCreateTime() {
	    return createTime;
	}
	public void setCreateTime(Date createTime) {
	    this.createTime = createTime;
	}
	public Date getUpdateTime() {
	    return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
	    this.updateTime = updateTime;
	}

}
