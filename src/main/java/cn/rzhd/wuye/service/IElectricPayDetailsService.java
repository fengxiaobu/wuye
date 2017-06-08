package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.ElectricFeePayDetails;
import cn.rzhd.wuye.vo.query.UtilitiesQuery;

import java.util.List;

/**
 * Created by hasee on 2017/6/3.
 */
public interface IElectricPayDetailsService {

    List<ElectricFeePayDetails> queryAll(UtilitiesQuery query);
}
