package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: EnterCost
@Description: 描述：入驻费用
@author: zhongchaojie@rzhd.cn
@date: 2017年5月23日 下午4:46:15
@version: V1.0
 */
public class EnterCost implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 入驻费用id
	 */
	private Long enterCostId;
	/**
	 * 入驻申请id
	 */
	private Long enterApplyId;
	/**
	 * 费用类型
	 */
	private String costType;
	/**
	 * 费用金额
	 */
	private BigDecimal costSum;
	/**
	 * 应缴款日期
	 */
	private Date payableMoneyTime;
	/**
	 * 开始日期
	 */
	private Date startTime;
	/**
	 * 截止日期
	 */
	private Date endTime;
	/**
	 * 费用性质(0-开发，1-物业)
	 */
	private Integer costNature;
	/**
	 * 创建时间
	 */
	private Date creationTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	/**
	 * @return the enterCostId
	 */
	public Long getEnterCostId() {
		return enterCostId;
	}
	/*
	@param enterCostId the enterCostId to set
	*/
	public void setEnterCostId(Long enterCostId) {
		this.enterCostId = enterCostId;
	}
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
	 * @return the costSum
	 */
	public BigDecimal getCostSum() {
		return costSum;
	}
	/*
	@param costSum the costSum to set
	*/
	public void setCostSum(BigDecimal costSum) {
		this.costSum = costSum;
	}
	/**
	 * @return the payableMoneyTime
	 */
	public Date getPayableMoneyTime() {
		return payableMoneyTime;
	}
	/*
	@param payableMoneyTime the payableMoneyTime to set
	*/
	public void setPayableMoneyTime(Date payableMoneyTime) {
		this.payableMoneyTime = payableMoneyTime;
	}
	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}
	/*
	@param startTime the startTime to set
	*/
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return endTime;
	}
	/*
	@param endTime the endTime to set
	*/
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return the costNature
	 */
	public Integer getCostNature() {
		return costNature;
	}
	/*
	@param costNature the costNature to set
	*/
	public void setCostNature(Integer costNature) {
		this.costNature = costNature;
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
