package cn.rzhd.wuye.vo;

import cn.rzhd.wuye.utils.FirstAndLastDay;

import java.text.SimpleDateFormat;

/**
 * Created by hasee on 2017/5/31.
 * 用于封装查询条件
 */
public class PropertyFeePayDetailsQuery extends BaseQuery{

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
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

    public void setStartDate(String startDate) {
        this.startDate =sdf.format(FirstAndLastDay.getFirst(startDate));
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = sdf.format(FirstAndLastDay.getLast(endDate));
    }

    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    @Override
    public String toString() {
        return "PropertyFeePayDetailsQuery{" +
                "houseInfoId=" + houseInfoId +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", invoiceStatus=" + invoiceStatus +
                '}';
    }

    public PropertyFeePayDetailsQuery() {
        this.startDate = sdf.format(FirstAndLastDay.getFirstDay());
        this.endDate = sdf.format(FirstAndLastDay.getLastDay());
    }
}
