package cn.rzhd.wuye.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * © 2017 RZHD.CN
 *
 * @Package: cn.rzhd.ldug.bean
 * @ClassName: EnterApply
 * @Description: 描述：入驻申请
 * @author: zhongchaojie@rzhd.cn
 * @date: 2017年5月23日 下午4:50:22
 * @version: V1.0
 */
public class EnterApply implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 入驻申请id
     */
    private Long enterApplyId;
    /**
     * 房产id
     */
    private String houseId;
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
     * 物业支付状态
     */
    private String wyState;
    /**
     * 开发支付状态
     */
    private String kfState;
    /**
     * 房产信息
     */
    private HouseInfoDetails houseInfoDetails;

    public String getWyState() {
        return wyState;
    }

    public void setWyState(String wyState) {
        this.wyState = wyState;
    }

    public String getKfState() {
        return kfState;
    }

    public void setKfState(String kfState) {
        this.kfState = kfState;
    }

    public Long getEnterApplyId() {
        return enterApplyId;
    }

    public void setEnterApplyId(Long enterApplyId) {
        this.enterApplyId = enterApplyId;
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId;
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

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getEnterAdviceNote() {
        return enterAdviceNote;
    }

    public void setEnterAdviceNote(String enterAdviceNote) {
        this.enterAdviceNote = enterAdviceNote;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    @Override
    public String toString() {
        return "EnterApply{" +
                "enterApplyId=" + enterApplyId +
                ", houseId='" + houseId + '\'' +
                ", clientName='" + clientName + '\'' +
                ", applyTime=" + applyTime +
                ", auditStatus=" + auditStatus +
                ", enterAdviceNote='" + enterAdviceNote + '\'' +
                ", notes='" + notes + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", houseInfoDetails=" + houseInfoDetails +
                '}';
    }

    public HouseInfoDetails getHouseInfoDetails() {
        return houseInfoDetails;
    }

    public void setHouseInfoDetails(HouseInfoDetails houseInfoDetails) {
        this.houseInfoDetails = houseInfoDetails;
    }
}
