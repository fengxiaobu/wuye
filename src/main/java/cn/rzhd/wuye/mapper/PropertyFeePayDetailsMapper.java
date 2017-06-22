package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.PropertyFeePayDetails;
import cn.rzhd.wuye.vo.query.PropertyFeePayDetailsQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by hasee on 2017/5/31.
 * 物业缴费记录
 */
@Mapper
public interface PropertyFeePayDetailsMapper {
    /**
     *  传入查询条件封装的对象进行查询并返回符合条件的List
     * @param query 封装物业开发缴费记录查询条件
     * @return  缴费记录详情List
     */
    List<PropertyFeePayDetails> queryAll(PropertyFeePayDetailsQuery query);

    void insert(PropertyFeePayDetails details);

    void changeStatus(Long id);
}
