package cn.rzhd.wuye.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * © 2017 RZHD.CN
 *
 * @Package: cn.rzhd.ldug.bean
 * @ClassName: DecorationApply
 * @Description: 描述：装修申请表
 * @author: an-wei.xie@rzhd.cn
 * @date: 2017年5月23日 上午11:33:13
 * @version: V1.0
 */
public class DecorationApply implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     *
     */
    private HouseInfoDetails houseInfoDetails;
    /**
     * 主键
     */
    private Long decorationApplyId;
    /**
     * 房产id
     */
    private String houseInfoId;
    /**
     * 客户名称
     */
    private String clientName;

    /**
     * 申请日期
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date applyTime;
    /**
     * 预计工天
     */
    private Integer antipateTime;
    /**
     * 现场管理人
     */
    private String localeCustodian;
    /**
     * 现场管理人联系电话
     */
    private String localeCustodianPhone;
    /**
     * 装修部位
     */
    private String decorationParts;
    /**
     * 装修面积
     */
    private Float decorateArea;
    /**
     * 施工人数
     */
    private Integer constructPeopleNumber;
    /**
     * 装修公司
     */
    private String decorationCompany;
    /**
     * 装修负责人
     */
    private String decorationLeader;
    /**
     * 装修负责人电话
     */
    private String decorationLeaderPhone;
    /**
     * 装修押金
     */
    private BigDecimal decorationDeposit;
    /**
     * 装修管理费
     */
    private BigDecimal decorationManagementCost;
    /**
     * 出入证工本费
     */
    private BigDecimal passPapersCost;
    /**
     * 出入证押金
     */
    private BigDecimal passPapersDeposit;
    /**
     * 审核状态 0-通过,1-未通过，2-未审核
     */
    private Integer auditStatus;
    /**
     * 反馈意见1
     */
    private String feedback1;
    /**
     * 反馈意见2
     */
    private String feedback2;
    /**
     * 是否特殊装修(0-不是，1-是)
     */
    private Integer isSpecialDecoration;
    /**
     * 特殊装修文件
     */
    private String specialDecorationFile;
    /**
     * 创建时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date creationTime;
    /**
     * 修改时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updateTime;
   /* *//**
     * 装修详情
     *//*
    private List<DecorateDetail> decorateDetailList;
    *//**
     * 装修资料
     *//*
    private List<DecorationMaterial> decorationMaterialList;
*/
 /*   public List<DecorateDetail> getDecorateDetailList() {
        return decorateDetailList;
    }

    public void setDecorateDetailList(List<DecorateDetail> decorateDetailList) {
        this.decorateDetailList = decorateDetailList;
    }

    public List<DecorationMaterial> getDecorationMaterialList() {
        return decorationMaterialList;
    }

    public void setDecorationMaterialList(List<DecorationMaterial> decorationMaterialList) {
        this.decorationMaterialList = decorationMaterialList;
    }*/


    @Override
    public String toString() {
        return "DecorationApply{" +
                "houseInfoDetails=" + houseInfoDetails +
                ", decorationApplyId=" + decorationApplyId +
                ", houseInfoId='" + houseInfoId + '\'' +
                ", clientName='" + clientName + '\'' +
                ", applyTime=" + applyTime +
                ", antipateTime=" + antipateTime +
                ", localeCustodian='" + localeCustodian + '\'' +
                ", localeCustodianPhone='" + localeCustodianPhone + '\'' +
                ", decorationParts='" + decorationParts + '\'' +
                ", decorateArea=" + decorateArea +
                ", constructPeopleNumber=" + constructPeopleNumber +
                ", decorationCompany='" + decorationCompany + '\'' +
                ", decorationLeader='" + decorationLeader + '\'' +
                ", decorationLeaderPhone='" + decorationLeaderPhone + '\'' +
                ", decorationDeposit=" + decorationDeposit +
                ", decorationManagementCost=" + decorationManagementCost +
                ", passPapersCost=" + passPapersCost +
                ", passPapersDeposit=" + passPapersDeposit +
                ", auditStatus=" + auditStatus +
                ", feedback1='" + feedback1 + '\'' +
                ", feedback2='" + feedback2 + '\'' +
                ", isSpecialDecoration=" + isSpecialDecoration +
                ", specialDecorationFile='" + specialDecorationFile + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
              /*  ", decorateDetailList=" + decorateDetailList +
                ", decorationMaterialList=" + decorationMaterialList +*/
                '}';
    }

    public HouseInfoDetails getHouseInfoDetails() {
        return houseInfoDetails;
    }

    public void setHouseInfoDetails(HouseInfoDetails houseInfoDetails) {
        this.houseInfoDetails = houseInfoDetails;
    }

    public Long getDecorationApplyId() {
        return decorationApplyId;
    }

    public void setDecorationApplyId(Long decorationApplyId) {
        this.decorationApplyId = decorationApplyId;
    }

    public String getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(String houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Integer getAntipateTime() {
        return antipateTime;
    }

    public void setAntipateTime(Integer antipateTime) {
        this.antipateTime = antipateTime;
    }

    public String getLocaleCustodian() {
        return localeCustodian;
    }

    public void setLocaleCustodian(String localeCustodian) {
        this.localeCustodian = localeCustodian;
    }

    public String getLocaleCustodianPhone() {
        return localeCustodianPhone;
    }

    public void setLocaleCustodianPhone(String localeCustodianPhone) {
        this.localeCustodianPhone = localeCustodianPhone;
    }

    public String getDecorationParts() {
        return decorationParts;
    }

    public void setDecorationParts(String decorationParts) {
        this.decorationParts = decorationParts;
    }

    public Float getDecorateArea() {
        return decorateArea;
    }

    public void setDecorateArea(Float decorateArea) {
        this.decorateArea = decorateArea;
    }

    public Integer getConstructPeopleNumber() {
        return constructPeopleNumber;
    }

    public void setConstructPeopleNumber(Integer constructPeopleNumber) {
        this.constructPeopleNumber = constructPeopleNumber;
    }

    public String getDecorationCompany() {
        return decorationCompany;
    }

    public void setDecorationCompany(String decorationCompany) {
        this.decorationCompany = decorationCompany;
    }

    public String getDecorationLeader() {
        return decorationLeader;
    }

    public void setDecorationLeader(String decorationLeader) {
        this.decorationLeader = decorationLeader;
    }

    public String getDecorationLeaderPhone() {
        return decorationLeaderPhone;
    }

    public void setDecorationLeaderPhone(String decorationLeaderPhone) {
        this.decorationLeaderPhone = decorationLeaderPhone;
    }

    public BigDecimal getDecorationDeposit() {
        return decorationDeposit;
    }

    public void setDecorationDeposit(BigDecimal decorationDeposit) {
        this.decorationDeposit = decorationDeposit;
    }

    public BigDecimal getDecorationManagementCost() {
        return decorationManagementCost;
    }

    public void setDecorationManagementCost(BigDecimal decorationManagementCost) {
        this.decorationManagementCost = decorationManagementCost;
    }

    public BigDecimal getPassPapersCost() {
        return passPapersCost;
    }

    public void setPassPapersCost(BigDecimal passPapersCost) {
        this.passPapersCost = passPapersCost;
    }

    public BigDecimal getPassPapersDeposit() {
        return passPapersDeposit;
    }

    public void setPassPapersDeposit(BigDecimal passPapersDeposit) {
        this.passPapersDeposit = passPapersDeposit;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getFeedback1() {
        return feedback1;
    }

    public void setFeedback1(String feedback1) {
        this.feedback1 = feedback1;
    }

    public String getFeedback2() {
        return feedback2;
    }

    public void setFeedback2(String feedback2) {
        this.feedback2 = feedback2;
    }

    public Integer getIsSpecialDecoration() {
        return isSpecialDecoration;
    }

    public void setIsSpecialDecoration(Integer isSpecialDecoration) {
        this.isSpecialDecoration = isSpecialDecoration;
    }

    public String getSpecialDecorationFile() {
        return specialDecorationFile;
    }

    public void setSpecialDecorationFile(String specialDecorationFile) {
        this.specialDecorationFile = specialDecorationFile;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


}
