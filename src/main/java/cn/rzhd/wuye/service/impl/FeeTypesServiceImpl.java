package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.mapper.FeeTypesMapper;
import cn.rzhd.wuye.service.IFeeTypesService;
import cn.rzhd.wuye.vo.FeeitemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hasee on 2017/6/5.
 */
@Service
public class FeeTypesServiceImpl implements IFeeTypesService {
    @Autowired
    FeeTypesMapper mapper;


    @Override
    public void addFeeTypes(FeeitemVO feeTypes) {
        mapper.insert(feeTypes);
    }
}
