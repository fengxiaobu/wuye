package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * © 2017 RZHD.CN
 *
 * @Package: cn.rzhd.ldug.bean
 * @ClassName: TypeDifferentiate
 * @Description: 描述：数据字典类型
 * @author: zhongchaojie@rzhd.cn
 * @date: 2017年5月23日 下午2:22:53
 * @version: V1.0
 */
public class TypeDifferentiate implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 类型区分id
	 */
	private Long typeDifferentiateId;
	/**
	 * 类型名称
	 */
	private String typeDifferentiateName;
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
	 * 类型详细
	 */
	private List<TypeRefinement> typeRefinementList;

	public List<TypeRefinement> getTypeRefinementList() {
		return typeRefinementList;
	}

	public void setTypeRefinementList(List<TypeRefinement> typeRefinementList) {
		this.typeRefinementList = typeRefinementList;
	}

	/**
	 * @return the typeDifferentiateName
	 */
	public String getTypeDifferentiateName() {
		return typeDifferentiateName;
	}

	/*
	 * @param typeDifferentiateName the typeDifferentiateName to set
	 */
	public void setTypeDifferentiateName(String typeDifferentiateName) {
		this.typeDifferentiateName = typeDifferentiateName;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/*
	 * @param note the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the typeDifferentiateId
	 */
	public Long getTypeDifferentiateId() {
		return typeDifferentiateId;
	}

	/*
	 * @param typeDifferentiateId the typeDifferentiateId to set
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

	@Override
	public String toString() {
		return "TypeDifferentiate [typeDifferentiateId=" + typeDifferentiateId + ", typeDifferentiateName="
				+ typeDifferentiateName + ", note=" + note + ", status=" + status + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", typeRefinementList=" + typeRefinementList + "]";
	}

}
