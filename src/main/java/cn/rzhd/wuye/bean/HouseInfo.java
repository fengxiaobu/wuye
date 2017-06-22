package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * © 2017 RZHD.CN
 *
 * @Package: cn.rzhd.ldug.bean
 * @ClassName: HouseInfo
 * @Description: 描述：房产信息
 * @author: zhongchaojie@rzhd.cn
 * @date: 2017年5月23日 下午4:26:31
 * @version: V1.0
 */
public class HouseInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 入住申请状态
     */
    private String enterApplyState;
    /**
     * 装修申请状态
     */
    private String decorationApplyState;
    /**
     * 房产id
     */
    private String houseInfoId;
    /**
     * 项目id
     */
    private String projectInfoId;
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
     * 项目信息
     */
    private ProjectInfo projectInfo;
    /**
     * 限制缴费起始日期
     */
    private Date startDate;
    /**
     * 限制缴费截止日期
     */
    private Date endDate;
    /**
     * 首次限缴金额
     */
    private BigDecimal firstMoney;
    /**
     * 每次限缴金额
     */
    private BigDecimal everyMoney;
    /**
     * 限缴状态(Y--启用,N--禁用)
     */
    private String astrictStatus;
    /**
     * 缴费限制更新日期
     */
    private Date updateDate;

    public String getEnterApplyState() {
        return enterApplyState;
    }

    public void setEnterApplyState(String enterApplyState) {
        this.enterApplyState = enterApplyState;
    }

    public String getDecorationApplyState() {
        return decorationApplyState;
    }

    public void setDecorationApplyState(String decorationApplyState) {
        this.decorationApplyState = decorationApplyState;
    }

    @Override
    public String toString() {
        return "HouseInfo{" +
                ", houseInfoId='" + houseInfoId + '\'' +
                ", projectInfoId='" + projectInfoId + '\'' +
                ", houseProperty='" + houseProperty + '\'' +
                ", enterStatus=" + enterStatus +
                ", starLevel=" + starLevel +
                ", status=" + status +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", customerId='" + customerId + '\'' +
                ", projectInfo=" + projectInfo +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", firstMoney=" + firstMoney +
                ", everyMoney=" + everyMoney +
                ", astrictStatus='" + astrictStatus + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }

    public ProjectInfo getProjectInfo() {
        return projectInfo;
    }

    public void setProjectInfo(ProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
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

    public String getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(String houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public String getProjectInfoId() {
        return projectInfoId;
    }

    public void setProjectInfoId(String projectInfoId) {
        this.projectInfoId = projectInfoId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getFirstMoney() {
        return firstMoney;
    }

    public void setFirstMoney(BigDecimal firstMoney) {
        this.firstMoney = firstMoney;
    }

    public BigDecimal getEveryMoney() {
        return everyMoney;
    }

    public void setEveryMoney(BigDecimal everyMoney) {
        this.everyMoney = everyMoney;
    }

    public String getAstrictStatus() {
        return astrictStatus;
    }

    public void setAstrictStatus(String astrictStatus) {
        this.astrictStatus = astrictStatus;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
