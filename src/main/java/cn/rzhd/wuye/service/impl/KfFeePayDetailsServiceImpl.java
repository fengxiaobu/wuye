package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.KfFeePayDetails;
import cn.rzhd.wuye.mapper.KfFeePayDetailsMapper;
import cn.rzhd.wuye.service.IKfFeePayDetailsService;
import cn.rzhd.wuye.vo.query.KfFeePayDetailsQuery;
import com.github.pagehelper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hasee on 2017/6/1.
 */
@Service
public class KfFeePayDetailsServiceImpl implements IKfFeePayDetailsService {
    @Autowired
    KfFeePayDetailsMapper mapper;

    @Override
    public List<KfFeePayDetails> queryAll(KfFeePayDetailsQuery query) {
        if (StringUtil.isNotEmpty(query.getStartDate()) && StringUtil.isNotEmpty(query.getEndDate())){
            return mapper.queryAll(query);
        }
        return null;
    }

    @Override
    public void addDetails(KfFeePayDetails details) {
        mapper.insert(details);
    }

    @Override
    public void changeStatus(Long id) {
        mapper.changeStatus(id);
    }
}
