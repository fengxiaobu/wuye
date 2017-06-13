package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.WaterRatePayDetails;
import cn.rzhd.wuye.mapper.WaterPayDetailsMapper;
import cn.rzhd.wuye.service.IWaterPayDetailsService;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2017/6/2.
 */
@Service
public class WaterPayDetailsServiceImpl implements IWaterPayDetailsService {

    @Autowired
    WaterPayDetailsMapper mapper;

    @Override
    public List<WaterRatePayDetails> getAllByQuery(UtilitiesQuery query) {
        if (StringUtil.isNotEmpty(query.getStartDate()) && StringUtil.isNotEmpty(query.getEndDate())){
            return mapper.getAllByQuery(query);
        }
        return null;
    }

    @Override
    public WaterRatePayDetails getLastRecords(UtilitiesQuery query) {
        return mapper.getLastRecords(query);
    }
}
