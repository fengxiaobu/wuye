package cn.rzhd.wuye.vo;

import cn.rzhd.wuye.utils.FirstAndLastDay;
import cn.rzhd.wuye.utils.StringTimeUtil;

import java.util.Date;

/**
 * Created by hasee on 2017/6/1.
 */
public class KfFeePayDetailsQuery extends BaseQuery{
    /**
     * 房产信息ID
     */
    private Long houseInfoId;
    /**
     * 缴费日期起始时间
     */
    private String startDate;
    /**
     * 缴费日期结束时间
     */
    private String endDate;
    /**
     * 是否已开发票(0-已开,1-未开,-2不开)
     */
    private Integer invoiceStatus;

    public Long getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(Long houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = StringTimeUtil.format(startDate);
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = StringTimeUtil.format(endDate);
    }

    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    @Override
    public String toString() {
        return "KfFeePayDetailsQuery{" +
                "houseInfoId=" + houseInfoId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", invoiceStatus=" + invoiceStatus +
                '}';
    }

    public KfFeePayDetailsQuery() {
        setStartDate(FirstAndLastDay.getFirstDay());
        setEndDate(FirstAndLastDay.getLastDay());
    }
}
