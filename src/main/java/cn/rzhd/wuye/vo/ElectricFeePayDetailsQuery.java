package cn.rzhd.wuye.vo;

import cn.rzhd.wuye.utils.FirstAndLastDay;
import cn.rzhd.wuye.utils.StringTimeUtil;

import java.util.Date;

/**
 * Created by hasee on 2017/6/2.
 */
public class ElectricFeePayDetailsQuery extends BaseQuery {
    /**
     * 房产信息主键
     */
    private Long houseInfoId;
    /**
     * 时间段起始时间
     */
    private String startDate;
    /**
     * 时间段截止时间
     */
    private String endDate;

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

    public ElectricFeePayDetailsQuery() {
        setStartDate(FirstAndLastDay.getFirstDay());
        setEndDate(FirstAndLastDay.getLastDay());
    }
}
