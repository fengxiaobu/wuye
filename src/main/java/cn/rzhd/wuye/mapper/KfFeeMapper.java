package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.KfFee;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * Created by hasee on 2017/6/8.
 */
@Mapper
public interface KfFeeMapper {

    void insert(FeeVO kfFee);

    void insertRzFee(FeeVO kfFee);

    List<KfFee> selectAll(FeeDataQuery query);

    /**
     * 入驻开发费
     * @param query
     * @return
     */
    List<KfFee> selectAllRZ(FeeDataQuery query);

    List<KfFee> selectAllArrears(ArrearsQuery query);

    List<Map<String,String>> selectForPay(ArrearsQuery query);
}
