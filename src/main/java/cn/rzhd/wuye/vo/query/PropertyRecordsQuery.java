package cn.rzhd.wuye.vo.query;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by hasee on 2017/6/22.
 */
public class PropertyRecordsQuery extends BaseQuery {
    /**
     * 房产主键
     */
    private String houseInfoId;
    /**
     * 时间段起始时间
     */
    private Date startDate;
    /**
     * 时间段截止时间
     */
    private Date endDate;
    /**
     * 费用类型
     */
    private String feeType;
    /**
     * 支付方式
     */
    private String payManner;
    /**
     * 关键字
     */
    private String keyWords;
    /**
     * 后台系统用户ID
     */
    private Long userId;

    public String getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(String houseInfoId) {
        this.houseInfoId = houseInfoId;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getStartDate() {
        return startDate;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getEndDate() {
        return endDate;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getPayManner() {
        return payManner;
    }

    public void setPayManner(String payManner) {
        this.payManner = payManner;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "PropertyRecordsQuery{" +
                "houseInfoId='" + houseInfoId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", feeType='" + feeType + '\'' +
                ", payManner='" + payManner + '\'' +
                ", keyWords='" + keyWords + '\'' +
                ", userId=" + userId +
                '}';
    }
}
