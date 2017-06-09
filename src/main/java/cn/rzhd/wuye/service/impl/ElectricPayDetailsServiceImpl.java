package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.ElectricFeePayDetails;
import cn.rzhd.wuye.mapper.ElectricFeePayDetailsMapper;
import cn.rzhd.wuye.service.IElectricPayDetailsService;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2017/6/3.
 */
@Service
public class ElectricPayDetailsServiceImpl implements IElectricPayDetailsService {

    @Autowired
    ElectricFeePayDetailsMapper mapper;


    @Override
    public List<ElectricFeePayDetails> queryAll(UtilitiesQuery query) {
        if (StringUtil.isNotEmpty(query.getStartDate()) && StringUtil.isNotEmpty(query.getEndDate())){
            return mapper.selectAll(query);
        }
        return null;
    }
}
