package cn.rzhd.wuye.vo.query;

import cn.rzhd.wuye.utils.FirstAndLastDay;

/**
 * Created by hasee on 2017/6/2.
 */
public class UtilitiesQuery extends BaseQuery{

    protected static final long serialVersionUID = 1L;
    /**
     * 房产信息主键
     */
    private String houseInfoId;
    /**
     * 时间段起始时间
     */
    private String startDate;
    /**
     * 时间段截止时间
     */
    private String endDate;

    public UtilitiesQuery() {
        this.startDate = sdf.format(FirstAndLastDay.getFirstDay());
        this.endDate = sdf.format(FirstAndLastDay.getLastDay());
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
        this.startDate = sdf.format(FirstAndLastDay.getFirst(startDate));
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = sdf.format(FirstAndLastDay.getLast(endDate));
    }
}
