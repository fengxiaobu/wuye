package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
© 2017 RZHD.CN
@Package: cn.rzhd.ldug.bean
@ClassName: ReletApply
@Description: 描述：续租申请
@author: zhongchaojie@rzhd.cn
@date: 2017年5月23日 下午3:19:38
@version: V1.0
 */
public class ReletApply implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 续租申请id
	 */
	private Long reletApplyId;
	/**
	 * 房产id
	 */
	private Long houseInfoId;
	/**
	 * 客户名称
	 */
	private String clientName;
	/**
	 * 房产面积
	 */
	private Float houseAcreage;
	/**
	 * 租赁开始日期
	 */
	private Date leaseStartTime;
	/**
	 * 租赁结束日期
	 */
	private Date leaseEndTime;
	/**
	 * 类型
	 */
	private Integer type;
	/**
	 * 续租日期
	 */
	private Date retreaTime;
	/**
	 * 续租类型
	 */
	private Date retreaType;
	/**
	 * 租金单价
	 */
	private BigDecimal singlePrice;
	/**
	 * 小计
	 */
	private BigDecimal subtotal;
	/**
	 * 优惠金额
	 */
	private BigDecimal privilegeSum;
	/**
	 * 租赁保证金
	 */
	private BigDecimal leaseDeposit;
	/**
	 * 总计
	 */
	private BigDecimal total;
	/**
	 * 创建时间
	 */
	private Date creationTime;
	/**
	 * 修改时间
	 */
	private Date updateTime;
	
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
	 * @return the houseAcreage
	 */
	public Float getHouseAcreage() {
		return houseAcreage;
	}
	/*
	@param houseAcreage the houseAcreage to set
	*/
	public void setHouseAcreage(Float houseAcreage) {
		this.houseAcreage = houseAcreage;
	}
	/**
	 * @return the leaseStartTime
	 */
	public Date getLeaseStartTime() {
		return leaseStartTime;
	}
	/*
	@param leaseStartTime the leaseStartTime to set
	*/
	public void setLeaseStartTime(Date leaseStartTime) {
		this.leaseStartTime = leaseStartTime;
	}
	/**
	 * @return the leaseEndTime
	 */
	public Date getLeaseEndTime() {
		return leaseEndTime;
	}
	/*
	@param leaseEndTime the leaseEndTime to set
	*/
	public void setLeaseEndTime(Date leaseEndTime) {
		this.leaseEndTime = leaseEndTime;
	}
	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}
	/*
	@param type the type to set
	*/
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * @return the retreaTime
	 */
	public Date getRetreaTime() {
		return retreaTime;
	}
	/*
	@param retreaTime the retreaTime to set
	*/
	public void setRetreaTime(Date retreaTime) {
		this.retreaTime = retreaTime;
	}
	/**
	 * @return the retreaType
	 */
	public Date getRetreaType() {
		return retreaType;
	}
	/*
	@param retreaType the retreaType to set
	*/
	public void setRetreaType(Date retreaType) {
		this.retreaType = retreaType;
	}
	/**
	 * @return the singlePrice
	 */
	public BigDecimal getSinglePrice() {
		return singlePrice;
	}
	/*
	@param singlePrice the singlePrice to set
	*/
	public void setSinglePrice(BigDecimal singlePrice) {
		this.singlePrice = singlePrice;
	}
	/**
	 * @return the subtotal
	 */
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	/*
	@param subtotal the subtotal to set
	*/
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	/**
	 * @return the privilegeSum
	 */
	public BigDecimal getPrivilegeSum() {
		return privilegeSum;
	}
	/*
	@param privilegeSum the privilegeSum to set
	*/
	public void setPrivilegeSum(BigDecimal privilegeSum) {
		this.privilegeSum = privilegeSum;
	}
	/**
	 * @return the leaseDeposit
	 */
	public BigDecimal getLeaseDeposit() {
		return leaseDeposit;
	}
	/*
	@param leaseDeposit the leaseDeposit to set
	*/
	public void setLeaseDeposit(BigDecimal leaseDeposit) {
		this.leaseDeposit = leaseDeposit;
	}
	/**
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}
	/*
	@param total the total to set
	*/
	public void setTotal(BigDecimal total) {
		this.total = total;
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
	 * @return the reletApplyId
	 */
	public Long getReletApplyId() {
		return reletApplyId;
	}
	/*
	@param reletApplyId the reletApplyId to set
	*/
	public void setReletApplyId(Long reletApplyId) {
		this.reletApplyId = reletApplyId;
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

}
