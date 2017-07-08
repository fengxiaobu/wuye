package cn.rzhd.wuye.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * © 2017 RZHD.CN
 *
 * @Package: cn.rzhd.ldug.bean
 * @ClassName: PerfectInformation
 * @Description: 描述：完善信息
 * @author: zhongchaojie@rzhd.cn
 * @date: 2017年5月23日 下午4:19:08
 * @version: V1.0
 */
public class PerfectInformation implements Serializable {
	

    private static final long serialVersionUID = 1L;
    
    /**
     * 完善信息id
     */
    private String perfectInformationId;
    /**
     * 房产id
     */
    private String houseInfoId;
    /**
     * 企业类型(0-个人，1-企业)
     */
    private Integer companyType;
    /**
     * 用户id
     */
    private String customerId;
    /**
     * 房产属性id
     */
    private Long housePropertyId;
    /**
     * 入驻企业成立时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date companyEstablishTime;
    /**
     * 注册资本金
     */
    private BigDecimal signInFund;
    /**
     * 所属行业id
     */
    private Long industryInvolvedId;
    /**
     * 在U谷中的属性
     */
    private Long uRavinePropertyId;
    /**
     * 主营或主导产品
     */
    private String mainProduct;
    /**
     * 公司覆盖区域id
     */
    private Long companyCoverageId;
    /**
     * 职工总人数
     */
    private Long employeeNumber;
    /**
     * 物业对接人
     */
    private String propertyToAccess;
    /**
     * 物业对接人联系方式
     */
    private String propertyToAccessContact;
    /**
     * 物业对接人紧急联系人
     */
    private String emergencyContactPerson;
    /**
     * 物业对接人紧急联系人联系方式
     */
    private String emergencyContactNumber;
    /**
     * 是否高新(0-是，1-不是)
     */
    private Integer isHighNew;
    /**
     * 高新类型(0-国家，1-省级，2-市级)
     */
    private Integer highNewType;
    /**
     * 发证时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date certificateTime;
    /**
     * 专利类型id
     */
    private Long patentTypeId;
    /**
     * 专利个数
     */
    private Integer patentNumber;
    /**
     * 是否上市(0-是，1-不是)
     */
    private Integer isUpBazaar;
    /**
     * 上市类型
     */
    private Long upBazaarTypeId;
    /**
     * 挂牌时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date hangBoardTime;
    /**
     * 股票代码
     */
    private String stockCode;
    /**
     * 备注
     */
    private String notes;
    /**
     * 状态(0-正常，1-删除)
     */
    private Integer status;
    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date carteTime;
    /**
     * 修改时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date updateTime;

    public String getPerfectInformationId() {
        return perfectInformationId;
    }

    public void setPerfectInformationId(String perfectInformationId) {
        this.perfectInformationId = perfectInformationId;
    }

    public String getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(String houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Long getHousePropertyId() {
        return housePropertyId;
    }

    public void setHousePropertyId(Long housePropertyId) {
        this.housePropertyId = housePropertyId;
    }

    public Date getCompanyEstablishTime() {
        return companyEstablishTime;
    }

    public void setCompanyEstablishTime(Date companyEstablishTime) {
        this.companyEstablishTime = companyEstablishTime;
    }

    public BigDecimal getSignInFund() {
        return signInFund;
    }

    public void setSignInFund(BigDecimal signInFund) {
        this.signInFund = signInFund;
    }

    public Long getIndustryInvolvedId() {
        return industryInvolvedId;
    }

    public void setIndustryInvolvedId(Long industryInvolvedId) {
        this.industryInvolvedId = industryInvolvedId;
    }

    public Long getuRavinePropertyId() {
        return uRavinePropertyId;
    }

    public void setuRavinePropertyId(Long uRavinePropertyId) {
        this.uRavinePropertyId = uRavinePropertyId;
    }

    public String getMainProduct() {
        return mainProduct;
    }

    public void setMainProduct(String mainProduct) {
        this.mainProduct = mainProduct;
    }

    public Long getCompanyCoverageId() {
        return companyCoverageId;
    }

    public void setCompanyCoverageId(Long companyCoverageId) {
        this.companyCoverageId = companyCoverageId;
    }

    public Long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getPropertyToAccess() {
        return propertyToAccess;
    }

    public void setPropertyToAccess(String propertyToAccess) {
        this.propertyToAccess = propertyToAccess;
    }

    public String getPropertyToAccessContact() {
        return propertyToAccessContact;
    }

    public void setPropertyToAccessContact(String propertyToAccessContact) {
        this.propertyToAccessContact = propertyToAccessContact;
    }

    public String getEmergencyContactPerson() {
        return emergencyContactPerson;
    }

    public void setEmergencyContactPerson(String emergencyContactPerson) {
        this.emergencyContactPerson = emergencyContactPerson;
    }

    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    public Integer getIsHighNew() {
        return isHighNew;
    }

    public void setIsHighNew(Integer isHighNew) {
        this.isHighNew = isHighNew;
    }

    public Integer getHighNewType() {
        return highNewType;
    }

    public void setHighNewType(Integer highNewType) {
        this.highNewType = highNewType;
    }

    public Date getCertificateTime() {
        return certificateTime;
    }

    public void setCertificateTime(Date certificateTime) {
        this.certificateTime = certificateTime;
    }

    public Long getPatentTypeId() {
        return patentTypeId;
    }

    public void setPatentTypeId(Long patentTypeId) {
        this.patentTypeId = patentTypeId;
    }

    public Integer getPatentNumber() {
        return patentNumber;
    }

    public void setPatentNumber(Integer patentNumber) {
        this.patentNumber = patentNumber;
    }

    public Integer getIsUpBazaar() {
        return isUpBazaar;
    }

    public void setIsUpBazaar(Integer isUpBazaar) {
        this.isUpBazaar = isUpBazaar;
    }

    public Long getUpBazaarTypeId() {
        return upBazaarTypeId;
    }

    public void setUpBazaarTypeId(Long upBazaarTypeId) {
        this.upBazaarTypeId = upBazaarTypeId;
    }

    public Date getHangBoardTime() {
        return hangBoardTime;
    }

    public void setHangBoardTime(Date hangBoardTime) {
        this.hangBoardTime = hangBoardTime;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCarteTime() {
        return carteTime;
    }

    public void setCarteTime(Date carteTime) {
        this.carteTime = carteTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "PerfectInformation [perfectInformationId=" + perfectInformationId + ", houseInfoId=" + houseInfoId
                + ", companyType=" + companyType + ", customerId=" + customerId + ", housePropertyId=" + housePropertyId
                + ", companyEstablishTime=" + companyEstablishTime + ", signInFund=" + signInFund
                + ", industryInvolvedId=" + industryInvolvedId + ", uRavinePropertyId=" + uRavinePropertyId
                + ", mainProduct=" + mainProduct + ", companyCoverageId=" + companyCoverageId + ", employeeNumber="
                + employeeNumber + ", propertyToAccess=" + propertyToAccess + ", propertyToAccessContact="
                + propertyToAccessContact + ", emergencyContactPerson=" + emergencyContactPerson
                + ", emergencyContactNumber=" + emergencyContactNumber + ", isHighNew=" + isHighNew + ", highNewType="
                + highNewType + ", certificateTime=" + certificateTime + ", patentTypeId=" + patentTypeId
                + ", patentNumber=" + patentNumber + ", isUpBazaar=" + isUpBazaar + ", upBazaarTypeId=" + upBazaarTypeId
                + ", hangBoardTime=" + hangBoardTime + ", stockCode=" + stockCode + ", notes=" + notes + ", status="
                + status + ", carteTime=" + carteTime + ", updateTime=" + updateTime + "]";
    }

}
