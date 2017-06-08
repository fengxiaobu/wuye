package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.PropertyFeePayDetails;
import cn.rzhd.wuye.mapper.PropertyFeePayDetailsMapper;
import cn.rzhd.wuye.service.IPropertyFeePayDetailsService;
import cn.rzhd.wuye.vo.query.PropertyFeePayDetailsQuery;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2017/6/1.
 */
@Service
public class PropertyFeePayDetailsServiceImpl implements IPropertyFeePayDetailsService{

    @Autowired
    PropertyFeePayDetailsMapper mapper;

    /**
     *
     * @param query 必须包含房产信息主键(houseInfoId),同时包含或不包含查询时间段,包含分页信息
     * @return
     */
    @Override
    public List<PropertyFeePayDetails> queryAll(PropertyFeePayDetailsQuery query) {
        if (StringUtil.isNotEmpty(query.getStartDate()) && StringUtil.isNotEmpty(query.getEndDate())){
            return mapper.queryAll(query);
        }
        return null;
    }
}
