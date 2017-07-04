package cn.rzhd.wuye.bean;

import java.util.Date;

public class TSys {
    private String id;

//    投诉电话
    private String compHotl;
    
//    入住通知书
    private String occupNotice;

//    入住办理提交备注
    private String checkIn;

//    支付金额温馨提示
    private String payAmountPrompt;

//    物业欠费温馨提示
    private String propertyArreaesTips;

//    代付协议
    private String payAgreem;

//    三方协议
    private String threePartyAgree;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCompHotl() {
        return compHotl;
    }

    public void setCompHotl(String compHotl) {
        this.compHotl = compHotl == null ? null : compHotl.trim();
    }

    public String getOccupNotice() {
        return occupNotice;
    }

    public void setOccupNotice(String occupNotice) {
        this.occupNotice = occupNotice == null ? null : occupNotice.trim();
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn == null ? null : checkIn.trim();
    }

    public String getPayAmountPrompt() {
        return payAmountPrompt;
    }

    public void setPayAmountPrompt(String payAmountPrompt) {
        this.payAmountPrompt = payAmountPrompt == null ? null : payAmountPrompt.trim();
    }

    public String getPropertyArreaesTips() {
        return propertyArreaesTips;
    }

    public void setPropertyArreaesTips(String propertyArreaesTips) {
        this.propertyArreaesTips = propertyArreaesTips == null ? null : propertyArreaesTips.trim();
    }

    public String getPayAgreem() {
        return payAgreem;
    }

    public void setPayAgreem(String payAgreem) {
        this.payAgreem = payAgreem == null ? null : payAgreem.trim();
    }

    public String getThreePartyAgree() {
        return threePartyAgree;
    }

    public void setThreePartyAgree(String threePartyAgree) {
        this.threePartyAgree = threePartyAgree == null ? null : threePartyAgree.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}