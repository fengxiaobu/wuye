package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.KfFee;
import cn.rzhd.wuye.mapper.KfFeeMapper;
import cn.rzhd.wuye.service.IKfFeeService;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2017/6/8.
 */
@Service
public class KfFeeServiceImpl implements IKfFeeService {

    @Autowired
    KfFeeMapper mapper;

    @Override
    public void addKfFee(FeeVO kfFee) {
        mapper.insert(kfFee);
    }

    @Override
    public List<KfFee> queryAll(FeeDataQuery query) {
        return mapper.selectAll(query);
    }

    @Override
    public List<KfFee> queryAllArrears(ArrearsQuery query) {
        return mapper.selectAllArrears(query);
    }
}
