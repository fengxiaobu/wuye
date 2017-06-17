package cn.rzhd.wuye.service;

import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/6.
 */
public interface IPropertyFeeService{
    /**
     * 添加物业费用数据
     * @param propertyFee
     */
    void addPropertyFee(FeeVO propertyFee);

    /**
     * 添加物业入驻费用
     * @param propertyFee
     */
    void addRzFee(FeeVO propertyFee);

    /**
     * 查询所有费用信息
     * @param query
     * @return
     */
    List<PropertyFee> queryAll(FeeDataQuery query);

    /**
     * 查询所有欠费记录
     * @param query
     * @return
     */
    List<PropertyFee> queryAllArrears(ArrearsQuery query);

    /**
     * 获得当期欠费数据及往期欠费数据
     * @param query
     * @return
     */
    Map<String, Object> queryForPay(ArrearsQuery query);

    /**
     * 入驻物业费用
     *
     * @param query
     * @return
     */
    List<PropertyFee> rzselectAll(FeeDataQuery query);

}
