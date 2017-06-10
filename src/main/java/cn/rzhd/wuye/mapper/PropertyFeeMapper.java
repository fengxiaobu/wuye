package cn.rzhd.wuye.mapper;

import cn.rzhd.wuye.bean.PropertyFee;
import cn.rzhd.wuye.vo.FeeVO;
import cn.rzhd.wuye.vo.query.ArrearsQuery;
import cn.rzhd.wuye.vo.query.FeeDataQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PropertyFeeMapper {

    int insert(FeeVO record);

    int insertRzFee(FeeVO record);

    List<PropertyFee> selectAll(FeeDataQuery query);

    /**
     * 入驻物业费用
     *
     * @param query
     * @return
     */
    List<PropertyFee> rzselectAll(FeeDataQuery query);

    List<PropertyFee> selectAllArrears(ArrearsQuery query);

    List<Map<String,String>> selectForPay(ArrearsQuery query);
}