package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.KfFeePayDetails;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.KfFeePayDetailsQuery;
import cn.rzhd.wuye.vo.query.PropertyRecordsQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/1.
 */
@Mapper
public interface KfFeePayDetailsMapper {
    List<KfFeePayDetails> queryAll(KfFeePayDetailsQuery query);

    void insert(KfFeePayDetails details);

    void changeStatus(Long id);

    List<Map<String,Object>> getByProject(PropertyRecordsQuery query);

    String getCompanyAccount(@Param("feecode") String feecode,@Param("pk_corp") String pk_corp);

    String getCostType(@Param("feecode") String feecode,@Param("pk_corp") String pk_corp);

    String getCompanyName(@Param("feecode") String feecode,@Param("pk_corp") String pk_corp);

    Integer countByQuery(PropertyRecordsQuery query);

    void changeStatusByRecordsId(String id);

    List<FeeVO> getFeeDataByRecordsId(String id);

    void updateBillIdByRecordsId(@Param("id") String id,@Param("billId") String billid,@Param("billNo") String billno);
}
