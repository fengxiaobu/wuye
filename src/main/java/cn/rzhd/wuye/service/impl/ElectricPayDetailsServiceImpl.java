package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.Ammeter;
import cn.rzhd.wuye.bean.ElectricFeePayDetails;
import cn.rzhd.wuye.mapper.AmmeterMapper;
import cn.rzhd.wuye.mapper.ElectricFeePayDetailsMapper;
import cn.rzhd.wuye.service.IElectricPayDetailsService;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by hasee on 2017/6/3.
 */
@Service
public class ElectricPayDetailsServiceImpl implements IElectricPayDetailsService {

    @Autowired
    ElectricFeePayDetailsMapper mapper;
    @Autowired
    AmmeterMapper ammeterMapper;


    @Override
    public List<ElectricFeePayDetails> queryAll(UtilitiesQuery query) {
        if (StringUtil.isNotEmpty(query.getStartDate()) && StringUtil.isNotEmpty(query.getEndDate())){
            return mapper.selectAll(query);
        }
        return null;
    }

    @Override
    public List<Ammeter> getAmmeters(String houseInfoId) {
        return ammeterMapper.queryAmmeters(houseInfoId);
    }

    /**
     * 用于缴费成功后,添加缴费记录
     * @param details
     */
    @Override
    public void addDetails(ElectricFeePayDetails details) {

    }

    @Override
    public BigDecimal getAstrictPaid(String houseInfoId, Date startDate,Date endDate) {
        return mapper.getAstrictPaid(houseInfoId,startDate,endDate);
    }

    @Override
    public ElectricFeePayDetails getLastRecords(UtilitiesQuery query) {
        return mapper.getLastRecords(query);
    }
}
