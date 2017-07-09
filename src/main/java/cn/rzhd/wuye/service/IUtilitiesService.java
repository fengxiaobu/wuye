package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.UtilitiesDetails;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/20.
 */
public interface IUtilitiesService {

    Map<String,Object> getLastRecords(UtilitiesQuery query);

    List<UtilitiesDetails> queryAll(UtilitiesQuery query);

    void addDetails(UtilitiesDetails details);

    void changeStatus(Long id);

    List<Map<String,Object>> getElectricByProject(PropertyRecordsQuery query);

    List<Map<String,Object>> getWaterByProject(PropertyRecordsQuery query);

    BigDecimal getAstrictPaid(String houseInfoId, Date startDate, Date endDate);

    String getCompanyName(String pk_feeType,String pk_corp);

    String getCompanyAccount(String pk_feeType,String pk_corp);

    String getCostType(String pk_feeType,String pk_corp);

    Map<String,Object> getElectricByPrimaryKey(Long id);

    Map<String,Object> getWaterByPrimaryKey(Long id);

    Integer countElectricByQuery(PropertyRecordsQuery query);

    Integer countWaterByQuery(PropertyRecordsQuery query);

    void changeStatusByRecordsId(String id);
}
