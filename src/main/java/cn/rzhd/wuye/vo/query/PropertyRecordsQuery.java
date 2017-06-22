package cn.rzhd.wuye.vo.query;

import java.util.Date;

/**
 * Created by hasee on 2017/6/22.
 */
public class PropertyRecordsQuery extends BaseQuery {
    /**
     * 项目主键,用于查询该项目下所有信息
     */
    private String projectId;
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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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
}
