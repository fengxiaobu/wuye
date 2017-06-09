package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.KfFee;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;

import java.util.List;

/**
 * Created by hasee on 2017/6/8.
 */
public interface IKfFeeService {
    void addKfFee(FeeVO KfFee);

    List<KfFee> queryAll(FeeDataQuery query);

    List<KfFee> queryAllArrears(ArrearsQuery query);
}
