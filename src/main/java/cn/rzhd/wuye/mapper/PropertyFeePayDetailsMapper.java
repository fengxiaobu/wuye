package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.PropertyFeePayDetails;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.PropertyFeePayDetailsQuery;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

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

    List<PropertyFeePayDetails> queryByProject(PropertyRecordsQuery query);

    List<Map<String, Object>> getByProject(PropertyRecordsQuery query);

    String getCostType(@Param("feeType") String feeType,@Param("pk_corp") String pk_corp);

    String getCompanyAccount(@Param("feeType") String feeType,@Param("pk_corp") String pk_corp);

    String getCompanyName(@Param("feeType") String feeType,@Param("pk_corp") String pk_corp);

    Integer countByQuery(PropertyRecordsQuery query);

    void changeStatusByRecordsId(String id);

    List<FeeVO> getFeeDataByRecordsId(String id);
}
