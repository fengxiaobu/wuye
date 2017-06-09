package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.KfFeePayDetails;
import cn.rzhd.wuye.vo.query.KfFeePayDetailsQuery;

import java.util.List;

/**
 * Created by hasee on 2017/6/1.
 *
 */
public interface IKfFeePayDetailsService {

    List<KfFeePayDetails> queryAll(KfFeePayDetailsQuery query);
}
