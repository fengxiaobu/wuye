package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.UtilitiesDetails;
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

    List<Map<String,Object>> getElectricByProject(Long userId);

    List<Map<String,Object>> getWaterByProject(Long userId);

    BigDecimal getAstrictPaid(String houseInfoId, Date startDate, Date endDate);

    String getCompanyName(String pk_feeType,String pk_corp);

    String getCompanyAccount(String pk_feeType,String pk_corp);

    String getCostType(String pk_feeType,String pk_corp);

    Map<String,Object> getByPrimaryKey(Long id);
}
