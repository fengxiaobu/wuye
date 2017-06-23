package cn.rzhd.wuye.service;

import cn.rzhd.wuye.vo.query.PayFeeQuery;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Created by hasee on 2017/6/10.
 */
public interface IPayFeeService {
    /**
     * 用于判断是否有物业欠费
     * @param query
     * @return
     */
    Map<String, Object> isArrears(PayFeeQuery query);

    /**
     * 用于计算电费金额,并判断是否允许缴费
     * @param query
     * @return Map中两个key,status代表是否允许进入支付界面,msg代表不允许的提示信息
     */
    Map<String, Object> payElectricFee(PayFeeQuery query);

    /**
     * 用于得出限制缴费额度
     */
    Map<String, Object> amountLeft(PayFeeQuery query);

    /**
     * 用于计算水费金额
     * @param query
     * @return
     */
    BigDecimal payWaterFee(PayFeeQuery query);
}
