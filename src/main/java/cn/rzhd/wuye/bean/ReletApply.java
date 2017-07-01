package cn.rzhd.wuye.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * © 2017 RZHD.CN
 *
 * @Package: cn.rzhd.ldug.bean
 * @ClassName: ReletApply
 * @Description: 描述：续租申请
 * @author: zhongchaojie@rzhd.cn
 * @date: 2017年5月23日 下午3:19:38
 * @version: V1.0
 */
public class ReletApply implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 客户
     */
    private Customer customer;
    /**
     * 续租申请id
     */
    private Long reletApplyId;
    /**
     * 房产id
     */
    private String houseInfoId;
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
     * 续租开始日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date retreaTime;
    /**
     * 续租类型
     */
    private String retreaType;
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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creationTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 续租结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date retreaEndTime;
    private HouseInfoDetails houseInfoDetails;

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

    public Date getRetreaEndTime() {
        return retreaEndTime;
    }

    public void setRetreaEndTime(Date retreaEndTime) {
        this.retreaEndTime = retreaEndTime;
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
    public String getRetreaType() {
        return retreaType;
    }

    /*
    @param retreaType the retreaType to set
    */
    public void setRetreaType(String retreaType) {
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

    public String getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(String houseInfoId) {
        this.houseInfoId = houseInfoId;
    }
}
