package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.UtilitiesDetails;
import cn.rzhd.wuye.mapper.UtilitiesDetailsMapper;
import cn.rzhd.wuye.service.IUtilitiesService;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/20.
 */
@Service
public class UtilitiesServiceImpl implements IUtilitiesService {
    @Autowired
    UtilitiesDetailsMapper mapper;
    @Override
    public Map<String,Object> getLastRecords(UtilitiesQuery query) {
        Map<String,Object> map = new HashMap<>();
        map.put("electric",mapper.getLastElectric(query));
        map.put("water",mapper.getLastWater(query));
        return map;
    }

    @Override
    public List<UtilitiesDetails> queryAll(UtilitiesQuery query) {
        if (StringUtil.isNotEmpty(query.getStartDate()) && StringUtil.isNotEmpty(query.getEndDate())){
            return mapper.selectAll(query);
        }
        return null;
    }

    @Override
    public void addDetails(UtilitiesDetails details) {
        mapper.insert(details);
    }

    @Override
    public void changeStatus(Long id) {
        mapper.changeStatus(id);
    }

    @Override
    public List<Map<String, Object>> getElectricByProject(PropertyRecordsQuery query) {
        return mapper.getElectricByProject(query);
    }

    @Override
    public List<Map<String, Object>> getWaterByProject(PropertyRecordsQuery query) {
        return mapper.getWaterByProject(query);
    }

    @Override
    public BigDecimal getAstrictPaid(String houseInfoId, Date startDate, Date endDate) {
        return mapper.getAstrictPaid(houseInfoId,startDate,endDate);
    }

    @Override
    public String getCompanyName(String pk_feeType,String pk_corp) {
        return mapper.getCompanyName(pk_feeType,pk_corp);
    }

    @Override
    public String getCompanyAccount(String pk_feeType,String pk_corp) {
        return mapper.getCompanyAccount(pk_feeType,pk_corp);
    }

    @Override
    public String getCostType(String pk_feeType,String pk_corp) {
        return mapper.getCostType(pk_feeType,pk_corp);
    }

    @Override
    public Map<String, Object> getElectricByPrimaryKey(Long id) {
        return mapper.getElectricByPrimaryKey(id);
    }

    @Override
    public Map<String, Object> getWaterByPrimaryKey(Long id) {
        return mapper.getWaterByPrimaryKey(id);
    }

    @Override
    public Integer countElectricByQuery(PropertyRecordsQuery query) {
        return mapper.countElectricByQuery(query);
    }

    @Override
    public Integer countWaterByQuery(PropertyRecordsQuery query) {
        return mapper.countWaterByQuery(query);
    }
}
