package cn.rzhd.wuye.vo.query;

import cn.rzhd.wuye.utils.FirstAndLastDay;

/**
 * Created by hasee on 2017/6/8.
 */
public class ArrearsQuery extends BaseQuery {
    /**
     * 房产信息ID
     */
    private String houseInfoId;
    /**
     * 缴费日期起始时间
     */
    private String startDate;
    /**
     * 缴费日期结束时间
     */
    private String endDate;

    public ArrearsQuery() {
        this.startDate = sdf.format(FirstAndLastDay.getYearFirst());
        this.endDate = sdf.format(FirstAndLastDay.getNow());
    }

    public String getHouseInfoId() {
        return houseInfoId;
    }

    public void setHouseInfoId(String houseInfoId) {
        this.houseInfoId = houseInfoId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
