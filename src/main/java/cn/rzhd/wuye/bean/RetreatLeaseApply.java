package cn.rzhd.wuye.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * © 2017 RZHD.CN
 *
 * @Package: cn.rzhd.ldug.bean
 * @ClassName: RetreatLeaseApply
 * @Description: 描述：退租申请
 * @author: zhongchaojie@rzhd.cn
 * @date: 2017年5月23日 下午2:25:42
 * @version: V1.0
 */
public class RetreatLeaseApply implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 客户信息
     */
    private Customer customer;
    /**
     * 客户ID
     */
    private String customerId;
    /**
     * 退租申请id
     */
    private Long retreatLeaseApplyId;
    /**
     * 房产id
     */
    private String houseInfoId;
    /**
     * 房产编号
     */
    private String houseNumber;
    /**
     * 房产面积
     */
    private Float houseAcreage;
    /**
     * 租赁开始日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date leaseStartTime;
    /**
     * 租赁结束日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date leaseEndTime;
    /**
     * 退租日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date retreatLeaseTime;
    /**
     * 退租类型
     */
    private String retreatLeaseType;
    /**
     * 欠缴租金
     */
    private BigDecimal arrearsRent;
    /**
     * 租赁保证金
     */
    private BigDecimal leaseDeposit;
    /**
     * 准退租赁保证金
     */
    private BigDecimal permitRetreatLeaseDeposit;
    /**
     * 提交日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationTime;
    /**
     * 修改日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;
    private HouseInfoDetails houseInfoDetails;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public HouseInfoDetails getHouseInfoDetails() {
        return houseInfoDetails;
    }

    public void setHouseInfoDetails(HouseInfoDetails houseInfoDetails) {
        this.houseInfoDetails = houseInfoDetails;
    }

    /**
     * @return the houseNumber
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /*
    @param houseNumber the houseNumber to set
    */
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
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
     * @return the retreatLeaseTime
     */
    public Date getRetreatLeaseTime() {
        return retreatLeaseTime;
    }

    /*
    @param retreatLeaseTime the retreatLeaseTime to set
    */
    public void setRetreatLeaseTime(Date retreatLeaseTime) {
        this.retreatLeaseTime = retreatLeaseTime;
    }

    public String getRetreatLeaseType() {
        return retreatLeaseType;
    }

    public void setRetreatLeaseType(String retreatLeaseType) {
        this.retreatLeaseType = retreatLeaseType;
    }

    /**
     * @return the arrearsRent
     */
    public BigDecimal getArrearsRent() {
        return arrearsRent;
    }

    /*
    @param arrearsRent the arrearsRent to set
    */
    public void setArrearsRent(BigDecimal arrearsRent) {
        this.arrearsRent = arrearsRent;
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
     * @return the permitRetreatLeaseDeposit
     */
    public BigDecimal getPermitRetreatLeaseDeposit() {
        return permitRetreatLeaseDeposit;
    }

    /*
    @param permitRetreatLeaseDeposit the permitRetreatLeaseDeposit to set
    */
    public void setPermitRetreatLeaseDeposit(BigDecimal permitRetreatLeaseDeposit) {
        this.permitRetreatLeaseDeposit = permitRetreatLeaseDeposit;
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
     * @return the retreatLeaseApplyId
     */
    public Long getRetreatLeaseApplyId() {
        return retreatLeaseApplyId;
    }

    /*
    @param retreatLeaseApplyId the retreatLeaseApplyId to set
    */
    public void setRetreatLeaseApplyId(Long retreatLeaseApplyId) {
        this.retreatLeaseApplyId = retreatLeaseApplyId;
    }

    public String getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(String houseInfoId) {
        this.houseInfoId = houseInfoId;
    }
}
