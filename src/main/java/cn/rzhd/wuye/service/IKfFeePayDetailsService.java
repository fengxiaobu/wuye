package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.KfFeePayDetails;
import cn.rzhd.wuye.vo.query.KfFeePayDetailsQuery;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/1.
 */
public interface IKfFeePayDetailsService {

    List<KfFeePayDetails> queryAll(KfFeePayDetailsQuery query);

    void addDetails(KfFeePayDetails details);

    void changeStatus(Long id);

    List<Map<String, Object>> getByProject(PropertyRecordsQuery query);

    String getCompanyAccount(String feecode, String pk_corp);

    String getCostType(String feecode, String pk_corp);

    String getCompanyName(String feecode, String pk_corp);

    Integer countByQuery(PropertyRecordsQuery query);
}
