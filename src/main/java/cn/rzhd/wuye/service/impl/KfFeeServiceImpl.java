package cn.rzhd.wuye.service.impl;

import cn.rzhd.wuye.bean.KfFee;
import cn.rzhd.wuye.mapper.KfFeeMapper;
import cn.rzhd.wuye.service.IKfFeeService;
import cn.rzhd.wuye.utils.FirstAndLastDay;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void addRzFee(FeeVO kfFee) {
        mapper.insertRzFee(kfFee);
    }

    @Override
    public List<KfFee> queryAll(FeeDataQuery query) {
        return mapper.selectAll(query);
    }

    @Override
    public List<KfFee> queryAllArrears(ArrearsQuery query) {
        return mapper.selectAllArrears(query);
    }

    @Override
    public Map<String, Object> queryForPay(ArrearsQuery query) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Map<String,Object> map = new HashMap<>();
        //设置条件查询当月欠费
        query.setStartDate(sdf.format(FirstAndLastDay.getFirstDay()));
        query.setEndDate(sdf.format(FirstAndLastDay.getNow()));
        List<Map<String, String>> current = mapper.selectForPay(query);
        //设置条件查询以往欠费
        query.setStartDate(null);
        query.setEndDate(sdf.format(FirstAndLastDay.getFirstDay()));
        List<Map<String, String>> past = mapper.selectForPay(query);

        BigDecimal currentSum = new BigDecimal(0);
        BigDecimal pastSum = new BigDecimal(0);
        for (Map<String, String> currentMap : current) {
            currentSum.add(new BigDecimal(currentMap.get("sum")));
            currentSum.add(new BigDecimal(currentMap.get("shouldSum")));
        }
        for (Map<String, String> pastMap : past) {
            pastSum.add(new BigDecimal(pastMap.get("sum")));
            pastSum.add(new BigDecimal(pastMap.get("shouldSum")));
        }
        //放入Map
        map.put("current",current);
        map.put("past",past);
        return map;
    }

    /**
     * 入驻开发费
     *
     * @param query
     * @return
     */
    @Override
    public List<KfFee> selectAllRZ(FeeDataQuery query) {
        return mapper.selectAllRZ(query);
    }


}
