package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.KfFee;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/8.
 */
public interface IKfFeeService {
    void addKfFee(FeeVO KfFee);

    void addRzFee(FeeVO kfFee);

    List<KfFee> queryAll(FeeDataQuery query);

    List<KfFee> queryAllArrears(ArrearsQuery query);

    Map<String, Object> queryForPay(ArrearsQuery query);

    /**
     * 入驻开发费
     *
     * @param query
     * @return
     */
    List<KfFee> selectAllRZ(FeeDataQuery query);

}
