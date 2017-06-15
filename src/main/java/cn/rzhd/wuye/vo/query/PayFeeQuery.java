package cn.rzhd.wuye.vo.query;

import java.math.BigDecimal;

/**
 * Created by hasee on 2017/6/10.
 */
public class PayFeeQuery {
    private String customerId;//客户ID
    private String houseInfoId;//房产ID
    private Integer multiply;//电表倍数
    private Integer electricAmount;//电费表单输入的数字(金额或度数)
    private Integer waterAmout;//水费表单输入的数字(金额或吨数)
    private String electricCountBy;//电费选择的计费方式(金额或度数)
    private String waterCountBy;//水费选择的计费方式(金额或吨数)
    private BigDecimal waterPrice;//水费单价
    private BigDecimal electricPrice;//电费单价
    private String[] houseInfoIds;//客户名下所关联的所有房产,用于判断是否有物业欠费

    public String getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(String houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public Integer getMultiply() {
        return multiply;
    }

    public void setMultiply(Integer multiply) {
        this.multiply = multiply;
    }

    public Integer getElectricAmount() {
        return electricAmount;
    }

    public void setElectricAmount(Integer electricAmount) {
        this.electricAmount = electricAmount;
    }

    public Integer getWaterAmout() {
        return waterAmout;
    }

    public void setWaterAmout(Integer waterAmout) {
        this.waterAmout = waterAmout;
    }

    public String getElectricCountBy() {
        return electricCountBy;
    }

    public void setElectricCountBy(String electricCountBy) {
        this.electricCountBy = electricCountBy;
    }

    public String getWaterCountBy() {
        return waterCountBy;
    }

    public void setWaterCountBy(String waterCountBy) {
        this.waterCountBy = waterCountBy;
    }

    public BigDecimal getWaterPrice() {
        return waterPrice;
    }

    public void setWaterPrice(BigDecimal waterPrice) {
        this.waterPrice = waterPrice;
    }

    public BigDecimal getElectricPrice() {
        return electricPrice;
    }

    public void setElectricPrice(BigDecimal electricPrice) {
        this.electricPrice = electricPrice;
    }

    public String[] getHouseInfoIds() {
        return houseInfoIds;
    }

    public void setHouseInfoIds(String[] houseInfoIds) {
        this.houseInfoIds = houseInfoIds;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
