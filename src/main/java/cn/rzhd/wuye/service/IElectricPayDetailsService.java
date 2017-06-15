package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.ElectricFeePayDetails;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by hasee on 2017/6/3.
 */
public interface IElectricPayDetailsService {

    List<ElectricFeePayDetails> queryAll(UtilitiesQuery query);

    void addDetails(ElectricFeePayDetails details);

    BigDecimal getAstrictPaid(String houseInfoId, Date startDate,Date endDate);

    ElectricFeePayDetails getLastRecords(UtilitiesQuery query);
}
